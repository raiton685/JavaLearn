package week2.day1;

public class MinMaxAverage {
    public static void main(String[] args) {
        int[] array = {2, 4, 1, 12, 5};
        int min = array[0];
        int max = array[0];
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            sum += array[i];
            if (array[i] < min) {
                min = array[i];
            }
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println("min: " + min);
        System.out.println("max: " + max);
        System.out.println("average: " + sum / array.length);
    }
}
