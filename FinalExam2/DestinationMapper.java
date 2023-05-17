package FinalExam2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;
import java.util.function.UnaryOperator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class DestinationMapper {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        Pattern pattern = Pattern.compile("=[A-Z][A-Za-z]{2,}=|\\/[A-Z][A-Za-z]{2,}\\/");
        Matcher matcher = pattern.matcher(input);

        List<String> destinations = new ArrayList<>();

        while (matcher.find()) {
            destinations.add(matcher.group());
        }

        destinations = destinations.stream().map(e -> e.substring(1,e.length()-1)).collect(Collectors.toList());

        int points = 0;

        for (String e : destinations) {
            points += e.length();
        }

        System.out.println("Destinations: "+String.join(", ", destinations));
        System.out.println("Travel Points: "+points);
    }
}
