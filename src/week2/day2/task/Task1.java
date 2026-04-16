package week2.day2.task;

public class Task1 {
    public static void main(String[] args) {
        int[] array = {2, 4, 3, 3, 56, 67, 43};
        boolean havefour = false;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 4) {
                havefour = true;
            }
        }
        if (havefour) {
            System.out.println("В массиве есть четверка");
        }

    }


}
