package Lab3Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Demo2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int length = arr.length;
        int counter = arr.length;

        while (counter != 0) {
            for (int i = 0; i < length - 1; i++) {
                arr[i] += arr[i+1];
            }
            counter--;
            length--;
        }

        System.out.println(arr[0]);
    }
}
