package dpcm.dpcmgr4jbranch.dataAccesLayer;

import dpcm.dpcmgr4jbranch.model.classes.Project;
import dpcm.dpcmgr4jbranch.model.classes.ProjectList;
import dpcm.dpcmgr4jbranch.model.direction.SQLexceptionHandler;

import java.sql.*;
import java.util.ArrayList;

public class SubTaskMapper {

    public String insertToSubTask(String subtaskName, String subtaskDescription,
                                  String subtaskTime, String subtaskPrice,
                                  String subtaskConsultantName, String subtaskDeadLine, String proId) {
        try {
            Project pro = new Project();
            Connection con = DBManager.getConnection();
            String SQL = "INSERT INTO sub_task (sub_task_name, sub_task_description, sub_task_time, sub_task_price, sub_task_consultant_name, sub_task_dead_line, pro_id) VALUES (?,?,?,?,?,?,?);";
            PreparedStatement ps = con.prepareStatement(SQL, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, subtaskName);
            ps.setString(2, subtaskDescription);
            ps.setString(3, subtaskTime);
            ps.setString(4, subtaskPrice);
            ps.setString(5, subtaskConsultantName);
            ps.setString(6, subtaskDeadLine);
            ps.setString(7, pro.getProjectId());
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            //rs.next();
            System.out.println(rs);
            return "virk sååå!";


        } catch (SQLException exception) {
            exception.printStackTrace();

        }

        return "OnlyStrings";
    }

    public ArrayList<ProjectList> detailsrequest() throws SQLexceptionHandler {
        try {
            Project project = new Project();
            String qId = project.getProjectId();
            Connection con = DBManager.getConnection();
            String SQLdetail = "SELECT * FROM project JOIN sub_task WHERE project_id = "
                    + qId + ";";
            PreparedStatement pr = con.prepareStatement(SQLdetail, Statement.RETURN_GENERATED_KEYS);
            ResultSet rs = pr.executeQuery();
            System.out.println(rs);
            ArrayList<ProjectList> pDetails = new ArrayList<>();
            while (rs.next()) {
                String projectId = rs.getString(1);
                String projectName = rs.getString(2);
                String consultantName = rs.getString(3);
                ProjectList projectlist = new ProjectList(projectId, projectName, consultantName);
                pDetails.add(projectlist);
                System.out.println(pDetails);
                System.out.println(projectlist);
            }
            return pDetails;
        } catch (SQLException ex) {
            throw new SQLexceptionHandler(ex.getMessage());

        }
    }
}