package Exc3Arrays;

import java.util.Scanner;

public class Exc2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] arrayOne = scanner.nextLine().split(" ");
        String[] arrayTwo = scanner.nextLine().split(" ");

        for (int i = 0; i < arrayTwo.length ; i++) {
            for (int j = 0; j < arrayOne.length; j++) {
                if (arrayTwo[i].equals(arrayOne[j])) {
                    System.out.print(arrayTwo[i]+" ");
                    break;
                }
            }
        }
    }
}
