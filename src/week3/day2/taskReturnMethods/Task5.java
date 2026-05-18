package week3.day2.taskReturnMethods;

public class Task5 {
    static void main(String[] args) {
        Student student = new Student("Кирилл", new int[]{4, 4, 4, 3, 3, 2});

        System.out.printf("Cтудент: %s \nСредний балл: %.1f ",student.name, student.getGrade());
    }
}


class Student {
    String name;
    int[] grade;


    Student(String name, int[] grade) {
        this.name = name;
        this.grade = grade;
    }

    double getGrade() {
         double averageGrade = 0;
        for (int i = 0; i < grade.length; i++) {
            averageGrade += grade[i];
        }
        return averageGrade / grade.length;
    }
}