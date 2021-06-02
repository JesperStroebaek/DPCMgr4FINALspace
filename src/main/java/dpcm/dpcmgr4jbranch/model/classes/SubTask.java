package dpcm.dpcmgr4jbranch.model.classes;

public class SubTask {
    // + Atributter (encapsulation, dataType, variable).
    private String subtaskId;
    private String subtaskName;
    private String subtaskDescription;
    private int subtaskTime;
    private String subtaskPrice;
    private String subtaskConsultantName;
    private String subtaskDeadLine;

    // + konstrukter (tom).
    public SubTask() {
    }


    // + Konstrukter med parameter.
    public SubTask(String suptaskName, String subtaskDescription, int subtaskTime
            , String subtaskPrice, String subtaskConsultantName, String subtaskDeadLine) {
        this.subtaskName = suptaskName;
        this.subtaskDescription = subtaskDescription;
        this.subtaskTime = subtaskTime;
        this.subtaskPrice = subtaskPrice;
        this.subtaskConsultantName = subtaskConsultantName;
        this.subtaskDeadLine = subtaskDeadLine;
    }

    // + Metoder Getter og Setter.
    public String getSubtaskId() {
        return subtaskId;
    }

    public void setSubtaskId(String subtaskId) {
        this.subtaskId = subtaskId;
    }

    public String getSubtaskName() {
        return subtaskName;
    }

    public void setSuptaskname(String suptaskName) {
        this.subtaskName = suptaskName;
    }

    public String getSubtaskDescription() {
        return subtaskDescription;
    }

    public void setSubtaskDescription(String subtaskDescription) {
        this.subtaskDescription = subtaskDescription;
    }

    public int getSubtaskTime() {
        return subtaskTime;
    }

    public void setSubtaskTime(int subtaskTime) {
        this.subtaskTime = subtaskTime;
    }

    public void setSubtaskName(String subtaskName) {
        this.subtaskName = subtaskName;
    }

    public String getSubtaskPrice() {
        return subtaskPrice;
    }

    public void setSubtaskPrice(String subtaskPrice) { this.subtaskPrice = subtaskPrice; }

    public String getSubtaskConsultantName() {
        return subtaskConsultantName;
    }

    public void setSubtaskConsultantName(String subtaskConsultantName) {
        this.subtaskConsultantName = subtaskConsultantName;
    }

    public String getSubtaskDeadLine() {
        return subtaskDeadLine;
    }

    public void setSubtaskDeadLine(String subtaskDeadLine) {
        this.subtaskDeadLine = subtaskDeadLine;
    }


    @Override
    public String toString()
    {
        return "subtaskId: " + subtaskId + "subtaskName: " + subtaskName + "subtaskDescription:" + subtaskDescription + "subtaskTime: " + subtaskTime + "subtaskPrice: " + subtaskPrice + "subtaskConsultantName: " + subtaskConsultantName + "subtaskDeadLine: " +subtaskDeadLine;
    }
}


