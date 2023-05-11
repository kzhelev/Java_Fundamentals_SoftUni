package Exc_Methods;

import java.util.Scanner;

public class Exc1 {
    public static void smallestInt(int a, int b, int c) {
        int x = Integer.MAX_VALUE;
        if (a < x) {
            x = a;
        }
        if (b < x ) {
            x = b;
        }
        if (c < x ) {
            x = c;
        }
        System.out.println(x);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        int c = Integer.parseInt(scanner.nextLine());
        smallestInt(a,b,c);
    }

}
