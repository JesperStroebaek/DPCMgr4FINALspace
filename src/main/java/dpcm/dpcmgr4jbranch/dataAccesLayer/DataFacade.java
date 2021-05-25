package dpcm.dpcmgr4jbranch.dataAccesLayer;

/* Datafacaden er vores knude punkt. Her kører kommunikationen fra omverdenen igennem.
for at skjule vores backend for udefrakommende */
public class DataFacade {
    private ConsultantMapper consultantMapper = new ConsultantMapper();

}
   /* public Consultant login(int id, String consulentName, String password) {
        return ConsultantMapper.login(id, consulentName, password);
    }


    public Project insertToProject(Project project) throws SQLException {
        ProjectMapper.insertToProject();
        return project;
    }



    */




