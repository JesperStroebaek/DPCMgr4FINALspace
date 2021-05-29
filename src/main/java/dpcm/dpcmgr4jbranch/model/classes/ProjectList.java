package dpcm.dpcmgr4jbranch.model.classes;

import java.util.List;

public class ProjectList {

    private int projectId;
    private String projectName;
    private String consultantName;

    public ProjectList(int projectId, String projectName, String consultantName) {
        this.projectId = projectId;
        this.projectName = projectName;
        this.consultantName = consultantName;
    }

    public List<ProjectList> projects()
    {
        return projects();

    }


    public int getProjectId() {
        return projectId;
    }

    public void setProjectId(int projectId) {
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
        return "ProjectList{" +
                "projectId=" + projectId +
                ", projectName='" + projectName + '\'' +
                ", consultantName='" + consultantName + '\'' +
                '}';
    }
}
