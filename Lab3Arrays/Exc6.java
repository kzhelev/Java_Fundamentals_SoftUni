package Lab3Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Exc6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arrayOne = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] arrayTwo = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int firstStrLength = arrayOne.length;
        int secondStrLength = arrayOne.length;
        int sum = 0;
        int differences = 0;
        int found = 0;


        for (int i = 0; i < firstStrLength; i++) {
            if (arrayOne[i] != arrayTwo[i]) {
                differences = i;
                found += 1;
                System.out.printf("Arrays are not identical. Found difference at %d index.",differences);
                break;

            } else {
                sum += arrayOne[i];
            }
        }
        if (found == 0) {
            System.out.printf("Arrays are identical. Sum: %d", sum);
        }
    }
}
