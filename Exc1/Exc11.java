package Exc1;

import java.util.Scanner;

public class Exc11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int lostGames = Integer.parseInt(scanner.nextLine());
        double headset = Double.parseDouble(scanner.nextLine());
        double mouse = Double.parseDouble(scanner.nextLine());
        double keyboard = Double.parseDouble(scanner.nextLine());
        double display = Double.parseDouble(scanner.nextLine());

        double costs = 0;

        for (int i = 2; i <= lostGames; i += 2) {
            costs += headset;
        }
        for (int j = 3; j <= lostGames; j += 3) {
            costs += mouse;
        }
        for (int k = 6; k <= lostGames; k += 6) {
            costs += keyboard;
        }
        for (int c = 12; c <= lostGames; c += 12) {
            costs += display;
        }
        System.out.printf("Rage expenses: %.2f lv.", costs);
    }
}
