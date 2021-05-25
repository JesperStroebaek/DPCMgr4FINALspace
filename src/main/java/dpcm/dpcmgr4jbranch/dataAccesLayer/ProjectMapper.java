package dpcm.dpcmgr4jbranch.dataAccesLayer;


import dpcm.dpcmgr4jbranch.dataAccesLayer.DBManager;
import dpcm.dpcmgr4jbranch.model.direction.SQLexceptionHandler;

import java.sql.*;


public class ProjectMapper
{
    public static String readFromProject() throws SQLexceptionHandler {
        String ename = null;
        try {
            Connection con = DBManager.getConnection();
            Statement statement = con.createStatement();
            String sql = "SELECT * from project";
            ResultSet rs = statement.executeQuery(sql);
            while (rs.next())
            {
                String p_nameCol1 = rs.getString(1);
                int p_idCol2 = rs.getInt(2);
                String p_descriptionCol3 = rs.getString(3);
                int p_totalTimeCol4 = rs.getInt(4);
                int p_nrOfTasksCol5 = rs.getInt(5);
                String myQ = p_nameCol1+p_idCol2+p_descriptionCol3+p_totalTimeCol4+p_nrOfTasksCol5;
                System.out.print(p_nameCol1+p_idCol2+p_descriptionCol3+p_totalTimeCol4+p_nrOfTasksCol5);
                System.out.println(myQ);
            }
            System.out.println(rs);
        } catch (SQLException ex) {
           throw new SQLexceptionHandler(ex.getMessage());
        }
            return "It works!";

    }

    public static void insertToProject() throws SQLException {
        String qPc1 = "name"; // string fra 'form, create_project'
        int qPc2 = 0; // int fra 'form, create_project'
        String qPc3 = "descr"; // string fra 'form, create_project'
        int qPc4 = 0; // string fra 'form, create_project'
        int qPc5 = 0; // string fra 'form, create_project'
        Connection con = DBManager.getConnection();
        String insertsql = "INSERT INTO project (project_name, project_id,project_description,total_project_time,project_number_of_tasks) VALUES (?,?,?,?,?);";
        PreparedStatement ps = con.prepareStatement(insertsql);
        
        ps.setString(1, qPc1);
        ps.setInt(2,qPc2);
        ps.setString(3, qPc3);
        ps.setInt(4,qPc4);
        ps.setInt(5,qPc5);
        ps.executeUpdate();
    }
}
