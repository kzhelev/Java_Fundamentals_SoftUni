package Exc3Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Exc3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lines = Integer.parseInt(scanner.nextLine());

        int[] input = new int[2];
        int[] leftNumbers = new int[lines];
        int[] rightNumbers = new int[lines];

        for (int i = 0; i < lines; i++) {
            input = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

            if (i % 2 == 0) {
                leftNumbers[i] = input[0];
                rightNumbers[i] = input[1];
            } else {
                leftNumbers[i] = input[1];
                rightNumbers[i] = input[0];
            }
        }

        for (int i = 0; i < lines; i++) {
            System.out.print(leftNumbers[i]+" ");
        }
        System.out.print("\n");
        for (int i = 0; i < lines; i++) {
            System.out.print(rightNumbers[i]+" ");
        }
    }
}
