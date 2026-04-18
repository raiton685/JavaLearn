package week2.day4;

public class Words {
    public void countWords(String str1) {
        String[] words = str1.split(" ");
        int count = 0;
        for (int i = 0; i < words.length; i++) {
            count++;
        }
        System.out.println("Количество слов в предложении: " + count);
    }

    public static void main(String[] args) {
        Words words1 = new Words();
        String str1 = "Волненьем жизни утомленный," +
                " Оставя заблуждений путь," +
                " Я сердцем алчу отдохнуть," +
                " И близ тебя, мой друг бесценный";

        String str2 = "Приветствую, меня зовут Шестернев Кирилл Андреевич";
        words1.countWords(str1);
        words1.countWords(str2);


    }
}

