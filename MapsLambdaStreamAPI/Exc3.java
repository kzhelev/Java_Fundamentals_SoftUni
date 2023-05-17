package MapsLambdaStreamAPI;

import javax.swing.*;
import java.util.*;

public class Exc3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().toLowerCase().split(" ");
        LinkedHashMap<String, List<Integer>> inputMap = new LinkedHashMap<>();
        int counter = 0;
        for (int i = 0; i < input.length; i++) {
            if (inputMap.containsKey(input[i])) {
                inputMap.get(input[i]).add(i);
            } else {
                inputMap.put(input[i], new ArrayList<>());
                inputMap.get(input[i]).add(i);
            }
        }
        List<String> printArr = new ArrayList<>();
        for (Map.Entry<String, List<Integer>> in : inputMap.entrySet()) {
            if (in.getValue().size() % 2 != 0) {
                printArr.add(in.getKey());
            }
        }
        System.out.print(printArr.toString().replaceAll("[\\[\\]]", ""));
    }
}
