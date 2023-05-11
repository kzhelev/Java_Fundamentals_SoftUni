package Regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Exc3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        String regex = "\\b(?<day>[0-3][0-9])([\\/\\-.])(?<month>[A-Z][a-z]{2})\\2(?<year>[1-2][0-9][0-9][0-9])\\b";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        String day = "Day: ";
        String month = "Month: ";
        String year = "Year: ";
        while (matcher.find()) {
            System.out.printf("%s%s, %s%s, %s%s%n", day, matcher.group("day"),month,matcher.group("month"),year,matcher.group("year"));
        }
    }
}
