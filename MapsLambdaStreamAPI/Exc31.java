package MapsLambdaStreamAPI;

import java.util.*;

public class Exc31 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().toLowerCase().split(" ");
        LinkedHashMap<String, Integer> inputMap = new LinkedHashMap<>();
        int counter = 0;
        for (int i = 0; i < input.length; i++) {
            if (i == 0) {
                inputMap.put(input[i], 0);
            } else if (inputMap.containsKey(input[i])) {
                inputMap.put(input[i], inputMap.get(input[i])+1);
            } else if (!inputMap.containsKey(input[i])) {
                inputMap.put(input[i], 0);
            }
        }
        List<String> printArr = new ArrayList<>();
        for (Map.Entry<String, Integer> in : inputMap.entrySet()) {
            if (in.getValue() % 2 != 0) {
                printArr.add(in.getKey());
            }
        }
        System.out.print(printArr.toString().replaceAll("[\\[\\]]", ""));
    }
}
