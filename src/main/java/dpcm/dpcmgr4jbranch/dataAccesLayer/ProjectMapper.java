package dpcm.dpcmgr4jbranch.dataAccesLayer;


import dpcm.dpcmgr4jbranch.model.classes.Project;
import dpcm.dpcmgr4jbranch.model.direction.SQLexceptionHandler;

import java.sql.*;


public class ProjectMapper
{

    public String getProject() throws SQLexceptionHandler {
        try {
            Connection con = DBManager.getConnection();
            Statement statement = con.createStatement();
            String SQL = "SELECT * from project";
            PreparedStatement pr = con.prepareStatement(SQL, Statement.RETURN_GENERATED_KEYS);
            ResultSet rs = pr.executeQuery();

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
            return "";

    }

    public int insertToProject(String projectName, String projectDescription, String consultantName, String startDate, String deadLine) {
        try {
            Connection con = DBManager.getConnection();
            String SQL = "INSERT INTO project (project_name, project_description, consultant_name, start_date, dead_line ) VALUES (?,?,?,?,?)";
            PreparedStatement ps = con.prepareStatement(SQL, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, projectName);
            ps.setString(2, projectDescription);
            ps.setString(3, consultantName);
            ps.setString(4, startDate);
            ps.setString(5, deadLine);
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            rs.next();
            int projectId = rs.getInt(1);
            return projectId;
        } catch (SQLException exception) {
            exception.printStackTrace();

        }
        return -1;
    }


}
