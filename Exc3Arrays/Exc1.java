package Exc3Arrays;

import java.util.Scanner;

public class Exc1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int wagons = Integer.parseInt(scanner.nextLine());
        int count = 0;
        int[] train = new int[wagons];

        for (int i = 0; i < wagons; i++) {
            train[i] = Integer.parseInt(scanner.nextLine());
            count += train[i];
        }
        for (int j = 0; j < wagons; j++) {
            System.out.print(train[j]+" ");
        }
        System.out.printf("%n%d",count);
    }
}
