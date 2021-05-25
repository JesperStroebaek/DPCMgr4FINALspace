package dpcm.dpcmgr4jbranch.model.classes;

public class Consultant
{
    //Atributter (encapsulation, dataType, variable).
    private int id;
    private String consulentName;
    private String password;

    // konstrukter (tom).
    public Consultant() {}

    // Konstrukter med parameter.
    public Consultant(int id, String consulentName, String password)
    {
        this.id = id;
        this.consulentName = consulentName;
        this.password = password;
    }

    public int getId() { return id; }
    public void setId() { this.id = id; }

    public String getConsulentName() { return consulentName; }
    public void setConsulentName() { this.consulentName = consulentName;}

    public String getPassword() { return password; }
    public void setPassword() { this.password = password; }

    // Metode String toString.
    @Override
    public String toString()
    {
        return "Id: " + id + "ConsulentName: " + consulentName + " Password: " +  password;
    }


}
