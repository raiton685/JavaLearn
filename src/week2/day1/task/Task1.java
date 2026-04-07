package week2.day1.task;

public class Task1 {
    public static void main(String[] args) {
        int[] array = {3, 5, 7, 9, 16, 87};
        int summ = 0;
        for (int i = 0; i < array.length; i++) {
            summ += array[i];

        }
        System.out.println(summ);
    }
}
