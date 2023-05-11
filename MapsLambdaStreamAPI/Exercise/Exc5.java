package MapsLambdaStreamAPI.Exercise;

import java.util.*;
import java.util.stream.Collectors;

public class Exc5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedHashMap<String, List<String>> infoList = new LinkedHashMap<>();
        List<String> input = Arrays.stream(scanner.nextLine().split(" : ")).collect(Collectors.toList());

        while (!"end".equals(input.get(0))) {
            if (!infoList.containsKey(input.get(0))) {
                infoList.put(input.get(0),new ArrayList<>());
                infoList.get(input.get(0)).add(input.get(1));
            } else {
                infoList.get(input.get(0)).add(input.get(1));
            }
            input = Arrays.stream(scanner.nextLine().split(" : ")).collect(Collectors.toList());
        }

        for (Map.Entry<String, List<String>> stringListEntry : infoList.entrySet()) {
            System.out.println(stringListEntry.getKey() +": "+stringListEntry.getValue().size());
            for (int i = 0; i < stringListEntry.getValue().size(); i++) {
                System.out.println("-- "+stringListEntry.getValue().get(i));
            }
        }

    }
}
