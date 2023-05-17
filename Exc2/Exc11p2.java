package Exc2;
import java.util.Scanner;
public class Exc11p2 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            int n = Integer.parseInt(scanner.nextLine());
            int snowballSnow = 0;
            int snowballTime = 0;
            int snowballQuality = 0;
            double snowballValue = 0;
            double snowballHighestValue = 1;

            int snowballSnowFinal = 0;
            int snowballTimeFinal = 0;
            int snowballQualityFinal = 0;
            if (n == 0) {
                System.out.printf("%d : %d = %.0f (%d)",
                        snowballSnowFinal, snowballTimeFinal, snowballHighestValue, snowballQualityFinal);
            } else {
                for (int i = 1; i <= n; i++) {
                    snowballSnow = Integer.parseInt(scanner.nextLine());
                    snowballTime = Integer.parseInt(scanner.nextLine());
                    snowballQuality = Integer.parseInt(scanner.nextLine());
                    double x = snowballSnow / (double)snowballTime;
                    snowballValue = 1;

                    if (snowballQuality == 0) {
                        snowballValue = 1;
                    } else {
                        for (int j = 1; j <= snowballQuality; j++) {
                            snowballValue *= x;
                        }
                    }

                    if (snowballValue >= snowballHighestValue) {
                        snowballHighestValue = snowballValue;
                        snowballSnowFinal = snowballSnow;
                        snowballTimeFinal = snowballTime;
                        snowballQualityFinal = snowballQuality;
                    }
                }
                System.out.printf("%d : %d = %.0f (%d)",
                        snowballSnowFinal, snowballTimeFinal, snowballHighestValue, snowballQualityFinal);
            }
        }
}
