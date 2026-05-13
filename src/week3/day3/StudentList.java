package week3.day3;

import java.util.ArrayList;

public class StudentList {
    static void main(String[] args) {
        Student stud1 = new Student("Иван");
        Student stud2 = new Student("Антон");
        Student stud3 = new Student("Кирилл");
        Student stud4 = new Student("Андрей");
        Student stud5 = new Student("Пётр");

        ArrayList<Student> students = new ArrayList<>();
        students.add(stud1);
        students.add(stud2);
        students.add(stud3);
        students.add(stud4);
        students.add(stud5);

        for (Student student : students) {
            System.out.println(student.name + " ");
        }
    }
}

class Student {
    String name;

    Student(String name1) {
        name = name1;
    }
}