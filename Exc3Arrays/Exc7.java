package Exc3Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Exc7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int length = 0;
        int maxLength = Integer.MIN_VALUE;
        int [] arrayNew = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            for (int j = i+1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    length ++;
                } else {
                    break;
                }
            }
            if (length >= 1 && length > maxLength) {
                for (int j = 0; j <= length; j++) {
                    arrayNew[j] = array[i];
                }
                maxLength = length;
            }
            length = 0;
        }
        for (int i = 0; i <= maxLength; i++) {
            System.out.print(arrayNew[i] + " ");
        }
    }
}
