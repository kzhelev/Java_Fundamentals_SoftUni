package Regex.Exercise;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Exc2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String runnersString = scanner.nextLine();
        Map<String, Integer> runners = new HashMap<>();
        List<String> runnersArr = Arrays.stream(runnersString.split(", ")).collect(Collectors.toList());
        for (int i = 0; i < runnersArr.size(); i++) {
            runners.put(runnersArr.get(i), 0);
        }
        String input = scanner.nextLine();
        Pattern patternLetters = Pattern.compile("[A-Za-z]");
        Matcher matcherL;
        Pattern patternDigits = Pattern.compile("[0-9]");
        Matcher matcherD;
        String name = "";
        int distance = 0;

        while (!"end of race".equals(input)) {
            matcherL = patternLetters.matcher(input);
            matcherD = patternDigits.matcher(input);
            while (matcherL.find()) {
                name += matcherL.group();
            }
            while (matcherD.find()) {
                distance += Integer.parseInt(matcherD.group());
            }
            for (Map.Entry<String, Integer> integerEntry : runners.entrySet()) {
                if (integerEntry.getKey().equals(name)) {
                    integerEntry.setValue(integerEntry.getValue() + distance);
                }
            }
            name = "";
            distance = 0;
            input = scanner.nextLine();
        }
        /*Map<Integer, String> sorted = new TreeMap<>();
        for (Map.Entry<String, Integer> stringIntegerEntry : runners.entrySet()) {
            sorted.put(stringIntegerEntry.getValue(), stringIntegerEntry.getKey());
        }
        List<String> order = new ArrayList<>();
        for (Map.Entry<Integer, String> integerStringEntry : sorted.entrySet()) {
            order.add(integerStringEntry.getValue());
        }
        Collections.reverse(order);
        System.out.println("1st place: " + order.get(0));
        System.out.println("2nd place: " + order.get(1));
        System.out.println("3rd place: " + order.get(2));
*/
        int counter = 0;
        for (int i = 0; i < runnersArr.size(); i++) {
            boolean exist = false;
            for (Map.Entry<String, Integer> stringIntegerEntry : runners.entrySet()) {
                if (runnersArr.get(i).equals(stringIntegerEntry.getKey())){
                    exist = true;
                    break;
                }
            }
            if (!exist) {
                runnersArr.remove(i);
            }
        }

        System.out.println("1st place: " + runnersArr.get(0));
        System.out.println("2nd place: " + runnersArr.get(1));
        System.out.println("3rd place: " + runnersArr.get(2));

    }
}
