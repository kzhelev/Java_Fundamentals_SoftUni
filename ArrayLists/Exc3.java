package ArrayLists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Exc3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> intList1 = new ArrayList<>();
        List<Integer> intList2 = new ArrayList<>();
        intList1 = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        intList2 = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        int counter = 0;

        if (intList1.size() >= intList2.size()) {
            for (int i = 0; i < intList2.size(); i ++) {
                if (intList2.get(i) != 0) {
                    intList1.add(counter + 1, intList2.get(i));
                    counter+=2;
                }
            }
            for (int i = 0; i < intList1.size(); i++) {
                System.out.print(intList1.get(i) + " ");
            }
        } else {
            for (int i = 0; i < intList1.size(); i ++) {
                if (intList1.get(i) != 0) {
                    intList2.add(counter, intList1.get(i));
                    counter+=2;
                }
            }
            for (int i = 0; i <intList2.size(); i ++) {
                System.out.print(intList2.get(i) + " ");
            }
        }
    }
}
