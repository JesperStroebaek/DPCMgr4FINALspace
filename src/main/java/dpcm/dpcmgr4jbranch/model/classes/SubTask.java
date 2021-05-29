package dpcm.dpcmgr4jbranch.model.classes;

public class SubTask
{
    //Atributter (encapsulation, dataType, variable).
    private int subtaskId;
    private String subtaskName;
    private String subtaskDesripion;
    private int subtaskTime;
    private double subtaskPrice;
    private String subtaskConsultantnName;
    private String subtaskDeadLine;

    // konstrukter (tom).
    public SubTask(){}

    // Konstrukter med parameter.


    public SubTask(String suptaskName, String suptaskDesripion, int suptaskTime, double subtaskPrice, String subtaskConsultantnName, String subtaskDeadLine) {
        this.subtaskName = suptaskName;
        this.subtaskDesripion = suptaskDesripion;
        this.subtaskTime = suptaskTime;
        this.subtaskPrice = subtaskPrice;
        this.subtaskConsultantnName = subtaskConsultantnName;
        this.subtaskDeadLine = subtaskDeadLine;
    }

    // Metoder Getter og Setter.
    public int getSubtaskId() {
        return subtaskId;
    }

    public void setSubtaskId(int subtaskId) {
        this.subtaskId = subtaskId;
    }

    public String getSubtaskName() {
        return subtaskName;
    }

    public void setSuptaskname(String suptaskName) {
        this.subtaskName = suptaskName;
    }

    public String getSubtaskDesripion() {
        return subtaskDesripion;
    }

    public void setSubtaskDesripion(String subtaskDesripion) {
        this.subtaskDesripion = subtaskDesripion;
    }

    public int getSuptaskTime() {
        return subtaskTime;
    }

    public void setSuptaskTime(int suptaskTime) {
        this.subtaskTime = suptaskTime;
    }

    public void setSubtaskName(String subtaskName) {
        this.subtaskName = subtaskName;
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
        return "SuptaskId. " + subtaskId + "Suptaskname: " + subtaskName + "SuptaskDesripion: " + subtaskDesripion + "SuptaskTime" + subtaskTime;
    }

}
