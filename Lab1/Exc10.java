package Lab1;

import java.util.Scanner;

public class Exc10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int multi = 0;

        for (int i = 1; i <= 10; i++) {
            multi = n * i;
            System.out.printf("%d X %d = %d %n",n,i,multi);
        }
    }
}
