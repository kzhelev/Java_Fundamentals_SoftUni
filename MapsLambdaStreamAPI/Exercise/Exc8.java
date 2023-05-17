package MapsLambdaStreamAPI.Exercise;

import java.util.*;
import java.util.stream.Collectors;

public class Exc8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> input = Arrays.stream(scanner.nextLine().split(" -> ")).collect(Collectors.toList());
        LinkedHashMap<String, List<String>> companies = new LinkedHashMap<>();

        while (!input.get(0).equals("End")) {
            if (!companies.containsKey(input.get(0))) {
                companies.put(input.get(0), new ArrayList<>());
                companies.get(input.get(0)).add(input.get(1));
            } else {
                boolean alreadyIn = false;
                for (int i = 0; i < companies.get(input.get(0)).size(); i++) {
                    if (companies.get(input.get(0)).get(i).equals(input.get(1))) {
                        alreadyIn = true;
                    }
                }
                if (!alreadyIn) {
                    companies.get(input.get(0)).add(input.get(1));
                }

            }
            input = Arrays.stream(scanner.nextLine().split(" -> ")).collect(Collectors.toList());
        }

        for (Map.Entry<String, List<String>> stringListEntry : companies.entrySet()) {
            System.out.println(stringListEntry.getKey());
            for (int i = 0; i < stringListEntry.getValue().size(); i++) {
                System.out.println("-- "+stringListEntry.getValue().get(i));
            }
        }
    }
}
