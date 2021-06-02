package dpcm.dpcmgr4jbranch.model.classes;

import java.util.List;

public class ProjectList {
    // + Atributter (encapsulation, dataType, variable).
    private String projectId;
    private String projectName;
    private String consultantName;

    // + konstrukter (tom).
    public ProjectList() {}

    // + Konstrukter med parameter.
    public ProjectList(String projectId, String projectName, String consultantName) {
        this.projectId = projectId;
        this.projectName = projectName;
        this.consultantName = consultantName;
    }
    // + metode
    public List<ProjectList> projects() {
        return projects();

    }

    // + metoder med getters og setters
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

    // + Metode String toString.
    @Override
    public String toString() {
        return "projectId: " + projectId + "\n" + "projectName: " + projectName;
    }
}
