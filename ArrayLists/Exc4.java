package ArrayLists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Exc4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> stringList = new ArrayList<>();
        stringList = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        List<String> inputList = new ArrayList<>();
        inputList = Arrays.stream(scanner.nextLine().split(" ")).collect(Collectors.toList());

        while (!inputList.get(0).equals("end")) {

            switch (inputList.get(0)) {
                case "Add":
                    stringList.add(Integer.parseInt(inputList.get(1)));
                    break;
                case "Remove":
                    stringList.remove(Integer.valueOf(Integer.parseInt(inputList.get(1))));
                    break;
                case "RemoveAt":
                    stringList.remove(Integer.parseInt(inputList.get(1)));
                    break;
                case "Insert":
                    stringList.add(Integer.parseInt(inputList.get(2)), Integer.parseInt(inputList.get(1)));
                    break;
            }
            inputList = Arrays.stream(scanner.nextLine().split(" ")).collect(Collectors.toList());
        }
        for (int i = 0; i < stringList.size(); i++) {
            System.out.print(stringList.get(i)+" ");
        }
    }
}
