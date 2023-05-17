package Exc1;

import java.util.Scanner;

public class Exc3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int people = Integer.parseInt(scanner.nextLine());
        String type = scanner.nextLine();
        String day = scanner.nextLine();
        double price = 0.00;
        double finalPrice = 0.00;

        if ("Students".equals(type)) {
            switch (day) {
                case "Friday":
                    price = 8.45;
                    break;
                case "Saturday":
                    price = 9.80;
                    break;
                case "Sunday":
                    price = 10.46;
                    break;
            }
            finalPrice = price * people;
            if (people >= 30) {
                finalPrice *= 0.85;
            }
        }
        if ("Business".equals(type)) {
            switch (day) {
                case "Friday":
                    price = 10.90;
                    break;
                case "Saturday":
                    price = 15.60;
                    break;
                case "Sunday":
                    price = 16;
                    break;
            }
            finalPrice = price * people;
            if (people >= 100) {
                finalPrice = price * (people-10);
            }
        }
        if ("Regular".equals(type)) {
            switch (day) {
                case "Friday":
                    price = 15;
                    break;
                case "Saturday":
                    price = 20;
                    break;
                case "Sunday":
                    price = 22.50;
                    break;
            }
            finalPrice = price * people;
            if (people >= 10 && people <= 20) {
                finalPrice *= 0.95;
            }
        }
        System.out.printf("Total price: %.2f",finalPrice);
    }

}
