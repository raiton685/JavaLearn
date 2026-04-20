package week2.day5;

public class LettersAndNumbers {

    public void letterAndNumber(String str1) {
        int letters = 0;
        int numbers = 0;
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) >= 'A' && str1.charAt(i) <= 'Z' ||
                    str1.charAt(i) >= 'a' && str1.charAt(i) <= 'z') {
                letters++;
            } else if (str1.charAt(i) >= '0' && str1.charAt(i) <= '9') {
                numbers++;
            }
        }
        System.out.println("Количетво букв в предложении: " + letters + "\n" +
                "Количество цифр в предложении: " + numbers);
    }

    public static void main(String[] args) {
        LettersAndNumbers test1 = new LettersAndNumbers();
        String str1 = "Milk in the store costs 300 rubles for 3 liters";
        test1.letterAndNumber(str1);
    }
}
