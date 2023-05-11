package Methods;

import java.util.Scanner;

public class Exc5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String order = scanner.nextLine();
        int count = Integer.parseInt(scanner.nextLine());

        orderPrice(order,count);
    }
    public static void orderPrice(String order, int count) {
        double price = 0;
        switch (order) {
            case "coffee":
                price = 1.50;
                break;
            case "water":
                price = 1.00;
                break;
            case "coke":
                price = 1.40;
                break;
            case "snacks":
                price = 2.00;
                break;
        }
        double bill = price * count;
        System.out.printf("%.2f",bill);

    }
}
