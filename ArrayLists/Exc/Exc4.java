package ArrayLists.Exc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Exc4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> intList = new ArrayList<>();
        intList = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());

        List<String> stringList = new ArrayList<>();
        stringList = Arrays.stream(scanner.nextLine().split("\\s+")).collect(Collectors.toList());

        while (!stringList.get(0).equals("End")) {
            switch (stringList.get(0)) {
                case "Add":
                    intList.add(Integer.parseInt(stringList.get(1)));
                    break;
                case "Insert":
                    if (Integer.parseInt(stringList.get(2)) >= 0 && Integer.parseInt(stringList.get(1)) <= intList.size() - 1) {
                        intList.add(Integer.parseInt(stringList.get(2)), Integer.parseInt(stringList.get(2)));
                } else {
                        System.out.println("Invalid index");
                    }
                    break;
                case "Remove":
                    if (Integer.parseInt(stringList.get(1)) >= intList.size() || Integer.parseInt(stringList.get(1)) < 0) {
                        System.out.println("Invalid index");
                        break;
                    }
                    intList.remove(Integer.parseInt(stringList.get(1)));
                    break;
                case "Shift":
                    if (stringList.get(1).equals("left")) {
                        for (int i = 0; i < Integer.parseInt(stringList.get(2)); i++) {
                            intList.add(intList.get(0));
                            intList.remove(0);
                        }
                    } else if (stringList.get(1).equals("right")) {
                        for (int i = 0; i < Integer.parseInt(stringList.get(2)); i++) {
                            intList.add(0, intList.get(intList.size() - 1));
                            intList.remove(intList.size() - 1);
                        }
                    }
                    break;
            }
            stringList = Arrays.stream(scanner.nextLine().split("\\s+")).collect(Collectors.toList());
        }
        System.out.println(intList.toString().replaceAll("[\\[\\],]", ""));
    }
}
