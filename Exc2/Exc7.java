package Exc2;

import java.util.Scanner;

public class Exc7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            int input = Integer.parseInt(scanner.nextLine());
            if (input + sum > 255) {
                System.out.println("Insufficient capacity!");
            } else {
                sum += input;
            }
        }
        System.out.println(sum);
    }
}
