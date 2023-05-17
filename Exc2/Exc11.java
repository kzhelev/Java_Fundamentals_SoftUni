package Exc2;

import java.util.Scanner;

public class Exc11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        double z = Double.MIN_VALUE;

        int a = 0;
        int b = 0;
        int c = 0;

        if (n == 0) {
            System.out.printf("");
        } else {
            for (int i = 1; i <= n; i++) {
                int snowballSnow = Integer.parseInt(scanner.nextLine());
                int snowballTime = Integer.parseInt(scanner.nextLine());
                int snowballQuality = Integer.parseInt(scanner.nextLine());
                double snowballValue = Math.pow(snowballSnow/snowballTime,snowballQuality);
                if (snowballQuality == 0) {
                        snowballValue = 1;
                }
                if (snowballValue > z) {
                    z = snowballValue;
                    a = snowballSnow;
                    b = snowballTime;
                    c = snowballQuality;
                }

            }System.out.printf("%d : %d = %.0f (%d)", a, b, z, c);
        }
    }
}

