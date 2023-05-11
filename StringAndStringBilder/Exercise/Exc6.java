package StringAndStringBilder.Exercise;

import java.util.Scanner;

public class Exc6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        char[] charInput = input.toCharArray();
        for (int i = 0; i < charInput.length; i++) {
            if (i != charInput.length-1 && charInput[i] != charInput[i+1]) {
                System.out.print(charInput[i]);
            }
        }
    }
}
