package dpcm.dpcmgr4jbranch.model.classes;

import java.util.ArrayList;
import java.util.Date;

public class Project
{
    //Atributter (encapsulation, dataType, variable). og en arraylist.

    private String consultantName;

    private String projectName;
    private String startDate;
    private String deadLine;
    private String projectDescription;
    private String subTaskName;
    private String subTaskDescription;
    private String subTaskTime;

   // private ArrayList<Project> projectArrayList;

    // konstrukter (tom).
    public Project() {}

    // Konstrukter med parameter. finder det project vi skal have fat i.
    public Project (String consultantName,String projectName,String startDate, String deadLine, String projectDescription, String subTaskName,
                    String subTaskDescription, String subTaskTime)
    {
        this.consultantName = consultantName;

        this.projectName = projectName;
        this.deadLine = deadLine;
        this.startDate = startDate;
        this.projectDescription = projectDescription;
        this.subTaskName = subTaskName;
        this.subTaskDescription = subTaskDescription;
        this.subTaskTime = subTaskTime;
    }


    // Konstrukter med parameter. og en arrayList.
  /*  public Project(String projectName, int projectId, String projectDescription, double totalProjectTime, int numberOfTask) {
    {
        this.projectName = projectName;
        this.projectId = projectId;
        this.projectDescription = projectDescription;
        this.totalProjectTime = totalProjectTime;
        this.numberOfTask = numberOfTask;

    }


   */


    // Metoder Getter og Setter.


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

    public String getSubTaskName() {
        return subTaskName;
    }

    public void setSubTaskName(String subTaskName) {
        this.subTaskName = subTaskName;
    }

    public String getSubTaskDescription() {
        return subTaskDescription;
    }

    public void setSubTaskDescription(String subTaskDescription) {
        this.subTaskDescription = subTaskDescription;
    }

    public String getSubTaskTime() {
        return subTaskTime;
    }

    public void setSubTaskTime(String subTaskTime) {
        this.subTaskTime = subTaskTime;
    }

    // Metode String toString.
    @Override
    public String toString()
    {
        return "consultantName: "+consultantName+"ProjectName: " + projectName+"startDate: "+startDate + "deadLine: "
                + deadLine+"ProjectDescription: " + projectDescription
                + "subTaskName: "+subTaskName+"subTaskDescription: "+subTaskDescription+"subTaskTime: "+subTaskTime;
    }


}