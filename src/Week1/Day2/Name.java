package Week1.Day2;
import java.util.Scanner;

public class Name {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Введите имя: ");
        String name = in.next();

        System.out.print("Введите фамилию: ");
        String surname = in.next();
        in.close();

    }
}
