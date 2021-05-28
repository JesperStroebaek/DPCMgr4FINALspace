package dpcm.dpcmgr4jbranch.dataAccesLayer;

import dpcm.dpcmgr4jbranch.model.classes.List;
import dpcm.dpcmgr4jbranch.model.classes.Project;
import dpcm.dpcmgr4jbranch.model.direction.SQLexceptionHandler;

import java.sql.*;
import java.util.ArrayList;


public class ListMapper {

    public ArrayList<List> projectListArrayList() throws SQLexceptionHandler {
        try {
            Connection con = DBManager.getConnection();
            String SQL = "SELECT project_id, project_name FROM project;";
            PreparedStatement pr = con.prepareStatement(SQL, Statement.RETURN_GENERATED_KEYS);
            ResultSet rs = pr.executeQuery();
            ArrayList<List> projectlist = new ArrayList<>();
            while (rs.next()){
                int projectId = rs.getInt(1);
                String projectName = rs.getString(2);
                List list = new List (projectId, projectName);
                projectlist.add(list);
                //TODO Hej Robert vi sakl have vores projectId + projectName til at stå på vores project_list i vores HTML men vi har prøvet alt
                System.out.println(list);


            }
            return projectlist;
        } catch (SQLException ex) {
            throw new SQLexceptionHandler(ex.getMessage());
        }
    }

}
