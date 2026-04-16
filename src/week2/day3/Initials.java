package week2.day3;

public class Initials {
    public static void main(String[] args) {
        String str1 = "Shesternev Kirill Andreevich";
        String[] words = str1.split(" ");
        System.out.println(words[0] + " " + words[1].charAt(0) +
                "." + words[2].charAt(0) + ".");

    }
}
