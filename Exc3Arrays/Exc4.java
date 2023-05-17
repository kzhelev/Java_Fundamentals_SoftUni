package Exc3Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Exc4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] input = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int rotations = Integer.parseInt(scanner.nextLine());
        int x = 0;

        for (int i = 0; i < rotations; i++) {
            for (int j = 0; j < input.length-1; j++) {
                x = input[j+1];
                input[j+1] = input[j];
                input[j] = x;
            }
        }
        for (int j = 0; j < input.length; j++) {
            System.out.print(input[j]+" ");
        }
    }
}
