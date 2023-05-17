package Lab1;

import java.util.Scanner;

public class Exc9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;

        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 1; i < n*2; i += 2) {
            sum += i;
            System.out.printf("%d%n", i);
        }
        System.out.printf("Sum: %d", sum);
    }
}
