package MapsLambdaStreamAPI;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Exc41 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        String[] words = Arrays.stream(input).filter(w -> w.length() % 2 == 0).toArray(String[]::new);
        for (int i = 0; i < words.length; i++) {
            System.out.println(words[i]);
        }
    }
}
