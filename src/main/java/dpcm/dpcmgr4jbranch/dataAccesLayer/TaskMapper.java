package dpcm.dpcmgr4jbranch.dataAccesLayer;

import dpcm.dpcmgr4jbranch.model.direction.SQLexceptionHandler;

import java.sql.*;



            'Tpt'
 INT 'total project time' = sum('subtask time' where 'pro id' = 'prject id' agtigt)




public class TaskMapper {
    public static void insertToProject() throws SQLException {

        String qPc1 = "project.getProjectName()";
        String qPc2 = "project.getConsultantName()";
        String qPc3 = "project.getProjectDescription()";
        String qPc4 = "12345";
        String qPc5 = "123456";
        Connection con = DBManager.getConnection();
        String insertsql = "INSERT INTO project (project_name,project_description,Consultant_Name,start_date, dead_Line) VALUES (?,?,?,?,?);";
        PreparedStatement ps = con.prepareStatement(insertsql);

        ps.setString(1, qPc1);
        ps.setString(2,qPc2);
        ps.setString(3, qPc3);
        ps.setString(4,qPc4);
        ps.setString(5,qPc5);
        ps.executeUpdate();
    }

    public static String readSQL() throws SQLexceptionHandler {
        try {
            Connection con = DBManager.getConnection();
            Statement statement = con.createStatement();
            String sql = "SELECT * from project";
            ResultSet rs = statement.executeQuery(sql);
            while (rs.next())
            {
                String p_nameCol1 = rs.getString(1);
                String p_idCol2 = rs.getString(2);
                String p_descriptionCol3 = rs.getString(3);
                String p_totalTimeCol4 = rs.getString(4);
                String p_nrOfTasksCol5 = rs.getString(5);

                String myQ = p_nameCol1 + p_idCol2 + p_descriptionCol3 + p_totalTimeCol4 + p_nrOfTasksCol5;

                System.out.print(p_nameCol1 + p_idCol2 + p_descriptionCol3 + p_totalTimeCol4 + p_nrOfTasksCol5);

                System.out.println(myQ);
            }
            System.out.println(rs);
        } catch (SQLException ex) {
            throw new SQLexceptionHandler(ex.getMessage());
        }
        return "It works!";

    }
}
