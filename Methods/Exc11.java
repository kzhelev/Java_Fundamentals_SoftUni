package Methods;

import java.text.DecimalFormat;
import java.util.Scanner;
import java.util.function.DoublePredicate;

public class Exc11 {

    public static double counter(Scanner scanner) {

        double a = Double.parseDouble(scanner.nextLine());
        String action = scanner.nextLine();
        double b = Double.parseDouble(scanner.nextLine());
        double result = 0;
        switch (action) {
            case "/":
                result = a / b;
                break;
            case "*":
                result = a * b;
                break;
            case "-":
                result = a - b;
                break;
            case "+":
                result = a + b;
                break;
        }
        return (result);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(new DecimalFormat("0.##").format(counter(scanner)));
    }
}
