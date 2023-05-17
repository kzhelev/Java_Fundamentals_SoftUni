package Exc2;

import java.util.Scanner;

public class Exc6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            char a = (char) ('a' + i);
            for (int j = 0; j < n ; j++) {
                char b = (char) ('a' + j);
                for (int k = 0; k < n; k++) {
                    char c = (char) ('a' + k);
                    System.out.printf("%c%c%c%n",a,b,c);
                }
            }

        }
    }
}

/* Друг вариант

  Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        char a = 'a';
        char b = 'a';
        char c = 'a';

        for (int i = 0; i < n; i++) {
            a = 'a';
            b = 'a';
            a += i;
            for (int j = 0; j < n ; j++) {
                b = 'a';
                c = 'a';
                b += j;
                for (int k = 0; k < n; k++) {
                    c = 'a';
                    c += k;
                    System.out.printf("%c%c%c%n",a,b,c);
                }
            }

        }
 */