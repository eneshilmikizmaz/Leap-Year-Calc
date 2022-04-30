import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CalcLeapYear calc = new CalcLeapYear();
        System.out.println("Yıl Giriniz : ");
        System.out.println(calc.leapYear(scanner.nextInt()));
    }
}