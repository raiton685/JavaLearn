package week2.day3;

public class FirstAndLastSymb {
    public static void main(String[] args) {
        String str1 = "Hello my name is Kirill";
        System.out.println("Первый символ строки: " + str1.charAt(0) + "\n"
                + "Последний символ строки: " + str1.charAt(str1.length() - 1) );
    }
}
