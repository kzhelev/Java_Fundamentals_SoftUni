package ArrayLists.Exc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import static java.util.stream.Collectors.*;

public class Exc7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> stringList = new ArrayList<>();
        String string = scanner.nextLine().replaceAll("\\s+", " ");
        stringList = Arrays.stream(string.split("\\|")).collect(toList());

        List<String>[] arrays = new List[stringList.size()];

        for (int i = 0; i < stringList.size(); i++) {
            arrays[i] = new ArrayList<>();
            arrays[i] = Arrays.stream(stringList.get(i).split(" ")).collect(toList());

        }
        for (int i = 0; i < stringList.size(); i++) {
            for (int j = 0; j < arrays[i].size(); j++) {
                if (arrays[i].get(j).equals("")) {
                    arrays[i].remove(j);
                }
            }
        }

        for (int i = stringList.size()-1; i >= 0; i--) {
            for (int j = 0; j < arrays[i].size(); j++) {
                System.out.print(arrays[i].get(j)+" ");
            }
        }

//32 3213 321 345 3 |   2312 34 5| 5435 |54

    }
}
