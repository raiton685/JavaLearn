package Week1.Day3;

import java.util.Scanner;

public class Maximum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        int num1 = in.nextInt();
        System.out.print("Введите второе число: ");
        int num2 = in.nextInt();
        in.close();

        if (num1>num2){
            System.out.println("Максимальное число: " + num1);
        }else if(num1<num2){
            System.out.println("Максимальное число: " + num2);

        }else {
            System.out.println("Числа равны");
        }


    }
}
