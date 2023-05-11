package ArrayLists.Exc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Exc5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> intList = new ArrayList<>();
        intList = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());

        List<Integer> specialNumberAndPower = new ArrayList<>();
        specialNumberAndPower = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());

        List<Integer> positions = new ArrayList<>();
        positions.add(-1);
        boolean isTrue = true;
        while (isTrue) {
            for (int i = 0; i < intList.size(); i++) {
                if (intList.get(i).equals(specialNumberAndPower.get(0))) {
                    positions.set(0,i);
                        if (positions.get(0) + specialNumberAndPower.get(1) > intList.size() - 1) {
                            for (int j = positions.get(0)+1; j < intList.size(); j++) {
                                intList.remove(j);
                            }
                        } else {
                            for (int j = positions.get(0) + specialNumberAndPower.get(1); j > positions.get(0); j--) {
                                intList.remove(j);
                            }
                        }
                        if (positions.get(0) - specialNumberAndPower.get(1) < 0) {
                            for (int j = positions.get(0); j >= 0; j--) {
                                intList.remove(j);
                            }
                        } else {
                            for (int j = positions.get(0); j >= positions.get(0) - specialNumberAndPower.get(1) ; j--) {
                                intList.remove(j);
                            }
                        }
                    if (i == positions.get(0) ) {
                        i = -1;
                    }
                }
            }
            if (intList.size() == 0) {
                isTrue = false;
            } else {
                for (int i = 0; i < intList.size(); i++) {
                    if (!intList.get(i).equals(specialNumberAndPower.get(0))) {
                        isTrue = false;
                        break;
                    }
                }
            }
        }
        int sum = 0;
        for (int i = 0; i < intList.size(); i++) {
            sum += intList.get(i);
        }
        System.out.println(sum);
    }
}
