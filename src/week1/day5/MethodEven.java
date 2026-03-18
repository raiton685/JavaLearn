package week1.day5;

public class MethodEven {
    public void isEven(int num) {
        if (num % 2 == 0) {
            System.out.println("Четное");
        } else {
            System.out.println("Нечетное");
        }
    }
}

class Test4 {
    public static void main(String[] args) {
        MethodEven m1 = new MethodEven();
        m1.isEven(67);
    }
}