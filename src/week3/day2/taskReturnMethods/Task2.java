package week3.day2.taskReturnMethods;

public class Task2 {


    public int max(int[] array) {
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

   public static void main(String[] args) {
        Task2 test = new Task2();
        System.out.println(test.max(new int[]{1, 4, 67, 887, 54, 334, 56, 777}));
        Task2 test2 = new Task2();
        System.out.println(test2.max(new int[]{4, 5, 8, 88, 9, 99, 9, 8, 555, 776, 0}));
    }
}


