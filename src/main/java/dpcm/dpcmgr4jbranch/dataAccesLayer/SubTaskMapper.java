package dpcm.dpcmgr4jbranch.dataAccesLayer;

import java.sql.*;

public class SubTaskMapper {

    public int insertToSubTask(String suptaskName,  String subtaskDesripion,
                               int intsubtaskTime, double doublesubtaskPrice,
                               String subtaskConsultantnName, String subtaskDeadLine ) {
        try {
            Connection con = DBManager.getConnection();
            String SQL = "INSERT INTO sub_task (sub_task_name, sub_task_description, sub_task_time, sub_task_price, sub_task_consultant_name, sub_task_dead_line) VALUES (?,?,?,?,?,?,?);";
            PreparedStatement ps = con.prepareStatement(SQL, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, suptaskName);
            ps.setString(2, subtaskDesripion);
            ps.setInt(3, intsubtaskTime);
            ps.setDouble(4, doublesubtaskPrice);
            ps.setString(5, subtaskConsultantnName);
            ps.setString(6, subtaskDeadLine);
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            rs.next();
            int proId = rs.getInt(1);
            return proId;
        } catch (SQLException exception) {
            exception.printStackTrace();

        }
    return -1;
    }
}
