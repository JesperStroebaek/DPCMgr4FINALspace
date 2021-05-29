package dpcm.dpcmgr4jbranch.dataAccesLayer;

import dpcm.dpcmgr4jbranch.model.classes.ProjectList;
import dpcm.dpcmgr4jbranch.model.direction.SQLexceptionHandler;

import java.sql.*;
import java.util.ArrayList;


public class ProjectListMapper {

    public ArrayList<ProjectList> projectListArrayList() throws SQLexceptionHandler {
        try {
            Connection con = DBManager.getConnection();
            String SQL = "SELECT project_id, project_name, consultant_name FROM project;";
            PreparedStatement pr = con.prepareStatement(SQL, Statement.RETURN_GENERATED_KEYS);
            ResultSet rs = pr.executeQuery();
            ArrayList<ProjectList> detailsArray = new ArrayList<>();
            while (rs.next()){
                int projectId = rs.getInt(1);
                String projectName = rs.getString(2);
                String consultantName = rs.getString(3);
                ProjectList pDetails = new ProjectList(projectId, projectName, consultantName);
                detailsArray.add(pDetails);
                //TODO Hej Robert vi sakl have vores projectId + projectName til at stå på vores project_list i vores HTML men vi har prøvet alt
                //System.out.println(detailsArray);


            }
            return detailsArray;
        } catch (SQLException ex) {
            throw new SQLexceptionHandler(ex.getMessage());
        }
    }

}
