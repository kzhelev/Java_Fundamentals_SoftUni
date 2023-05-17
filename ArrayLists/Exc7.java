package ArrayLists;

import java.text.CollationElementIterator;
import java.util.*;
import java.util.stream.Collectors;

public class Exc7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> intList = new ArrayList<>();
        intList = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        for (int i = 0; i < intList.size(); i++) {
            if (intList.get(i) < 0) {
                intList.remove(i);
                i = -1;
            }
        }
        if (intList.size() == 0) {
            System.out.println("empty");
        } else {
            Collections.reverse(intList);
            System.out.println(intList.toString().replaceAll("[\\[\\],]", ""));
        }
    }

}
