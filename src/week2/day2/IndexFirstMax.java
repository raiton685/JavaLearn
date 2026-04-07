package week2.day2;

public class IndexFirstMax {
    public static void main(String[] args) {
        int[] array = {2, 45, 66, 71, 87, 92, 104, 205};
        int max = 0;
        int index= 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
                index = i;
            }
        } System.out.println(max + " index " + index);

    }
}
