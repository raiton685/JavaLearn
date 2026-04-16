package week2.day4;

public class MaxArr {

    public void maxArray(int[] array) {
        int max = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println("Максимальный эллемент массива: " + max);
    }

    public static void main(String[] args) {
        MaxArr max1 = new MaxArr();
        int[] array = {88, 55, 44, 667, 776, 33, 44, 66, 7554, 33, 6};
        max1.maxArray(array);
    }
}
