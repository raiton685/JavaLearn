package week2.day3;

public class Spaces {
    public static void main(String[] args) {
        String str1 = "I started learning Java two month ago";
        int spaces = 0;
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) == ' ') {
                spaces++;
            }
        }
        System.out.println("Количество пробелов: " + spaces);
    }

}
