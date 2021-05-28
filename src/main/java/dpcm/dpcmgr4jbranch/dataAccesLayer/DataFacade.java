package dpcm.dpcmgr4jbranch.dataAccesLayer;

import dpcm.dpcmgr4jbranch.model.classes.Project;
import dpcm.dpcmgr4jbranch.model.direction.SQLexceptionHandler;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
import java.util.ArrayList;

/* Datafacaden er vores knude punkt. Her kører kommunikationen fra omverdenen igennem.
for at skjule vores backend for udefrakommende */
@Service
public class DataFacade {


    ProjectMapper projectMapper = new ProjectMapper();
    SubTaskMapper subTaskMapper = new SubTaskMapper();
    ListMapper listMapper = new ListMapper();
    private ConsultantMapper consultantMapper = new ConsultantMapper();


    public int createProject(String projectName, String projectDescription, String consultantName, String startDate, String deadLine) throws Exception {

        return  projectMapper.insertToProject(projectName, projectDescription, consultantName, startDate, deadLine);

    }

    public int createSubTask(String subtaskName, String subtaskDescription, String subtaskTime, String subtaskPrice, String subtaskConsultantName, String subtaskDeadLine ){
        // Her laver vi string om til int og double
        int intsubtaskTime = Integer.parseInt(subtaskTime);
        double doublesubtaskPrice = Double.parseDouble(subtaskPrice);

        return subTaskMapper.insertToSubTask( subtaskName,  subtaskDescription,  intsubtaskTime, doublesubtaskPrice, subtaskConsultantName, subtaskDeadLine );
    }

    public ArrayList projectList() throws SQLexceptionHandler {

        return listMapper.projectListArrayList();
    }


}





