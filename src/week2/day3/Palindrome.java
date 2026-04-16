package week2.day3;

public class Palindrome {
    public static void main(String[] args) {
        char[] ch1 = {'Ш', 'А', 'Л', 'А', 'Ш'};
        for (int i = 0; i < ch1.length; i++) {
            System.out.print(ch1[i]);
        }
        System.out.println();
        for (int i = ch1.length - 1; i >= 0; i--) {
            System.out.print(ch1[i]);
        }
    }
}
