package Lab3Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Exc7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] array = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        while (true) {
            int[] arrayNew = new int[array.length-1];
            if (array.length == 1) {
                System.out.println(array[0]);
                break;
            }
            for (int i = 0; i < array.length-1; i++) {
                arrayNew[i] = array[i] + array[i + 1];
                if (i + 1 == array.length) {
                    arrayNew[i] = array[array.length - 1];
                    break;
                }

            }
                array = arrayNew;
        }
    }
}

