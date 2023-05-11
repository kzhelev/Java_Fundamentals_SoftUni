package Exc3Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Exc5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] array = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int x = 0;
        for (int i = 0; i < array.length; i++) {
            x = 0;
            if (i == array.length-1) {
                System.out.print(array[i]);
            } else {
                for (int j = i + 1; j < array.length; j++) {
                    if (array[i] > array[j]) {
                        x++;
                    }
                    if (x == array.length - (i + 1)) {
                        System.out.print(array[i] + " ");
                    }
                }
            }
        }

    }
}
