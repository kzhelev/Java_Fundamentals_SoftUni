package ArrayLists;

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
        int loops = intList.size()/2;

        for (int i = 0; i < loops; i++) {
            intList.set(i, (intList.get(i) + (intList.get((intList.size()-1)))));
            intList.remove(intList.size()-1);
        }
        for (int i = 0; i < intList.size(); i++) {
            System.out.print(intList.get(i)+" ");
        }
    }
}
