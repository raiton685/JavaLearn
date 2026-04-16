package week2.day4;

public class SumArr {

    public void sumArray(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        System.out.println("Сумма всех элементов массива: " + sum);
    }

    public static void main(String[] args) {
        SumArr sum1 = new SumArr();
        int[] array = {66, 88, 55, 33, 32, 677, 889};
        sum1.sumArray(array);
    }
}
