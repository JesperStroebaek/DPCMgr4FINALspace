package dpcm.dpcmgr4jbranch.dataAccesLayer;

import dpcm.dpcmgr4jbranch.model.classes.Project;
import org.springframework.stereotype.Service;

import java.sql.SQLException;

/* Datafacaden er vores knude punkt. Her kører kommunikationen fra omverdenen igennem.
for at skjule vores backend for udefrakommende */
@Service
public class DataFacade {


    ProjectMapper projectMapper = new ProjectMapper();
    SubTaskMapper subTaskMapper = new SubTaskMapper();
    private ConsultantMapper consultantMapper = new ConsultantMapper();


    public int createProject(String projectName, String projectDescription, String consultantName, String startDate, String deadLine) throws Exception {

        return  projectMapper.insertToProject(projectName, projectDescription, consultantName, startDate, deadLine);

    }

    public int createSubTask(String suptaskName, String subtaskDesripion, String subtaskTime, String subtaskPrice, String subtaskConsultantnName, String subtaskDeadLine ){
        // Her laver vi string om til int og double
        int intsubtaskTime = Integer.parseInt(subtaskTime);
        double doublesubtaskPrice = Double.parseDouble(subtaskPrice);

        return subTaskMapper.insertToSubTask( suptaskName,  subtaskDesripion,  intsubtaskTime, doublesubtaskPrice, subtaskConsultantnName, subtaskDeadLine );
    }

    public Project getProjectFromId(int projectId) {
    return null;
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




