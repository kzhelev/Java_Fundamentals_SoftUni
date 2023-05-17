package StringAndStringBilder;

import java.util.Scanner;

public class Exc4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(", ");
        String text = scanner.nextLine();
        StringBuilder[] inputSB = new StringBuilder[input.length];
        for (int i = 0; i < input.length; i++) {
            inputSB[i] = new StringBuilder("");
        }
        for (int i = 0; i < input.length; i++) {
            for (int j = 0; j < input[i].length(); j++) {
                inputSB[i].append("*");
            }
        }
        for (int i = 0; i < input.length; i++) {
            text = text.replaceAll(input[i], inputSB[i].toString());
        }

        System.out.println(text);

    }
}
