package Week1.Day3;
import java.util.Scanner;
public class EvenOrNot {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.print("Введите число: ");
        int number = in.nextInt();
        in.close();

        if(number % 2==0){
            System.out.println("Число чётное");

        }else {
            System.out.println("Число нечётное");
        }

    }
}
