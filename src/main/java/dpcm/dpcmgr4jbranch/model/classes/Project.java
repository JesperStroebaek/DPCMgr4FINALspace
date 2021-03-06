package dpcm.dpcmgr4jbranch.model.classes;

import java.util.ArrayList;
import java.util.Date;

public class Project
{
    // + Atributter (encapsulation, dataType, variable). og en arraylist.
    private String projectId;
    private String projectName;
    private String projectDescription;
    private String totalProjectTime;
    private String consultantName;
    private String startDate;
    private String deadLine;
    private String qId;

    // + konstrukter (tom).
    public Project() {}

    // + Konstrukter med parameter.
    public Project(String projectName, String projectDescription, String consultantName, String startDate, String deadLine) {
        this.projectName = projectName;
        this.projectDescription = projectDescription;
        this.consultantName = consultantName;
        this.startDate = startDate;
        this.deadLine = deadLine;
    }
    // + metoder med getters og setters
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public String getTotalProjectTime() {
        return totalProjectTime;
    }

    public void setTotalProjectTime(String totalProjectTime) {
        this.totalProjectTime = totalProjectTime;
    }

    public String getConsultantName() {
        return consultantName;
    }

    public void setConsultantName(String consultantName) {
        this.consultantName = consultantName;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getDeadLine() {
        return deadLine;
    }

    public void setDeadLine(String deadLine) {
        this.deadLine = deadLine;
    }

    public String getProjectDescription() {
        return projectDescription;
    }

    public void setProjectDescription(String projectDescription) {
        this.projectDescription = projectDescription;
    }

    public String getqId() {
        return qId;
    }

    public void setqId(String qId) {
        this.qId = qId;
    }

    // + Metode String toString.
    @Override
    public String toString()
    {
        return "Id: " + projectId + "Project Name: " + projectName + "projectDescription: " + projectDescription + "totalProjectTime: " + totalProjectTime + "consultantName: " + consultantName + "startDate: " + startDate + "deadLine: " + deadLine + "qId: " + qId;
    }
}