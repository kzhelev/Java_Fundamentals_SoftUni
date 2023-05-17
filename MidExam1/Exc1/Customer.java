package MidExam1.Exc1;

import java.util.Scanner;

public class Customer {

    private double price;
    private double taxes;
    private double finalPrice;

    public void bill(Scanner scanner) {
        String input = scanner.nextLine();
        this.price = 0;
        while (!"special".equals(input) && !"regular".equals(input)) {
            if (Double.parseDouble(input) < 0) {
                System.out.println("Invalid price!");
            } else {
                this.price += Double.parseDouble(input);
            }
            input = scanner.nextLine();
        }
        this.taxes = this.price*0.2;
        if (input.equals("regular")) {
            this.finalPrice = this.price + this.taxes;
        } else if (input.equals("special")) {
            this.finalPrice = (this.price + this.taxes)*0.9;
        }
    }

    public void billPrint() {
        if (this.price == 0) {
            System.out.println("Invalid order!");
        } else {
            System.out.println("Congratulations you've just bought a new computer!");
            System.out.printf("Price without taxes: %.2f$%n", this.price);
            System.out.printf("Taxes: %.2f$%n", this.taxes);
            System.out.println("-----------");
            System.out.printf("Total price: %.2f$", this.finalPrice);
        }
    }
}
