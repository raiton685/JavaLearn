package week2.day5;

public class ComparisonIgnoreReg {
    public void ignoreCase(String str1, String str2) {
        if (str1.equalsIgnoreCase(str2)) {
            System.out.println("Строки одинаковы");
        } else {
            System.out.println("Строки не одинаковы");
        }
    }

    public static void main(String[] args) {
        ComparisonIgnoreReg comp1 = new ComparisonIgnoreReg();
        String str1 = "JAVA, ЛУЧШИЙ ЯЗЫК ПРОГРАММИРОВАНИЯ В МИРЕ!";
        String str2 = "java, лучший язык программирования в мире!";
        comp1.ignoreCase(str1, str2);
    }
}
