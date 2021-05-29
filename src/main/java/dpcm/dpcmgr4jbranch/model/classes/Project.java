package dpcm.dpcmgr4jbranch.model.classes;

import java.util.ArrayList;
import java.util.Date;

public class Project
{
    //Atributter (encapsulation, dataType, variable). og en arraylist.

    private int projectId;
    private String projectName;
    private String projectDescription;
    private int totalProjectTime;
    private String consultantName;
    private String startDate;
    private String deadLine;
    private String qId;



    // konstrukter (tom).
    public Project() {}



    public Project(String projectName, String projectDescription, String consultantName, String startDate, String deadLine) {
        this.projectName = projectName;
        this.projectDescription = projectDescription;
        this.consultantName = consultantName;
        this.startDate = startDate;
        this.deadLine = deadLine;
    }


    public int getProjectId() {
        return projectId;
    }

    public void setProjectId(int projectId) {
        this.projectId = projectId;
    }

    public int getTotalProjectTime() {
        return totalProjectTime;
    }

    public void setTotalProjectTime(int totalProjectTime) {
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
}