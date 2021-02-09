package no.hiof;

import no.hiof.model.Student;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello world");

        Student enStudent = new Student("Thor","Wasbra",24);

        System.out.println(enStudent.toString());
    }
}
