package dpcm.dpcmgr4jbranch;

import dpcm.dpcmgr4jbranch.dataAccesLayer.ListMapper;
import dpcm.dpcmgr4jbranch.dataAccesLayer.ProjectMapper;
import dpcm.dpcmgr4jbranch.model.direction.SQLexceptionHandler;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.sql.SQLException;

@SpringBootApplication
public class DpcMgr4JBranchApplication {

    public static void main(String[] args) throws SQLexceptionHandler {
        SpringApplication.run(DpcMgr4JBranchApplication.class, args);
       /* ListMapper listMapper = new ListMapper();
        listMapper.getList();
        //sql.insert();

        */
        ProjectMapper projectMapper = new ProjectMapper();
        projectMapper.getProject();

    }

}
