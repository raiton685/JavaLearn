package week1.day3.task;

public class Task6 {
    public static void main(String[] args) {
        String dayOfWeek ="Пятница";

        if(dayOfWeek == "Понеденльник"||dayOfWeek=="Вторник"||
                dayOfWeek=="Среда"||dayOfWeek=="Четверг"){
            System.out.println("Работаем с 9:00 до 18:00");
        } else if (dayOfWeek=="Пятница") {
            System.out.println("Работаем с 10:00 до 17:00");

        } else if (dayOfWeek=="Суббота"||dayOfWeek=="Воскресенье") {
            System.out.println("Выходной");
        }


    }
}
