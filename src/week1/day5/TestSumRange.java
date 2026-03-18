package week1.day5;

public class TestSumRange {
    public int sumRange(int num1, int num2) {
        int sum = 0;
        for (int num3 = num1; num3 <= num2; num3++) {
            sum += num3;
        }
        return sum;
    }

}

class Test20 {
    public static void main(String[] args) {
        TestSumRange test1 = new TestSumRange();
        int sum = test1.sumRange(1, 8);
        System.out.println(sum);
    }
}