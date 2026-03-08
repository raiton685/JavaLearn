package Week1.Day3;
import java.util.Scanner;
public class AgeVerification {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите год рождения: ");
        int yearOfBirth = in.nextInt();

        if (yearOfBirth<2009) {
        System.out.println("Добро пожаловать!");

        }else {
            System.out.println("В доступе отказано!");
        }




    }
}
