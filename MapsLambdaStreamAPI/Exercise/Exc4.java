package MapsLambdaStreamAPI.Exercise;

import java.util.*;
import java.util.stream.Collectors;

public class Exc4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedHashMap<String, String> register = new LinkedHashMap<>();
        int n = Integer.parseInt(scanner.nextLine());
        List<String> input = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            input = Arrays.stream(scanner.nextLine().split(" ")).collect(Collectors.toList());
            switch (input.get(0)) {
                case "register":
                    if (register.containsKey(input.get(1))) {
                        System.out.printf("ERROR: already registered with plate number %s%n",register.get(input.get(1)));
                    } else {
                        register.put(input.get(1),input.get(2));
                        System.out.printf("%s registered %s successfully%n",input.get(1),input.get(2));
                    }
                    break;
                case "unregister":
                    if (register.containsKey(input.get(1))) {
                        System.out.printf("%s unregistered successfully%n",input.get(1));
                        register.remove(input.get(1));
                    } else {
                        System.out.printf("ERROR: user %s not found%n",input.get(1));
                    }
                    break;
            }
        }
        for (Map.Entry<String, String> stringStringEntry : register.entrySet()) {
            System.out.printf("%s => %s%n", stringStringEntry.getKey(),stringStringEntry.getValue());
        }

    }
}
