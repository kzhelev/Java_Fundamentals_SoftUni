package Exc1;

import java.util.Scanner;

public class Exc5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();

        String reverse = new StringBuffer(name).reverse().toString();


        for (int i = 1; i <= 4; i++) {
            if (i < 4) {
                String password = scanner.nextLine();
                if (reverse.equals(password)) {
                    System.out.printf("User %s logged in.", name);
                    break;
                } else {
                    System.out.println("Incorrect password. Try again.");
                }
            } else {
                System.out.printf("User %s blocked!", name);
            }
        }
    }
}
