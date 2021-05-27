package dpcm.dpcmgr4jbranch.model.direction;

import dpcm.dpcmgr4jbranch.dataAccesLayer.DataFacade;
import dpcm.dpcmgr4jbranch.model.classes.*;

import java.sql.SQLException;

//

public class LoginHandler
{

    public Project project(String consultantName, String projectName, String startDate,
                           String deadLine, String projectDescription, String subTaskName,
                           String subTaskDescription, String subTaskTime){

        Project project = new Project(consultantName, projectName,startDate,
                                        deadLine,projectDescription,subTaskName,
                subTaskDescription,subTaskTime);

        return project;
    }


   /*  private DataFacade facade = new DataFacade();

    public LoginHandler(DataFacade facade)
    {
        this.facade = facade;
    }

   public Consultant login(int id, String consultantName, String password) {
        return facade.login(id, consultantName, password);
    }

    public Project createProject(String projectName,int projectId,String projectDescription,double totalProjectTime,int numberOftask) throws SQLException {
        Project project = new Project(projectName,projectId,projectDescription,totalProjectTime,numberOftask);
        facade.insertToProject(project);
        return project;
    }

    */




}
