package Exc_Methods;

import java.util.Scanner;

public class Exc7 {
    public static void cube(Scanner scanner) {
        int x = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < x; j++) {
                System.out.print(x+" ");
            }
            System.out.println("");
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        cube(scanner);
    }
}
