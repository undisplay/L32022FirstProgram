package core;

import java.util.Date;

public class Student extends Human{
    private int studentID;

    public Student(int studentID,String lname, String fname, String genger, Date birthDay) {
        super(lname, fname, genger, birthDay);
        this.studentID = studentID;
    }

    public Student() {
    }

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentID=" + studentID +
                "} " + super.toString();
    }
}
