package ArrayLists.Exc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Exc2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> intList = new ArrayList<>();

        intList = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        List<String> command = new ArrayList<>();
        command = Arrays.stream(scanner.nextLine().split(" ")).collect(Collectors.toList());

        while (!command.get(0).equals("end")) {
            switch (command.get(0)) {
                case "Delete":
                    for (int i = 0; i < intList.size(); i++) {
                        intList.remove(Integer.valueOf(command.get(1)));
                    }
                    break;
                case "Insert":
                    intList.add(Integer.parseInt(command.get(2)),Integer.parseInt(command.get(1)));
                    break;
            }
            command = Arrays.stream(scanner.nextLine().split(" ")).collect(Collectors.toList());
        }
        System.out.println(intList.toString().replaceAll("[\\[\\],]", ""));
    }
}
