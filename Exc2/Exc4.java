package Exc2;

import java.util.Scanner;

public class Exc4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int sum = 0;

        for (int i = 0; i < n; i++) {
            char a = scanner.next().charAt(0);
            sum += a;
        }
        System.out.printf("The sum equals: %d",sum);
    }
}
