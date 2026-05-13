package week3.day2.Task;

public class Task5 {
    static void main(String[] args) {
        SchoolClass stud1 = new SchoolClass("№1",3);
        SchoolClass stud2 = new SchoolClass("№2",5);
        SchoolClass stud3 = new SchoolClass("№3",4);
        SchoolClass stud4 = new SchoolClass("№4",5);
        SchoolClass stud5 = new SchoolClass("№5",3);
        SchoolClass stud6 = new SchoolClass("№6",3);
        SchoolClass stud7 = new SchoolClass("№7",5);


        int[] class1 = {stud1.grade, stud2.grade, stud3.grade, stud4.grade, stud5.grade, stud6.grade, stud7.grade};
        double average = stud1.averageClassGrade(class1);
        if (average > 3.9) {
            System.out.printf("Хороший результат класса, средняя оценка: %.1f", average);
        } else {
            System.out.printf("Плохой результат класса, есть над чем работать, средняя оценка: %.1f", average);
        }
    }
}


class SchoolClass {
    String idStudent;
    int grade;


    SchoolClass(String idStudent1, int grade1) {
        idStudent = idStudent1;
        grade = grade1;
    }

    double averageClassGrade(int[] array) {
        double sum = 0;
        for (int j : array) {
            sum += j;
        }
        return sum / array.length;
    }


}