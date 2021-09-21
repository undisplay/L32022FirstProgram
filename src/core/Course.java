package core;

import java.util.Vector;

public class Course {
    private int courseID;
    private String name;
    private Materials materials;
    private Professor professor;
    private Vector<Student> students;

    public Course(int courseID,String name,Materials materials, Professor professor, Vector<Student> students){
        this.courseID = courseID;
        this.name = name;
        this.materials = materials;
        this.professor = professor;
        this.students = students;
    }

    public int getCourseID() {
        return courseID;
    }

    public String getName() {
        return name;
    }

    public Materials getMaterials() {
        return materials;
    }

    public Professor getProfessor() {
        return professor;
    }

    public Vector<Student> getStudents() {
        return students;
    }

    public void setCourseID(int courseID) {
        this.courseID = courseID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMaterials(Materials materials) {
        this.materials = materials;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public void setStudents(Vector<Student> students) {
        this.students = students;
    }

    public Vector<Student> addStudent(Student student){
        students.add(student);
        return students;
    }

    @Override
    public String toString() {
        return "Course{" +
                "courseID=" + courseID +
                ", name='" + name + '\'' +
                ", materials=" + materials +
                ", professor=" + professor +
                ", students=" + students +
                '}';
    }
}
