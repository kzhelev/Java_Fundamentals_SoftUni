package Exc2;

import java.util.Scanner;

public class Exc10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int m = Integer.parseInt(scanner.nextLine());
        short y = Short.parseShort(scanner.nextLine());
        int firstN = n;
        int loops = 0;

        while (n >= m) {
            n -= m;
            if (n == firstN/2.0) {
                if (y == 0) {
                } else {
                n /= y;
                }
            }
            loops += 1;
        }
        System.out.println(n);
        System.out.println(loops);
    }
}
