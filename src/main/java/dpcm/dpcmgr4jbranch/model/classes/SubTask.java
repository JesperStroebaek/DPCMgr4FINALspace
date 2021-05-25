package dpcm.dpcmgr4jbranch.model.classes;

import org.thymeleaf.standard.processor.StandardUnlessTagProcessor;

public class SubTask
{
    //Atributter (encapsulation, dataType, variable).
    private int suptaskId;
    private String suptaskName;
    private String suptaskDesripion;
    private Double suptaskTime;

    // konstrukter (tom).
    public SubTask(){}

    // Konstrukter med parameter.
    public SubTask(int suptaskId, String suptaskName, String suptaskDesripion, Double suptaskTime) {
        this.suptaskId = suptaskId;
        this.suptaskName = suptaskName;
        this.suptaskDesripion = suptaskDesripion;
        this.suptaskTime = suptaskTime;
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

    public Double getSuptaskTime() {
        return suptaskTime;
    }

    public void setSuptaskTime(Double suptaskTime) {
        this.suptaskTime = suptaskTime;
    }


    // Metode String toString.
    @Override
    public String toString()
    {
        return "SuptaskId. " + suptaskId + "Suptaskname: " + suptaskName + "SuptaskDesripion: " + suptaskDesripion + "SuptaskTime" + suptaskTime;
    }

}
