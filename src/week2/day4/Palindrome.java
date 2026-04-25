package week2.day4;

public class Palindrome {

    public void isPalindrome(String str1) {
        String str2 = "";
        for (int i = str1.length() - 1; i >= 0; i--) {
            str2 += str1.charAt(i);
        }
            if (str1.equalsIgnoreCase(str2)) {
                System.out.println("Это палиндром!");
            } else {
                System.out.println("Это не палиндром!");
            }

    }


    public static void main(String[] args) {
        Palindrome pal1 = new Palindrome();
        String str1 = "Казак";
        pal1.isPalindrome(str1);
    }
}