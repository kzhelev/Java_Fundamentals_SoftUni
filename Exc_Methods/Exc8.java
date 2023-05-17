package Exc_Methods;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exc8 {
    public static void factorialDivision(Scanner scanner) {
        double x = Double.parseDouble(scanner.nextLine());
        double y = Double.parseDouble(scanner.nextLine());
        Double factorialA = 1.0;
        for (int i = 1; i <=x ; i++) {
            factorialA *= i;
        }
        Double factorialB = 1.0;
        for (int i = 1; i <=y ; i++) {
            factorialB *= i;
        }
        System.out.print(new DecimalFormat("0.00").format(factorialA/factorialB));

    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        factorialDivision(scanner);
    }
}
