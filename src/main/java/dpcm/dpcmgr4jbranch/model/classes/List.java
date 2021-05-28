package dpcm.dpcmgr4jbranch.model.classes;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class List {
    private int projectId;
    private String projectName;
    public ArrayList<Project> projects = new ArrayList<>();


    public List(int projectId, String projectName) {
        this.projectId = projectId;
        this.projectName = projectName;
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

    @Override
    public String toString() {
        return "List{" +
                "projectId=" + projectId +
                ", projectName='" + projectName + '\'' +
                '}';
    }
}
