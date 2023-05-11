package ArrayLists.Exc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Exc3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> guest = new ArrayList<>();

        int commands = Integer.parseInt(scanner.nextLine());

        List<String> input = new ArrayList<>();
        input = Arrays.stream(scanner.nextLine().split(" ")).collect(Collectors.toList());

        for (int i = 0; i < commands; i++) {
            if (guest.size() == 0) {
                if (input.get(input.size() - 2).equals("is")) {
                    guest.add(input.get(0));
                } else if (input.get(input.size() - 2).equals("not")) {
                    System.out.println(input.get(0) + " is not in the list!");
                }
            } else {
                if (input.get(input.size() - 2).equals("is")) {
                    int counter1 = 0;
                    for (int j = 0; j < guest.size(); j++) {
                        if (input.get(0).equals(guest.get(j))) {
                            counter1++;
                        }
                    }
                    if (counter1 == 0) {
                        guest.add(input.get(0));
                    } else {
                        System.out.println(input.get(0) + " is already in the list!");
                    }
                } else if (input.get(input.size() - 2).equals("not")) {
                    int counter = 0;
                    for (int j = 0; j < guest.size(); j++) {
                        if (input.get(0).equals(guest.get(j))) {
                            guest.remove(input.get(0));
                            counter++;
                            break;
                        }
                    }
                    if (counter == 0) {
                        System.out.println(input.get(0) + " is not in the list!");
                    }
                }
            }
            if (commands - 1 != i) {
                input = Arrays.stream(scanner.nextLine().split(" ")).collect(Collectors.toList());
            } else {
                break;
            }
        }
        for (int i = 0; i < guest.size(); i++) {
            System.out.println(guest.get(i));
        }
    }
}
