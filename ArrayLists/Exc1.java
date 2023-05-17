package ArrayLists;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Exc1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Double> intList = new LinkedList<>();
        intList = Arrays.stream(scanner.nextLine().split(" ")).map(Double::parseDouble).collect(Collectors.toList());

        for (int i = 0; i < intList.size()-1; i++) {
            if (intList.get(i).equals(intList.get(i+1)) ) {
                intList.set(i,(intList.get(i) + intList.get(i+1)));
                intList.remove(i+1);
                i = -1;
            }
        }
        for (int i = 0; i < intList.size(); i++) {
            System.out.print(new DecimalFormat("0.#").format(intList.get(i))+" ");
        }
    }
}
