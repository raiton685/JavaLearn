package week2.day5;

public class LongWord {

    public void mostLongWord(String str1) {
        String[] words = str1.split(" ");
        String max = "";
        for (String word : words) {
            if (word.length() > max.length()) {
                max = word;
            }
        }
        System.out.println("Самое длинное слово в предложении: " + max + "\n" +
                "Количество символов: " + max.length());
    }

    public static void main(String[] args) {
        LongWord word1 = new LongWord();
        String str1 = "Строка представляет собой последовательность символов" +
                " Для работы со строками в Java определен класс String" +
                " который предоставляет ряд методов для манипуляции строками";
        word1.mostLongWord(str1);
    }
}