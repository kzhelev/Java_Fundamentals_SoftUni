package MapsLambdaStreamAPI.Exercise;

import java.util.*;
import java.util.stream.Collectors;

public class Exc10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> input = Arrays.stream(scanner.nextLine().split("-")).collect(Collectors.toList());
        LinkedHashMap<String, Integer> user = new LinkedHashMap<>();
        LinkedHashMap<String, Integer> submits = new LinkedHashMap<>();

        while (!input.get(0).equals("exam finished")) {
            if (input.get(1).equals("banned")) {
                user.remove(input.get(0));
            } else {
                if (!user.containsKey(input.get(0))) {
                    user.put(input.get(0), Integer.parseInt(input.get(2)));
                } else {
                    if (user.get(input.get(0)) < Integer.parseInt(input.get(2))) {
                        user.put(input.get(0), Integer.parseInt(input.get(2)));
                    }
                }
                if (!submits.containsKey(input.get(1))) {
                    submits.put(input.get(1), 1);
                } else {
                    submits.put(input.get(1), submits.get(input.get(1)) + 1);
                }
            }
            input = Arrays.stream(scanner.nextLine().split("-")).collect(Collectors.toList());
        }
        System.out.println("Results:");
        for (Map.Entry<String, Integer> stringIntegerEntry : user.entrySet()) {
            System.out.printf("%s | %d%n",stringIntegerEntry.getKey(),stringIntegerEntry.getValue());
        }
        System.out.println("Submissions:");
        for (Map.Entry<String, Integer> stringIntegerEntry : submits.entrySet()) {
            System.out.printf("%s - %d%n",stringIntegerEntry.getKey(),stringIntegerEntry.getValue());
        }


    }
}
