package week3.day1;

public class Student {
    String name;
    String speciality;
    int age;
    int course;

    public Student(String name, String speciality, int age, int course) {
        this.name = name;
        this.speciality = speciality;
        this.age = age;
        this.course = course;
    }
    public void showInfo() {
        System.out.printf("Имя студента: %s \nСпециальность студента: %s \nВозраст студента: %d \n" +
                "Курс: %d \n\n", name, speciality, age, course);

    }
}


class Test {
    static void main(String[] args) {
        Student stud1 = new Student("Василий", "Сварщик", 24, 4);
        Student stud2 = new Student("Анатолий", "Фрезеровщик", 29, 2);
        Student stud3 = new Student("Иван","Инженер", 34, 5);
        Student stud4 = new Student("Кирилл", "Технолог", 33, 3);
        Student stud5 = new Student("Кирилл", "Технолог", 33, 3);

        stud1.showInfo();
        stud2.showInfo();
        stud3.showInfo();
        stud4.showInfo();
        stud5.showInfo();

        System.out.println(stud4.equals(stud5));
        System.out.println(stud4.name.equals(stud5.name));
        System.out.println(stud4.speciality.equals(stud5.speciality));
        System.out.println(stud4.age == stud5.age);
        System.out.println(stud4.course == stud5.course);

        /*stud1.name = "Василий";
        stud1.speciality = "Сварщик";
        stud1.age = 24;
        stud1.course = 4;


        stud2.name = "Анатолий";
        stud2.speciality = "Фрезеровщик";
        stud2.age = 29;
        stud2.course = 2;


        stud3.name = "Иван";
        stud3.speciality = "Инженер";
        stud3.age = 34;
        stud3.course = 5;


        stud4.name = "Кирилл";
        stud4.speciality = "Технолог";
        stud4.age = 33;
        stud4.course = 3;


        stud5.name = "Кирилл";
        stud5.speciality = "Технолог";
        stud5.age = 33;
        stud5.course = 3;
        */




    }
}






