package Exc_Methods;

import java.util.Scanner;

public class Exc3 {
    public static void charsBetween(Scanner scanner) {
        char a = scanner.next().charAt(0);
        char b = scanner.next().charAt(0);
        if (a > b) {
            char z = a;
            a = b;
            b = z;
        }
        for (int i = a+1; i < b; i++) {
            char c = (char) i;
            System.out.print(c + " ");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        charsBetween(scanner);
    }
}
