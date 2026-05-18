package week3.day3.task;

import java.util.ArrayList;
import java.util.Collections;

public class Task2 {

    boolean findNum(ArrayList<Integer> number) {
        return number.contains(56);
    }

    static void main(String[] args) {
        Task2 test = new Task2();
        ArrayList<Integer> numbers = new ArrayList<>();
        Collections.addAll(numbers, 4, 56, 443, 3334, 76, 6, 54, 44, 876);

        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println("\n" + test.findNum(numbers));
    }
}
