package core;

public class Human {
    private String lname;
    private String fname;


    public Human() {
    }

    public Human(String lname, String fname) {
        this.lname = lname;
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    @Override
    public String toString() {
        return "Human{" +
                "lname='" + lname + '\'' +
                ", fname='" + fname + '\'' +
                '}';
    }
}
