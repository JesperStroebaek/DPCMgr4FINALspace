package dpcm.dpcmgr4jbranch.dataAccesLayer;

import dpcm.dpcmgr4jbranch.model.classes.Project;
import dpcm.dpcmgr4jbranch.model.classes.ProjectList;
import dpcm.dpcmgr4jbranch.model.direction.SQLexceptionHandler;

import java.sql.*;
import java.util.ArrayList;

public class SubTaskMapper {

    public String insertToSubTask(String subtaskName, String subtaskDescription,
                                  int subtaskTime, String subtaskPrice,
                                  String subtaskConsultentName, String subtaskDeadLine, String proId) {
        try {
            Project pro = new Project();
            Connection con = DBManager.getConnection();
            String SQL = "INSERT INTO sub_task (sub_task_name, sub_task_description, sub_task_time, sub_task_price, sub_task_consultent_name, sub_task_dead_line, pro_id) VALUES (?,?,?,?,?,?,?);";
            PreparedStatement ps = con.prepareStatement(SQL, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, subtaskName);
            ps.setString(2, subtaskDescription);
            ps.setInt(3, subtaskTime);
            ps.setString(4, subtaskPrice);
            ps.setString(5, subtaskConsultentName);
            ps.setString(6, subtaskDeadLine);
            ps.setString(7, pro.getProjectId());
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            rs.next();
            //System.out.println(rs);
            return "insert to details exec";

        } catch (SQLException exception) {
            exception.printStackTrace();
        }
        return "OnlyStrings";
    }

}