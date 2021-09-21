package core;

import java.util.Date;

public class Human {
    private String lname;
    private String fname;
    private String gender;
    private Date birthDay;


    public Human() {
    }

    public Human(String lname, String fname, String gender, Date birthDay) {
        this.gender = gender;
        this.birthDay = birthDay;
        this.lname = lname;
        this.fname = fname;
    }

    public Date getBirthDay() {
        return birthDay;
    }

    public String getGender() {
        return gender;
    }

    public String getFname() {
        return fname;
    }

    public String getLname() {
        return lname;
    }

    public void setBirthDay(Date birthDay) {
        this.birthDay = birthDay;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    @Override
    public String toString() {
        return "Human{" +
                "lname='" + lname + '\'' +
                ", fname='" + fname + '\'' +
                ", gender='" + gender + '\'' +
                ", birthDay=" + birthDay +
                '}';
    }
}
