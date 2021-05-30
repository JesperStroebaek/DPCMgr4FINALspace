package dpcm.dpcmgr4jbranch.model.classes;

import java.util.List;

public class ProjectList {

    private String projectId;
    private String projectName;
    private String consultantName;




    public ProjectList(String projectId, String projectName, String consultantName) {
        this.projectId = projectId;
        this.projectName = projectName;
        this.consultantName = consultantName;
    }

    public List<ProjectList> projects() {
        return projects();

    }


    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getConsultantName() {
        return consultantName;
    }

    public void setConsultantName(String consultantName) {
        this.consultantName = consultantName;
    }

    @Override
    public String toString() {
        return "projectId: " + projectId + "\n" + "projectName: " + projectName;
    }
}
