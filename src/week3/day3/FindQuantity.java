package week3.day3;

import java.util.ArrayList;

public class FindQuantity {

    int quantityWords(ArrayList<String> list) {
        int count = 0;
        for (String word : list) {
            if (word.length() == 4) {
                count++;
            }
        }
        return count;
    }

   public static void main(String[] args) {
        FindQuantity test = new FindQuantity();
        ArrayList<String> words = new ArrayList<>();
        words.add("Поле");
        words.add("Лес");
        words.add("Небо");
        words.add("Луг");
        words.add("Гриб");
        words.add("Цветок");
        words.add("Куст");
        words.add("Дерево");
        words.add("Дёрн");
        words.add("Пень");
        int result = test.quantityWords(words);
        System.out.println("Количество слов из четырех букв: " + result);
    }
}

