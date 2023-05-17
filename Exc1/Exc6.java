package Exc1;

import java.util.Scanner;

public class Exc6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        String numberStr = scanner.nextLine();
        int numberInt = Integer.parseInt(numberStr);

        int loops = numberStr.length();
        int factorialSum = 0;
        int factorial = 1;

        for (int i = 0; i < loops; i++) {
            char a = numberStr.charAt(i);
            int digit1 = Character.getNumericValue(a);
            for (int j = 1; j <= digit1; j++) {
                factorial *= j;
            }
            factorialSum += factorial;
            factorial = 1;
        }

        if (factorialSum == numberInt) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}
