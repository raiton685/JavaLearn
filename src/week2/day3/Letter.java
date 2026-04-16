package week2.day3;

public class Letter {
    public static void main(String[] args) {
        String str1 = "Zero, One, two, three, four, five";
        if (str1.charAt(0) >= 'A' && str1.charAt(0) <= 'Z') {
            System.out.println("Строка начинается с буквы: " + str1.charAt(0));
        } else {
            System.out.println("Строка начинается не с буквы: " + str1.charAt(0));
        }
    }
}
