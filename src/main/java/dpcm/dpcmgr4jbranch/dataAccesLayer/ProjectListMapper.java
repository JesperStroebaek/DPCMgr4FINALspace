package dpcm.dpcmgr4jbranch.dataAccesLayer;

import dpcm.dpcmgr4jbranch.model.classes.Project;
import dpcm.dpcmgr4jbranch.model.classes.ProjectList;
import dpcm.dpcmgr4jbranch.model.direction.SQLexceptionHandler;

import java.sql.*;
import java.util.ArrayList;


public class ProjectListMapper {


    public ArrayList<ProjectList> projectListArrayList() throws SQLexceptionHandler {
        try {
            Project project = new Project();
            Connection con = DBManager.getConnection();
            String SQLArray = "SELECT project_id, project_name, consultant_name FROM project ;";
            PreparedStatement pr = con.prepareStatement(SQLArray, Statement.RETURN_GENERATED_KEYS);
            ResultSet rs = pr.executeQuery();
            ArrayList<ProjectList> projectlisten = new ArrayList<>();
            while (rs.next()){
                int projectId = rs.getInt(1);
                String projectName = rs.getString(2);
                String consultantName = rs.getString(3);
                ProjectList projectlist = new ProjectList(projectId, projectName, consultantName);
                projectlisten.add(projectlist);
                //TODO Hej Robert vi sakl have vores projectId + projectName til at stå på vores project_list i vores HTML men vi har prøvet alt
                //System.out.println(projectlist);


            }
            return projectlisten;
        } catch (SQLException ex) {
            throw new SQLexceptionHandler(ex.getMessage());
        }
    }
    public ArrayList<ProjectList> detailsrequest() throws SQLexceptionHandler {
        try {
            Project project = new Project();
            project.setqId("9");
            Connection con = DBManager.getConnection();
            String SQLdetail = "SELECT project_id, project_name, consultant_name FROM project where project_id=" + project.getqId() +";";
            PreparedStatement pr = con.prepareStatement(SQLdetail, Statement.RETURN_GENERATED_KEYS);
            ResultSet rs = pr.executeQuery();
            ArrayList<ProjectList> projectlisten = new ArrayList<>();
            while (rs.next()){
                int projectId = rs.getInt(1);
                String projectName = rs.getString(2);
                String consultantName = rs.getString(3);
                ProjectList projectlist = new ProjectList(projectId, projectName, consultantName);
                projectlisten.add(projectlist);
                System.out.println(projectlist);
            }
            return projectlisten;
        } catch (SQLException ex) {
            throw new SQLexceptionHandler(ex.getMessage());
        }
    }

}
