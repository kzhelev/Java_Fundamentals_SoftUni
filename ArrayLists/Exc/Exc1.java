package ArrayLists.Exc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Exc1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> wagonList = new ArrayList<>();

        wagonList = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        int max = Integer.parseInt(scanner.nextLine());

        List<String> command = new ArrayList<>();
        command = Arrays.stream(scanner.nextLine().split(" ")).collect(Collectors.toList());

        while(true) {
            if ("end".equals(command.get(0))) {
                break;
            } else if (command.get(0).equals("Add")) {
                wagonList.add(Integer.parseInt(command.get(1)));
            } else {
                int peopleToAdd = Integer.parseInt(command.get(0));
                for (int i = 0; i < wagonList.size(); i++) {
                    if (wagonList.get(i) + peopleToAdd <= max ) {
                        wagonList.set(i, wagonList.get(i) + peopleToAdd);
                        break;
                    }
                }
            }
            command = Arrays.stream(scanner.nextLine().split(" ")).collect(Collectors.toList());
        }
        System.out.println(wagonList.toString().replaceAll("[\\[\\],]", ""));
    }
}
