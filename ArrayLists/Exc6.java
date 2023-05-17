package ArrayLists;

import java.util.*;

public class Exc6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        List<String> stringList = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            stringList.add(scanner.nextLine());
        }

        Collections.sort(stringList);
        for (int i = 0; i < stringList.size(); i++) {
            System.out.print(i + 1 + ".");
            System.out.println(stringList.get(i) + " ");
        }
    }
}
