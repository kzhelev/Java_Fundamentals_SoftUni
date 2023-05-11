package Exc_Methods;

import java.util.Scanner;

public class Exc10 {
    public static void topNumber(Scanner scanner) {
        int x = Integer.parseInt(scanner.nextLine());
        boolean thereIsOdd = false;
        int count = 0;
        int[] array = new int[x];
        for (int i = 1; i < x; i++) {
            array[i] = i;
        }
        for (int i = 0; i < x; i++) {
            char[] arrChar = new char[String.valueOf(array[i]).length()];
            for (int j = 0; j < String.valueOf(array[i]).length(); j++) {
                arrChar[j] = String.valueOf(array[i]).charAt(j);
                count += Character.getNumericValue(arrChar[j]);
            }
            if (count % 8 != 0) {
                array[i] = 0;
            }
            count = 0;
        }
        for (int i = 0; i < x; i++) {
            char[] arrChar = new char[String.valueOf(array[i]).length()];
            for (int j = 0; j < String.valueOf(array[i]).length(); j++) {
                arrChar[j] = String.valueOf(array[i]).charAt(j);
                if (arrChar[j] % 2 != 0) {
                    thereIsOdd = true;
                    break;
                }
            }
            if (!thereIsOdd) {
                array[i] = 0;
            }
            thereIsOdd = false;
        }
        for (int i = 0; i < x; i++) {
            if (array[i] != 0) {
                System.out.println(array[i]);
            }
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        topNumber(scanner);
    }
}
