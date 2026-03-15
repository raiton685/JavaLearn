import java.util.Scanner;

public class Test {

    Scanner in = new Scanner(System.in);
    int number = in.nextInt();

    public int sumRange() {
        int start = 1;
        int result = 0;
        for (int step = start; step <= number; step++) {
            result += step;
        }
        return result;
    }

    public int howManyNumbers() {

        int numbers = 0;
        for (int num3 = number; num3 > 0; num3 /= 10) {
            numbers++;
        }
        return numbers;
    }


    }
       /* public int Multiplication() {

        int i1;
        for (int i = 0; i < 10; i++) {
            i1 = number * i;
        }
        return i1;
    }
*/








class Test30{
    public static void main(String[] args) {

        Test test1 = new Test();
        //System.out.println(test1.sumRange());
        //System.out.println(test1.howManyNumbers());
        //System.out.println(test1.Multiplication());

    }

}