package dpcm.dpcmgr4jbranch.model.classes;

import java.util.ArrayList;
import java.util.Date;

public class Project
{
    //Atributter (encapsulation, dataType, variable). og en arraylist.
    private String projectName;
    private Date deadLine;
    private String projectDescription;
    private int projectId;
    private double totalProjectTime;
    private int numberOfTask;
   // private ArrayList<Project> projectArrayList;

    // konstrukter (tom).
    public Project() {}

    // Konstrukter med parameter. finder det project vi skal have fat i.
    public Project (String projectName,Date deadLine, String projectDescription, int projectId, double totalProjectTime, int numberOfTask)
    {
        this.projectName = projectName;
        this.deadLine = deadLine;
        this.projectDescription = projectDescription;
        this.projectId = projectId;
        this.totalProjectTime = totalProjectTime;
        this.numberOfTask = numberOfTask;
    }


    // Konstrukter med parameter. og en arrayList.
    public Project(String projectName, int projectId, String projectDescription, double totalProjectTime, int numberOfTask) {
    {
        this.projectName = projectName;
        this.projectId = projectId;
        this.projectDescription = projectDescription;
        this.totalProjectTime = totalProjectTime;
        this.numberOfTask = numberOfTask;

    }

    }

    // Metoder Getter og Setter.
    public String getProjectName() { return projectName; }
    public void setProjectName() { this.projectName = projectName; }

    public Date getDeadLine() { return deadLine; }
    public void setDeadLine() { this.deadLine = deadLine; }

    public String getProjectDescription() { return projectDescription; }
    public void setProjectDescription() { this.projectDescription = projectDescription; }

    public int getProjectId() { return projectId; }
    public void setProjectId() { this.projectId = projectId; }

    public double getTotalProjectTime() { return totalProjectTime; }
    public void setTotalProjectTime() { this.totalProjectTime = totalProjectTime; }

    public int getNumberOftask() { return numberOfTask; }
    public void setNumberOftask() { this.numberOfTask = numberOfTask; }



    // Metode String toString.
    @Override
    public String toString()
    {
        return "ProjectName: " + projectName + "deadLine: " + deadLine + "ProjectDescription: " + projectDescription + "projectId: " + projectId + "totalProjectTime: " + totalProjectTime + "numberOfTask: " + numberOfTask;
    }


}