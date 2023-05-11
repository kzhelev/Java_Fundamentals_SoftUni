package MapsLambdaStreamAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<List<String>> bigList = new ArrayList<>();

        for (int i = 0; i < 2 ; i++) {
            bigList.add(new ArrayList<>());
            bigList.get(i).addAll(Arrays.stream(scanner.nextLine().split(" ")).collect(Collectors.toList())) ;
        }
        System.out.println(bigList);

        String[][] arrArray = new String[2][];
        for (int i = 0; i < 2; i++) {
            arrArray[i] = scanner.nextLine().split(" ");
        }
        for (int i = 0; i < arrArray.length; i++) {
            for (int j = 0; j < arrArray[i].length; j++) {
                System.out.println(arrArray[i][j]);
            }
        }
    }
}
