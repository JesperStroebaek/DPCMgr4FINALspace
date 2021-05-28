package dpcm.dpcmgr4jbranch.model.classes;

import org.thymeleaf.standard.processor.StandardUnlessTagProcessor;

public class SubTask
{
    //Atributter (encapsulation, dataType, variable).
    private int suptaskId;
    private String suptaskName;
    private String suptaskDesripion;
    private int suptaskTime;
    private double subtaskPrice;
    private String subtaskConsultantnName;
    private String subtaskDeadLine;

    // konstrukter (tom).
    public SubTask(){}

    // Konstrukter med parameter.


    public SubTask(String suptaskName, String suptaskDesripion, int suptaskTime, double subtaskPrice, String subtaskConsultantnName, String subtaskDeadLine) {
        this.suptaskName = suptaskName;
        this.suptaskDesripion = suptaskDesripion;
        this.suptaskTime = suptaskTime;
        this.subtaskPrice = subtaskPrice;
        this.subtaskConsultantnName = subtaskConsultantnName;
        this.subtaskDeadLine = subtaskDeadLine;
    }

    // Metoder Getter og Setter.
    public int getSuptaskId() {
        return suptaskId;
    }

    public void setSuptaskId(int suptaskId) {
        this.suptaskId = suptaskId;
    }

    public String getSuptaskName() {
        return suptaskName;
    }

    public void setSuptaskname(String suptaskName) {
        this.suptaskName = suptaskName;
    }

    public String getSuptaskDesripion() {
        return suptaskDesripion;
    }

    public void setSuptaskDesripion(String suptaskDesripion) {
        this.suptaskDesripion = suptaskDesripion;
    }

    public int getSuptaskTime() {
        return suptaskTime;
    }

    public void setSuptaskTime(int suptaskTime) {
        this.suptaskTime = suptaskTime;
    }

    public void setSuptaskName(String suptaskName) {
        this.suptaskName = suptaskName;
    }

    public double getSubtaskPrice() {
        return subtaskPrice;
    }

    public void setSubtaskPrice(double subtaskPrice) {
        this.subtaskPrice = subtaskPrice;
    }

    public String getSubtaskConsultantnName() {
        return subtaskConsultantnName;
    }

    public void setSubtaskConsultantnName(String subtaskConsultantnName) {
        this.subtaskConsultantnName = subtaskConsultantnName;
    }

    public String getSubtaskDeadLine() {
        return subtaskDeadLine;
    }

    public void setSubtaskDeadLine(String subtaskDeadLine) {
        this.subtaskDeadLine = subtaskDeadLine;
    }

    // Metode String toString.
    @Override
    public String toString()
    {
        return "SuptaskId. " + suptaskId + "Suptaskname: " + suptaskName + "SuptaskDesripion: " + suptaskDesripion + "SuptaskTime" + suptaskTime;
    }

}
