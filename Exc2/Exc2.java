package Exc2;

import java.util.Scanner;

public class Exc2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int sum = 0;

        for (int i = 0; i < String.valueOf(n).length(); i++) {
            char a = String.valueOf(n).charAt(i);
            sum += Character.getNumericValue(a);
        }
        System.out.println(sum);
    }
}
