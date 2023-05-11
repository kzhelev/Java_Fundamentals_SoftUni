package Exc3Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Exc6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] array = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int printed = 0;
        int rightSum = 0;
        int leftSum = 0;

        for (int i = 0; i < array.length; i++) {

            if (i == 0) {
                leftSum = 0;
                rightSum = 0;
                for (int j = i+1; j < array.length; j++) {
                    rightSum += array[j];
                }
                if (rightSum == leftSum) {
                    System.out.print(i);
                    printed ++;
                }
            } else if (i == array.length-1) {
                rightSum = 0;
                leftSum = 0;
                for (int j = array.length-2; j >= 0 ; j--) {
                    leftSum += array[j];
                }
                if (rightSum == leftSum) {
                    System.out.print(i+" ");
                    printed ++;
                }
            } else {
                rightSum = 0;
                leftSum = 0;
                for (int j = i+1; j < array.length ; j++) {
                    rightSum += array[j];
                }
                for (int j = i-1; j >= 0; j--) {
                    leftSum += array[j];
                }
                if (rightSum == leftSum) {
                    System.out.print(i+" ");
                    printed ++;
                }
            }
        }
        if (printed == 0) {
            System.out.println("no");
        }
    }
}
