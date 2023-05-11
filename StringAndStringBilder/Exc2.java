package StringAndStringBilder;

import java.util.*;
import java.util.stream.Collectors;

public class Exc2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        List<String> inputMultiplied = new ArrayList<>();
        inputMultiplied = Arrays.stream(input).collect(Collectors.toList());

        for (int i = inputMultiplied.size()-1; i >= 0; i--) {
            for (int j = 0; j < inputMultiplied.get(i).length()-1; j++) {
                inputMultiplied.add(i, inputMultiplied.get(i));
            }
        }
        System.out.println(inputMultiplied.toString().replaceAll("[\\[\\], ]", ""));
    }
}
