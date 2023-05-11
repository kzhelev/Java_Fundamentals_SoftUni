package Exc2;

import java.util.Scanner;

public class Exc8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int kegTypes = Integer.parseInt(scanner.nextLine());

        String biggestKeg = "";
        double volume = 0;

        for (int i = 1; i <= kegTypes ; i++) {
            String type = scanner.nextLine();
            double radius = Double.parseDouble(scanner.nextLine());
            int height = Integer.parseInt(scanner.nextLine());

            if (Math.PI * (radius * radius) * height > volume) {
                volume = Math.PI * (radius * radius) * height;
                biggestKeg = type;
            }
        }
        System.out.println(biggestKeg);
    }
}
