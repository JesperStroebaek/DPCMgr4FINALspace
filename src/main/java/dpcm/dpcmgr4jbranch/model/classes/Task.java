package com.example.dpcmgr4v1.model.classes;

import java.lang.reflect.Array;

public class Task
{
    //Atributter (encapsulation, dataType, variable).
    private int taskId;
    private String taskName;
    private String taskDescription;
    private Double  totalTaskTime;
    private int numberOfSubtask;

    // konstrukter (tom).
    public Task(){}

    // Konstrukter med parameter.
    public Task(int taskId, String taskName, String taskDescription, Double totalTaskTime, int numberOfSubtask) {
        this.taskId = taskId;
        this.taskName = taskName;
        this.taskDescription = taskDescription;
        this.totalTaskTime = totalTaskTime;
        this.numberOfSubtask = numberOfSubtask;
    }


    // Metoder Getter og Setter.
    public int getTaskId() {
        return taskId;
    }

    public void setTaskId(int taskId) {
        this.taskId = taskId;
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public String getTaskDescription() {
        return taskDescription;
    }

    public void setTaskDescription(String taskDescription) {
        this.taskDescription = taskDescription;
    }

    public Double getTotalTaskTime() {
        return totalTaskTime;
    }

    public void setTotalTaskTime(Double totalTaskTime) {
        this.totalTaskTime = totalTaskTime;
    }

    public int getNumberOfSubtask() {
        return numberOfSubtask;
    }

    public void setNumberOfSubtask(int numberOfSubtask) {
        this.numberOfSubtask = numberOfSubtask;
    }


    // Metode String toString.
    @Override
    public String toString()
    {
        return "taskId: " + taskId + "taskname: " + taskName + "TaskDescription: " + taskDescription + "TotalTaskTime: " + totalTaskTime + "numberOfSubtask: " + numberOfSubtask;
    }



}
