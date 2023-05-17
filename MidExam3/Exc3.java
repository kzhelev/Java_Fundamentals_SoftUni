package MidExam3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Exc3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> targets = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt)
                .collect(Collectors.toList());

        List<String> command = Arrays.stream(scanner.nextLine().split("\\s+")).collect(Collectors.toList());

        while (!command.get(0).equals("End")) {
            switch (command.get(0)) {
                case "Shoot":
                    int index = Integer.parseInt(command.get(1));
                    int power = Integer.parseInt(command.get(2));
                    if (index >= 0 && index <= targets.size()-1) {
                        if (power >= targets.get(index)) {
                            targets.remove(index);
                        } else {
                            targets.set(index, targets.get(index)-power);
                        }
                    }
                    break;
                case "Add":
                    index = Integer.parseInt(command.get(1));
                    int value = Integer.parseInt(command.get(2));
                    if (index >= 0 && index <= targets.size()-1) {
                        targets.add(index,value);
                    } else {
                        System.out.println("Invalid placement!");
                    }
                    break;
                case "Strike":
                    index = Integer.parseInt(command.get(1));
                    int radius = Integer.parseInt(command.get(2));
                    if (index >= 0 && index <= targets.size()-1 && index - 0 >= radius && targets.size() - index >= radius) {
                        for (int i = index+radius; i >= index-radius; i--) {
                            targets.remove(i);
                        }
                    } else {
                        System.out.println("Strike missed!" );
                    }
                    break;
            }
            command = Arrays.stream(scanner.nextLine().split("\\s+")).collect(Collectors.toList());
        }
        for (int i = 0; i < targets.size(); i++) {
            if (i != targets.size()-1) {
                System.out.print(targets.get(i) + "|");
            } else {
                System.out.print(targets.get(i));
            }
        }
    }
}
