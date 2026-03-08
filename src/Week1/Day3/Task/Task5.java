package Week1.Day3.Task;

public class Task5 {
    public static void main(String[] args) {
        int year = 2026;

        if(year % 400 == 0 || year % 4 == 0 && year % 100 != 0) {
            System.out.println("Високосный");
        } else {
            System.out.println("Не високосный");
        }

    }
}
