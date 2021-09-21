package core;

import core.view.Features;

import java.util.Vector;

public class PlayBook {

    public static void main(String[] args) {

        Professor p = new Professor(1,"Muller","Merkel");

        Student   s = new Student(1,"Meritus","Freedy");
        Student   q = new Student(2,"Meritus","Midley");

        Vector<String> books = new Vector<String>();
        books.add("introduction to java");

        Materials m = new Materials(1,"intelliJ idea","1.11",books);

        Vector<Student> students = new Vector<Student>();
        students.add(s);
        students.add(q);

        Course    c = new Course(1,"Java",m,p,students);

        Features.display(c.toString());
    }
}
