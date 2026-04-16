package week2.day4;

import java.util.Locale;

public class Palindrome {

    public void isPalindrome(String str1) {

        if (str1.charAt(0) == str1.charAt(str1.length() - 1) &&
               str1.charAt(1) == str1.charAt(str1.length() - 2)) {

           System.out.println("Это палиндром");
       } else {
           System.out.println("Это не палиндром");
       }

    }

    public static void main(String[] args) {
        Palindrome pal1 = new Palindrome();
        String str1 = "шалаш";
        pal1.isPalindrome(str1);

    }


}
