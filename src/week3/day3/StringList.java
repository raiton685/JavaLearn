package week3.day3;

import java.util.ArrayList;
import java.util.Collection;

public class StringList {
    static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>();
        words.add("One");
        words.add("Two");
        words.add("Three");
        words.add("Four");
        words.add("Five");
        words.add("Six");
        words.add("Seven");
        words.add("Eight");
        words.add("Nine");
        words.add("Ten");

        for (String word : words) {
            System.out.print(word + " ");
        }
    }
}
