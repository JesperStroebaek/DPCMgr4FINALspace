package dpcm.dpcmgr4jbranch.dataAccesLayer;


import dpcm.dpcmgr4jbranch.model.classes.Project;
import dpcm.dpcmgr4jbranch.model.direction.SQLexceptionHandler;

import java.sql.*;


public class ProjectMapper
{

    public int insertToProject(String projectName, String projectDescription, String consultantName, String startDate, String deadLine) throws Exception {
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
        } catch (SQLException ex) {
            throw new Exception(ex.getMessage());
        }
    }






}
