package dpcm.dpcmgr4jbranch.dataAccesLayer;

import dpcm.dpcmgr4jbranch.model.classes.Project;
import dpcm.dpcmgr4jbranch.model.classes.ProjectList;
import dpcm.dpcmgr4jbranch.model.direction.SQLexceptionHandler;

import java.sql.*;
import java.util.ArrayList;


public class ProjectListMapper {


    private int projectId;

    public ArrayList<ProjectList> pListArrayList() throws SQLexceptionHandler {
        try {
            //Project project = new Project();
            Connection con = DBManager.getConnection();
            String SQLArray = "SELECT project_id, project_name, consultant_name FROM project ;";
            PreparedStatement pr = con.prepareStatement(SQLArray, Statement.RETURN_GENERATED_KEYS);
            ResultSet rs = pr.executeQuery();
            ArrayList<ProjectList> pListArray = new ArrayList<>();
            while (rs.next()){
                String projectId = rs.getString(1);
                String projectName = rs.getString(2);
                String consultantName = rs.getString(3);
                ProjectList projectlist = new ProjectList(projectId, projectName, consultantName);
                pListArray.add(projectlist);
                //TODO Hej Robert vi sakl have vores projectId + projectName til at stå på vores project_list i vores HTML men vi har prøvet alt
                //System.out.println(pListArray);


            }
            return pListArray;
        } catch (SQLException ex) {
            throw new SQLexceptionHandler(ex.getMessage());
        }
    }
    public ArrayList<ProjectList> detailsrequest() throws SQLexceptionHandler {
        try {
            Project project = new Project();
            String qId = project.getProjectId();
            Connection con = DBManager.getConnection();
            String SQLdetail = "SELECT * FROM project JOIN sub_task WHERE project_id = "
                    + qId +";";
            PreparedStatement pr = con.prepareStatement(SQLdetail, Statement.RETURN_GENERATED_KEYS);
            ResultSet rs = pr.executeQuery();
            System.out.println(rs);
            ArrayList<ProjectList> pDetails = new ArrayList<>();
            while (rs.next()){
                String projectId = rs.getString(1);
                String projectName = rs.getString(2);
                String consultantName = rs.getString(3);
                ProjectList projectlist = new ProjectList(projectId, projectName, consultantName);
                pDetails.add(projectlist);
                //System.out.println(pDetails);
                //System.out.println(projectlist);
            }
            return pDetails;
        } catch (SQLException ex) {
            throw new SQLexceptionHandler(ex.getMessage());
        }
    }

}
