package MidExam4;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Exc2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> groceryList = Arrays.stream(scanner.nextLine().split("!")).collect(Collectors.toList());
        List<String> command = Arrays.stream(scanner.nextLine().split("\\s+")).collect(Collectors.toList());

        while(!command.get(0).equals("Go")) {
            switch (command.get(0)) {
                case "Urgent":
                    boolean alreadyIn = false;
                    for (int i = 0; i < groceryList.size(); i++) {
                        if (command.get(1).equals(groceryList.get(i))) {
                            alreadyIn = true;
                        }
                    }
                    if (!alreadyIn) {
                        groceryList.add(0, command.get(1));
                    }
                    break;
                case "Unnecessary":
                    alreadyIn = false;
                    int index = 0;
                    for (int i = 0; i < groceryList.size(); i++) {
                        if (command.get(1).equals(groceryList.get(i))) {
                            alreadyIn = true;
                            index = i;
                        }
                    }
                    if (alreadyIn) {
                        groceryList.remove(index);
                    }
                    break;
                case "Correct":
                    alreadyIn = false;
                    index = 0;
                    for (int i = 0; i < groceryList.size(); i++) {
                        if (command.get(1).equals(groceryList.get(i))) {
                            alreadyIn = true;
                            index = i;
                        }
                    }
                    if (alreadyIn) {
                        groceryList.set(index,command.get(2));
                    }
                    break;
                case "Rearrange":
                    alreadyIn = false;
                    index = 0;
                    for (int i = 0; i < groceryList.size(); i++) {
                        if (command.get(1).equals(groceryList.get(i))) {
                            alreadyIn = true;
                            index = i;
                        }
                    }
                    if (alreadyIn) {
                        groceryList.remove(index);
                        groceryList.add(command.get(1));
                    }
                    break;
            }
            command = Arrays.stream(scanner.nextLine().split("\\s+")).collect(Collectors.toList());
        }
        System.out.println(groceryList.toString().replaceAll("[\\[\\]]", ""));
    }
}
