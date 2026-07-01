package week3.day3;

import java.util.ArrayList;

public class AverageList {

    double averageNum(ArrayList<Integer> numbers) {
        double sum = 0;
        for (Integer number : numbers) {
            sum += number;
        }
        return sum / numbers.size();
    }


   public static void main(String[] args) {
        AverageList test = new AverageList();
        ArrayList<Integer> numbers = new ArrayList<>(15);
        numbers.add(257);
        numbers.add(58);
        numbers.add(25);
        numbers.add(96);
        numbers.add(146);
        numbers.add(438);
        numbers.add(47);
        numbers.add(23);
        numbers.add(14);
        numbers.add(63);
        numbers.add(789);
        double result = test.averageNum(numbers);
        System.out.printf("Среднее значение по списку:  %.1f", result);

    }
}

