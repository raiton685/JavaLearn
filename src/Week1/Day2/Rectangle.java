package Week1.Day2;

import java.util.Scanner;

public class Rectangle {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        int a = in.nextInt();

        System.out.print("Введите второе число: ");
        int b = in.nextInt();

        System.out.println("Площадь прямоугольника = " + a*b + " см2");
        System.out.println("Периметр прямоугольника = " + 2*(a+b) + " см");
        in.close();
    }
}
