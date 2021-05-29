package dpcm.dpcmgr4jbranch;

import dpcm.dpcmgr4jbranch.dataAccesLayer.ProjectListMapper;
import dpcm.dpcmgr4jbranch.model.direction.SQLexceptionHandler;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DpcMgr4JBranchApplication {

    public static void main(String[] args) throws SQLexceptionHandler {
        SpringApplication.run(DpcMgr4JBranchApplication.class, args);
        ProjectListMapper projectListMapper = new ProjectListMapper();
        projectListMapper.detailsrequest();




    }

}
