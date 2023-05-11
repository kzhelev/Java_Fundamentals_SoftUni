package Lab3Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Exc5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sumEven = 0;
        int sumOdd = 0;
        int[] numbers = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                sumEven += numbers[i];
            } else {
                sumOdd += numbers[i];
            }
        }
        System.out.println(Math.abs(sumEven-sumOdd));
        // За да излезе в джъдж тряба да е без мат.библиотека, но това е грешно спрямо условието /според мен/;
    }
}
