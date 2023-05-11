package Lab3Arrays;

import java.util.Scanner;

public class Exc2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());

        int[] numbersArray = new int[number];
        for (int i = 0; i < number; i++) {
            numbersArray[i] = Integer.parseInt(scanner.nextLine());
        }
        for (int j = number-1; j >= 0 ; j--) {
            System.out.print(numbersArray[j]+" ");
        }
    }
}
