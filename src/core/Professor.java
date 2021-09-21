package core;

import java.util.Date;

public class Professor extends Human {
    private int profID;
    private String speciality;

    public Professor(int profID, String lname, String fname,String speciality, String genger, Date birthDay) {
        super(lname, fname, genger, birthDay);
        this.profID = profID;
        this.speciality = speciality;
    }

    public Professor() {
    }

    public int getProfID() {
        return profID;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setProfID(int profID) {
        this.profID = profID;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    @Override
    public String toString() {
        return "Professor{" +
                "profID=" + profID +
                ", speciality='" + speciality + '\'' +
                "} " + super.toString();
    }
}
