package week3.day1.task;

public class Task2 {
    static void main(String[] args) {
        Student stud1 = new Student("Петр", new int[]{3, 5, 4, 2, 4});
        Student stud2 = new Student("Василий", new int[]{5, 5, 4, 3, 4});
        Student stud3 = new Student("Кирилл", new int[]{1, 5, 2, 2, 4});
        Student stud4 = new Student("Антон", new int[]{3, 5, 3, 2, 3});

        System.out.println("Средний балл студента " + stud1.name + ": " + stud1.averageGrade());
        System.out.println("Средний балл студента " + stud2.name + ": " + stud2.averageGrade());
        System.out.println("Средний балл студента " + stud3.name + ": " + stud3.averageGrade());
        System.out.println("Средний балл студента " + stud4.name + ": " + stud4.averageGrade());

        /*stud1.name = "Петр";
        stud1.grades = new int[]{3, 5, 4, 2, 4};

        stud2.name = "Василий";
        stud2.grades = new int[]{5, 5, 4, 3, 4};

        stud3.name = "Кирилл";
        stud3.grades = new int[]{1, 5, 2, 2, 4};

        stud4.name = "Антон";
        stud4.grades = new int[]{3, 5, 3, 2, 3};*/
    }
}

class Student {
    String name;
    int[] grades;

    public Student(String name, int[]grades) {
        this.name = name;
        this.grades = grades;
    }

    double averageGrade() {
        double sum = 0;
        for (int i = 0; i < grades.length; i++) {
            sum += grades[i];
        }
        return sum / grades.length;
    }

}