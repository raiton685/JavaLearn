package Week1.Day3.Task;
import java.util.Scanner;
public class Task7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        if (num>100){
            num = num*100;
            System.out.println(num);
        } else {
            num = num/2;
            System.out.println(num);
        }

    }

}
