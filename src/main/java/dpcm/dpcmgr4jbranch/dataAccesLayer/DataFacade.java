package dpcm.dpcmgr4jbranch.dataAccesLayer;

import dpcm.dpcmgr4jbranch.model.classes.ProjectList;
import dpcm.dpcmgr4jbranch.model.direction.SQLexceptionHandler;
import org.springframework.stereotype.Service;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/* Datafacaden er vores knude punkt. Her kører kommunikationen fra omverdenen igennem.
for at skjule vores backend for udefrakommende */
@Service
public class DataFacade {


    ProjectMapper projectMapper = new ProjectMapper();
    SubTaskMapper subTaskMapper = new SubTaskMapper();
    ProjectListMapper listMapper = new ProjectListMapper();
    private ConsultantMapper consultantMapper = new ConsultantMapper();


    public int createProject(String projectName, String projectDescription, String consultantName, String startDate, String deadLine) throws Exception {

        return  projectMapper.insertToProject(projectName, projectDescription, consultantName, startDate, deadLine);

    }

    public String createSubTask(String subtaskName, String subtaskDescription, String subtaskTime, String subtaskPrice, String subtaskConsultantName, String subtaskDeadLine, String proId ){
        // Her laver vi string om til int og double

       // double doublesubtaskPrice = Double.parseDouble(subtaskPrice);

        return subTaskMapper.insertToSubTask( subtaskName,  subtaskDescription,  subtaskTime, subtaskPrice, subtaskConsultantName, subtaskDeadLine, proId );
    }

    public List<ProjectList> listMapMetode () throws SQLexceptionHandler {

        return listMapper.pListArrayList();

    }


}





