package Lab1;

import java.util.Scanner;

public class Exc11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int m = Integer.parseInt(scanner.nextLine());
        int multi = 0;
        if (m <= 10) {
            for (int i = m; i <= 10; i++) {
                multi = n * i;
                System.out.printf("%d X %d = %d %n", n, i, multi);
            }
        } else {
            multi = n * m;
            System.out.printf("%d X %d = %d %n", n, m, multi);
        }
    }
}
