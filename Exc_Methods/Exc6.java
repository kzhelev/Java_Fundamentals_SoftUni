package Exc_Methods;

import java.util.Scanner;

public class Exc6 {
    public static void midChar (Scanner scanner) {
        String string = scanner.next();
        int a = string.length();
        char[] arrChar = new char[a];
        for (int i = 0; i < a; i++) {
            arrChar[i] = string.charAt(i);
        }
        if (a % 2 == 0) {
            System.out.print(arrChar[a/2-1]);
            System.out.print(arrChar[a/2]);
        } else {
            System.out.print(arrChar[a/2]);
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        midChar(scanner);
    }
}
