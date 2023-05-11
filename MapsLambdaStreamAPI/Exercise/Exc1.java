package MapsLambdaStreamAPI.Exercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Exc1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        LinkedHashMap<Character, Integer> charCount = new LinkedHashMap<>();
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == ' ') {
                continue;
            }
            if (!charCount.containsKey(input.charAt(i))) {
                charCount.put(input.charAt(i), 1);
            } else {
                charCount.put(input.charAt(i), charCount.get(input.charAt(i))+1);
            }
        }
        for (Map.Entry<Character, Integer> count : charCount.entrySet()) {
            System.out.println(count.getKey() + " -> "+count.getValue());
        }

    }
}
