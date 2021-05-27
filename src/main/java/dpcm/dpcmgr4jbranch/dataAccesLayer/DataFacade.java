package dpcm.dpcmgr4jbranch.dataAccesLayer;

import dpcm.dpcmgr4jbranch.model.classes.Project;

import java.sql.SQLException;

/* Datafacaden er vores knude punkt. Her kører kommunikationen fra omverdenen igennem.
for at skjule vores backend for udefrakommende */
public class DataFacade {

    ProjectMapper projectMapper = new ProjectMapper();
    private ConsultantMapper consultantMapper = new ConsultantMapper();


    public void insertToProject(String projectName, String projectDescription/* int totalProjectTime*/, String consultantName, String startDate, String deadLine) throws SQLException {

    }


    }

   /* public Consultant login(int id, String consulentName, String password) {
        return ConsultantMapper.login(id, consulentName, password);
    }


    public Project insertToProject(Project project) throws SQLException {
        ProjectMapper.insertToProject();
        return project;
    }



    */




