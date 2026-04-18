package week2.day4;
// Пока не понял как сделать игнор пробелов, если мы имеем дело с предложением палиндромом например: А роза упала на лапу Азора
public class Palindrome {

    public void isPalindrome(String str1) {
        String lower = str1.toLowerCase();

        if (lower.charAt(0) == lower.charAt(lower.length() - 1) &&
                lower.charAt(1) == lower.charAt(lower.length() - 2)) {
            System.out.println("Это палиндром");
        } else {
            System.out.println("Это не палиндром");
        }

    }

    public static void main(String[] args) {
        Palindrome pal1 = new Palindrome();
        String str1 = "Казак";
        pal1.isPalindrome(str1);




    }
}