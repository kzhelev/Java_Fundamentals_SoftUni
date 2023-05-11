package Methods;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exc8 {
    public static double count(Scanner scanner){
    double result = Math.pow(Double.parseDouble(scanner.nextLine()),Integer.parseInt(scanner.nextLine()));
    return (result);
    }
    public static void printResult(double result) {
        if (result % 1 == 0) {
            System.out.printf("%.0f",result);
        } else {
            System.out.println(new DecimalFormat("0.####").format(result));
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        printResult(count(scanner));
    }
}
