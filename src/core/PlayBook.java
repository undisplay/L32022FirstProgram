package core;

import core.view.Features;

import java.util.Date;
import java.util.Vector;

public class PlayBook {

    public static void main(String[] args) {

        Professor p = new Professor(1,"Muller","Merkel","Java","man",new Date());

        Student   s = new Student(1,"Meritus","Freedy","man",new Date());
        Student   q = new Student(2,"Meritus","Midley","man",new Date());

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
