package Exc1;

import java.util.Scanner;

public class Exc7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String string = scanner.nextLine();
        double money = Double.parseDouble(string);

        double sum = 0.0;
        double price = 0.0;
        double change = 0.0;

        while (!"End".equals(string)) {
            if (money == 0.1 || money == 0.2 || money == 0.5 || money == 1.0 || money == 2.0) {
                sum += money;
                string = scanner.nextLine();
            } else {
                System.out.printf("\nCannot accept %.2f\n", money);
                string = scanner.nextLine();
            }
            if (!string.equals("Start")) {
                money = Double.parseDouble(string);
            } else {
                while (true) {
                    switch (string) {
                        case "Nuts":
                            price += 2.0;
                            break;
                        case "Water":
                            price += 0.7;
                            break;
                        case "Crisps":
                            price += 1.5;
                            break;
                        case "Soda":
                            price += 0.8;
                            break;
                        case "Coke":
                            price += 1.0;
                            break;
                    }
                    if (price <= sum) {
                        change = sum - price;
                        switch (string) {
                            case "Nuts":
                            case "Water":
                            case "Crisps":
                            case "Soda":
                            case "Coke":
                                System.out.printf("Purchased %s\n" ,string);
                                break;
                        }
                        if (!string.equals("Nuts") && !string.equals("Water") && !string.equals("Crisps") &&
                                !string.equals("Soda") && !string.equals("Coke") && !string.equals("Start") &&
                                !string.equals("End")) {
                            System.out.println("Invalid product");
                        }
                        string = scanner.nextLine();
                    } else {
                        System.out.print("Sorry, not enough money\n");
                        price = 0.0;
                        string = scanner.nextLine();
                    }
                    if (string.equals("End")) {
                        break;
                    }
                }
            }
        } System.out.printf("Change: %.2f", change);
    }
}
