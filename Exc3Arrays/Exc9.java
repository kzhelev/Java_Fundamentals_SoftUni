package Exc3Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Exc9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        String[] command = scanner.nextLine().split(" ");
        int indexOne = 0;
        int indexTwo = 0;
        int freeToUse = 0;
        

        while (!"end".equals(command[0])){
            if ("decrease".equals(command[0])) {
                for (int i = 0; i < array.length; i++) {
                    array[i] --;
                }
            } else if ("swap".equals(command[0])) {
                indexOne = Integer.parseInt(command[1]);
                indexTwo = Integer.parseInt(command[2]);
                freeToUse = array[indexOne];
                array[indexOne] = array[indexTwo];
                array[indexTwo] = freeToUse;
            } else if ("multiply".equals(command[0])) {
                indexOne = Integer.parseInt(command[1]);
                indexTwo = Integer.parseInt(command[2]);
                array[indexOne] *= array[indexTwo];
            }
            command = scanner.nextLine().split(" ");
        }
        for (int i = 0; i < array.length; i++) {
            if (i != array.length-1) {
                System.out.printf("%d, ", array[i]);
            } else {
                System.out.printf("%d", array[i]);
            }
        }
    }
}
