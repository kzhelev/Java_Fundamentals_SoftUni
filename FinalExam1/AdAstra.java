package FinalExam1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AdAstra {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String supplies = scanner.nextLine();

        Pattern pattern = Pattern.compile(
                "(#|\\|)(?<name>[a-zA-z ]*)\\1(?<expirationDate>[0-9]{2}\\/[0-9]{2}\\/[0-9]{2})\\1(?<calories>[0-9]+)\\1");
        Matcher matcher = pattern.matcher(supplies);

        List<String> name = new ArrayList<>();
        List<String> expirationDate = new ArrayList<>();
        List<Integer> calories = new ArrayList<>();

        while (matcher.find()) {
            name.add(matcher.group("name"));
            expirationDate.add(matcher.group("expirationDate"));
            calories.add(Integer.parseInt(matcher.group("calories")));

            if (calories.get(calories.size()-1) > 10000 || calories.get(calories.size()-1) < 0) {
                name.remove(name.size()-1);
                expirationDate.remove(expirationDate.size()-1);
                calories.remove(calories.size()-1);
            }
        }

        int caloriesCount = calories.stream().mapToInt(e -> e).sum();
        int forDays = caloriesCount/2000;

        System.out.printf("You have food to last you for: %d days!%n",forDays);

        for (int i = 0; i < name.size(); i++) {
            System.out.printf("Item: %s, Best before: %s, Nutrition: %d%n",name.get(i),expirationDate.get(i),calories.get(i));
        }

    }
}
