package Exc2;

import java.util.Scanner;

public class Exc9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int startingYield = Integer.parseInt(scanner.nextLine());

        int days = 0;
        int yield = 0;
        int extracted = 0;

        while (startingYield >= 100) {
            extracted = startingYield;
            yield += extracted - 26;
            startingYield -= 10;
            days += 1;
        }
        yield -= 26;
        if (yield < 0) {
            yield = 0;
        }
        System.out.println(days);
        System.out.println(yield);
    }
}
