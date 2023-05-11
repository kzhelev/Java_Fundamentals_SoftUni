package RegularMidExam;

import java.awt.image.AreaAveragingScaleFilter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Exc2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> intList = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt)
                .collect(Collectors.toList());
        List<String> command = Arrays.stream(scanner.nextLine().split("\\s+")).collect(Collectors.toList());

        while (!command.get(0).equals("Finish")) {
            switch (command.get(0)) {
                case "Add":
                    intList.add(Integer.parseInt(command.get(1)));
                    break;
                case "Remove":
                    int index = intList.indexOf(Integer.parseInt(command.get(1)));
                    intList.remove(index);
                    break;
                case "Replace":
                    index = intList.indexOf(Integer.parseInt(command.get(1)));
                    intList.set(index, Integer.parseInt(command.get(2)));
                    break;
                case "Collapse":
                    for (int i = intList.size()-1; i >= 0; i--) {
                        if (intList.get(i) < Integer.parseInt(command.get(1))) {
                            intList.remove(i);
                        }
                    }
                    break;
            }
            command = Arrays.stream(scanner.nextLine().split("\\s+")).collect(Collectors.toList());
        }
        System.out.println(intList.toString().replaceAll("[\\[\\],]", ""));
    }
}
