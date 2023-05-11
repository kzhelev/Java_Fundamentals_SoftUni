package MapsLambdaStreamAPI;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Exc4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        LinkedHashMap<String, Integer> wordsMap = new LinkedHashMap<>();
        for (int i = 0; i < input.length; i++) {
            wordsMap.put(input[i], input[i].length());
        }
        for (Map.Entry<String, Integer> in : wordsMap.entrySet()) {
            if (in.getValue() % 2 == 0) {
                System.out.println(in.getKey());
            }
        }


    }
}
