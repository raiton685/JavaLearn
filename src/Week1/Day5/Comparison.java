package Week1.Day5;

public class Comparison {

    public int maxOfTwo(int num1, int num2) {
        if (num1 > num2) {
            return num1;
        } else {
            return num2;
        }
    }
}

class Test {
    public static void main(String[] args) {
        Comparison com1 = new Comparison();
        System.out.println(com1.maxOfTwo(45, 78));
        System.out.println(com1.maxOfTwo(344, 9665));
    }
}