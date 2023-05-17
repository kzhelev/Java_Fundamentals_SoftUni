package Lab1;

import java.util.Scanner;

public class Exc12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            int n = Integer.parseInt(scanner.nextLine());
            if (n % 2 == 0) {
                System.out.printf("The number is: %d %n", Math.abs(n));
                break;
            } else {
                System.out.println("Please write an even number.");
            }
        }
    }
}
