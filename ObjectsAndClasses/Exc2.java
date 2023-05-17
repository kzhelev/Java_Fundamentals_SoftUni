package ObjectsAndClasses;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;

public class Exc2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BigDecimal first = new BigDecimal(scanner.nextLine());
        BigDecimal second = new BigDecimal(scanner.nextLine());
        BigDecimal third = first.add(second);
        System.out.println(third);
    }
}
