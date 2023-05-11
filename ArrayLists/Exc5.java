package ArrayLists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Exc5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> intList = new ArrayList<>();
        intList = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        List<String> stringList = new ArrayList<>();
        stringList = Arrays.stream(scanner.nextLine().split(" ")).collect(Collectors.toList());

        while (!stringList.get(0).equals("end")) {
            switch (stringList.get(0)) {
                case "Contains":
                    if (intList.contains(Integer.parseInt(stringList.get(1)))) {
                        System.out.println("Yes");
                    } else {
                        System.out.println("No such number");
                    }
                    break;
                case "Print":
                    if (stringList.get(1).equals("even")) {
                        for (int i = 0; i < intList.size(); i++) {
                            if (intList.get(i) % 2 == 0) {
                                System.out.print(intList.get(i)+" ");
                            }
                        }
                    } else if (stringList.get(1).equals("odd")) {
                        for (int i = 0; i < intList.size(); i++) {
                            if (intList.get(i) % 2 != 0) {
                                System.out.print(intList.get(i)+" ");
                            }
                        }
                    }
                    System.out.println("");
                    break;
                case "Get":
                    int sum = 0;
                    if (stringList.get(1).equals("sum")) {
                        for (int i = 0; i < intList.size(); i++) {
                            sum += intList.get(i);
                        }
                        System.out.println(sum);
                    }
                    break;
                case "Filter":
                    if (stringList.get(1).equals("<")) {
                        for (int i = 0; i < intList.size(); i++) {
                            if (intList.get(i) < Integer.parseInt(stringList.get(2))){
                                System.out.print(intList.get(i)+" ");
                            }
                        }
                        System.out.println("");
                    }
                    if (stringList.get(1).equals(">")) {
                        for (int i = 0; i < intList.size(); i++) {
                            if (intList.get(i) > Integer.parseInt(stringList.get(2))){
                                System.out.print(intList.get(i)+" ");
                            }
                        }
                        System.out.println("");
                    }
                    if (stringList.get(1).equals("<=")) {
                        for (int i = 0; i < intList.size(); i++) {
                            if (intList.get(i) <= Integer.parseInt(stringList.get(2))){
                                System.out.print(intList.get(i)+" ");
                            }
                        }
                        System.out.println("");
                    }
                    if (stringList.get(1).equals(">=")) {
                        for (int i = 0; i < intList.size(); i++) {
                            if (intList.get(i) >= Integer.parseInt(stringList.get(2))){
                                System.out.print(intList.get(i)+" ");
                            }
                        }
                        System.out.println("");
                    }
                    break;
            }
            stringList = Arrays.stream(scanner.nextLine().split(" ")).collect(Collectors.toList());
        }
    }
}
