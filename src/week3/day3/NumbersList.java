package week3.day3;

import java.util.ArrayList;

public class NumbersList {
    static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);
        numbers.add(7);
        numbers.add(8);

        for (int num : numbers) {
            System.out.println(num + " ");
        }
    }
}
