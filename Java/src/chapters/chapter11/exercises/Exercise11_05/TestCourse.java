package chapters.chapter11.exercises.Exercise11_05;

import java.util.ArrayList;

public class TestCourse {
    public static void main(String[] args) {
        Course1 c1 = new Course1("Inar 2023.03");

        c1.addStudent("Serhat Gulbas");
        c1.addStudent("Furkan Sener");
        c1.addStudent("Berk Orman");
        c1.addStudent("Sinan Cetin");
        c1.addStudent("Haluk Dundar");
        c1.addStudent("Uzeyir Sur");
        c1.addStudent("Kemal Tantana");
        c1.addStudent("Mahmut Keskin");

        ArrayList<String> students = c1.getStudents();
        System.out.println("After adding some students.");
        for (int i = 0; i < students.size(); i++) {
            System.out.println(students.get(i));
        }
        System.out.println("Number of students: " + c1.getNumberOfStudents());
        System.out.println("------------------");

        c1.dropStudent("Kemal Tantana");
        c1.dropStudent("Mahmut Keskin");
        c1.dropStudent("Mahmut Kral");

        students = c1.getStudents();
        System.out.println("After dropping some students");
        for (int i = 0; i < students.size(); i++) {
            System.out.println(students.get(i));
        }
        System.out.println("Number of students: " + c1.getNumberOfStudents());


    }
}
