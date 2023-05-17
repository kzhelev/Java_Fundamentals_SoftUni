package Regex.Exercise;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Exc3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        Pattern pattern = Pattern.compile("%(?<customer>[A-Z][a-z]+)%[^\\\\|\\\\$\\\\%\\\\.]*<{1}(?<product>\\w+)" +
                ">{1}[^\\\\|\\\\$\\\\%\\\\.]*\\|{1}(?<count>\\d+)\\|{1}[^\\\\|\\\\$\\\\%\\\\.\\d]*(?<price>\\d+.?\\d*?)\\${1}$");
        Matcher matcher;
        String customer = "";
        String product = "";
        int count = 0;
        double price = 0.0;
        double totalIncome = 0;
        double pricePayed = 0.0;

        while (!input.equals("end of shift")){
            matcher = pattern.matcher(input);
            if (matcher.find()) {
                pricePayed = Integer.parseInt(matcher.group("count")) * Double.parseDouble(matcher.group("price"));
                System.out.printf("%s: %s - %.2f%n", matcher.group("customer"), matcher.group("product"), pricePayed);
                totalIncome += pricePayed;
            }
            input = scanner.nextLine();
        }
        System.out.printf("Total income: %.2f",totalIncome);
    }
}
