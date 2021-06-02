package dpcm.dpcmgr4jbranch.dataAccesLayer;

import dpcm.dpcmgr4jbranch.model.classes.Project;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProjectMapperTest {

    @Test
    void insertToProject() {
        Project test = new Project();
        test.setProjectName("JunitTestProject");
    }
}