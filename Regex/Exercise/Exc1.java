package Regex.Exercise;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Exc1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        double price;
        int quantity;
        Pattern pattern = Pattern.compile(">>(?<item>[A-Z]*[a-z]*)<<(?<price>\\d+.?\\d*?)!(?<quantity>\\d+)\\b");
        Matcher matcher;
        double cost = 0.00;
        System.out.println("Bought furniture:");
        while (!input.equals("Purchase")){
            matcher = pattern.matcher(input);
            if (matcher.find()) {
                System.out.println(matcher.group("item"));
                price = Double.parseDouble(matcher.group("price"));
                quantity = Integer.parseInt(matcher.group("quantity"));
                cost += price * quantity;
            }
            input = scanner.nextLine();
        }
        System.out.printf("Total money spend: %.2f",cost);
    }
}
