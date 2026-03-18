package week1.day2;

import java.util.Scanner;

public class Age {

    public static void main(String[] args) {
        int currentYear = 2026;
        System.out.print("Введите ваш год рождения: ");
        Scanner in = new Scanner(System.in);
        int yourYear = in.nextInt();

        System.out.print("Ваш возраст: "+ (currentYear - yourYear));
        in.close();

    }
}
