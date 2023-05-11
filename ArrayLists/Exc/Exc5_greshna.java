package ArrayLists.Exc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Exc5_greshna {
    public static int sum = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> intList = new ArrayList<>();
        intList = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());

        List<Integer> specialNumberAndPower = new ArrayList<>();
        specialNumberAndPower = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());

        List<Integer> positions = new ArrayList<>();

        int counter = 0;
        int counter2 = 0;
        boolean dontAdd = false;

        for (int i = 0; i < intList.size(); i++) {
            if (intList.get(i).equals(specialNumberAndPower.get(0))) {
                dontAdd = false;
                for (int j = 1; j <= specialNumberAndPower.get(1); j++) {
                    if (i-j < 0 ) {

                    } else {
                        if (intList.get(i).equals(intList.get(i - j)) && !intList.get(i).equals(intList.get(i
                                - (specialNumberAndPower.get(1) + 1)))) {
                            dontAdd = true;
                            break;
                        }
                    }
                }
                if (!dontAdd) {
                positions.add(i);
                counter++;
                }
            }
        }
        for (int i = counter-1; i >= 0; i--) {
            for (int j = 0; j < specialNumberAndPower.get(1); j++) {
                if (positions.get(i)+(1-j) > intList.size()-1) {

                } else {
                    intList.remove(positions.get(i) + (1 - j));
                }
                if (positions.get(i)-(1+j) < 0) {

                } else {
                    intList.remove(positions.get(i)-(1+j));
                }
            }
            intList.remove(specialNumberAndPower.get(0));
        }

        for (int i = 0; i < intList.size(); i++) {
            sum += intList.get(i);
        }
        System.out.println(sum);
    }
}
