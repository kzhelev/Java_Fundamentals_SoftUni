package Lab2;

import java.util.Scanner;

public class Exc2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double pound = Double.parseDouble(scanner.nextLine());
        double usd = pound * 1.36;
        System.out.printf("%.3f", usd);
    }
}
