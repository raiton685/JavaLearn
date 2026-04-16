package week2.day2.task;

public class Task4 {
    public static void main(String[] args) {
        int[] array = new int[20];
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = count++;
            System.out.print(count + " ");
        }
    }
}

