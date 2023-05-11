package Lab3Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Exc3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;

        String[] string = scanner.nextLine().split(" ");
        int[] numbers = new int[string.length];
        for (int j = 0; j < string.length; j++) {
            numbers[j] = Integer.parseInt(string[j]);
        }

        // Стринг масив може да се преобразува в инт масив и с един ред ->
        // int[] numbers = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(e-> Integer.parseInt(e)).toArray();

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                sum += numbers[i];
            }
        }
        System.out.println(sum);
    }
}
