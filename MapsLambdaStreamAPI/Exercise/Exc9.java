package MapsLambdaStreamAPI.Exercise;

import java.util.*;
import java.util.stream.Collectors;

public class Exc9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> input = new ArrayList<>();
        String inputSystem = scanner.nextLine();
        if (inputSystem.contains("|")) {
            input = Arrays.stream(inputSystem.split("\\s+\\|\\s+")).collect(Collectors.toList());
        } else if (inputSystem.contains("->")) {
            input = Arrays.stream(inputSystem.split("\\s+->\\s+")).collect(Collectors.toList());
        }
        LinkedHashMap<String, List<String>> forceUsers = new LinkedHashMap<>();

        while (!"Lumpawaroo".equals(inputSystem)) {
            boolean inTheList = false;
            String side = "";

            if (inputSystem.contains("|")) {
                for (Map.Entry<String, List<String>> stringListEntry : forceUsers.entrySet()) {
                        if (stringListEntry.getValue().contains(input.get(1))) {
                            inTheList = true;
                            break;
                        }
                    }
                if (!forceUsers.containsKey(input.get(0)) && !inTheList) {
                    forceUsers.put(input.get(0), new ArrayList<>());
                    forceUsers.get(input.get(0)).add(input.get(1));
                } else if (forceUsers.containsKey(input.get(0)) && !inTheList) {
                    forceUsers.get(input.get(0)).add(input.get(1));
                }
            } else if (inputSystem.contains("->")) {
                for (Map.Entry<String, List<String>> stringListEntry : forceUsers.entrySet()) {
                    for (int i = 0; i < stringListEntry.getValue().size(); i++) {
                        if (input.get(0).equals(stringListEntry.getValue().get(i))) {
                            inTheList = true;
                            side = stringListEntry.getKey();
                            break;
                        }
                    }
                }
                if (!forceUsers.containsKey(input.get(1)) && !inTheList) {
                    forceUsers.put(input.get(1), new ArrayList<>());
                    forceUsers.get(input.get(1)).add(input.get(0));
                    System.out.printf("%s joins the %s side!%n", input.get(0), input.get(1));
                } else if (forceUsers.containsKey(input.get(1)) && !inTheList) {
                    forceUsers.get(input.get(1)).add(input.get(0));
                    System.out.printf("%s joins the %s side!%n", input.get(0), input.get(1));
                } else if (!forceUsers.containsKey(input.get(1)) && inTheList) {
                    forceUsers.get(side).remove(input.get(0));
                    forceUsers.put(input.get(1), new ArrayList<>());
                    forceUsers.get(input.get(1)).add(input.get(0));
                    System.out.printf("%s joins the %s side!%n", input.get(0), input.get(1));
                } else if (forceUsers.containsKey(input.get(1)) && inTheList) {
                    forceUsers.get(side).remove(input.get(0));
                    forceUsers.get(input.get(1)).add(input.get(0));
                    System.out.printf("%s joins the %s side!%n", input.get(0), input.get(1));
                }
            }
            inputSystem = scanner.nextLine();
            if (inputSystem.contains("|")) {
                input = Arrays.stream(inputSystem.split("\\s+\\|\\s+")).collect(Collectors.toList());
            } else if (inputSystem.contains("->")) {
                input = Arrays.stream(inputSystem.split("\\s+->\\s+")).collect(Collectors.toList());
            }
        }
        for (Map.Entry<String, List<String>> users : forceUsers.entrySet()) {
            if (users.getValue().size() != 0) {
                System.out.printf("Side: %s, Members: %d%n", users.getKey(), users.getValue().size());
                for (int i = 0; i < users.getValue().size(); i++) {
                    System.out.printf("! %s%n", users.getValue().get(i));
                }
            }
        }

    }
}
