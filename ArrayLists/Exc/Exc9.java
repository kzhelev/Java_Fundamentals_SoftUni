package ArrayLists.Exc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Exc9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> intList = new ArrayList<>();
        intList = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        int index;
        int workInteger = 0;
        int sum = 0;

        while (intList.size() != 0) {
            index = Integer.parseInt(scanner.nextLine());
            if (index < 0) {
                workInteger = intList.get(0);
                sum += workInteger;
                intList.set(0, intList.get(intList.size() - 1));

                for (int i = 0; i < intList.size(); i++) {
                    if (workInteger >= intList.get(i)) {
                        intList.set(i, workInteger + intList.get(i));
                    } else {
                        intList.set(i, intList.get(i) - workInteger);
                    }
                }

            } else if (index > intList.size() - 1) {
                workInteger = intList.get(intList.size() - 1);
                sum += workInteger;
                intList.set(intList.size() - 1, intList.get(0));

                for (int i = 0; i < intList.size(); i++) {
                    if (workInteger >= intList.get(i)) {
                        intList.set(i, workInteger + intList.get(i));
                    } else {
                        intList.set(i, intList.get(i) - workInteger);
                    }
                }
            } else {
                workInteger = intList.get(index);
                sum += workInteger;
                intList.remove(index);
                for (int i = 0; i < intList.size(); i++) {
                    if (workInteger >= intList.get(i)) {
                        intList.set(i, workInteger + intList.get(i));
                    } else {
                        intList.set(i, intList.get(i) - workInteger);
                    }
                }
            }
        }
        System.out.println(sum);
    }
}
