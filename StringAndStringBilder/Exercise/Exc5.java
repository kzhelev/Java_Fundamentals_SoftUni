package StringAndStringBilder.Exercise;

import java.math.BigDecimal;
import java.util.Scanner;

public class Exc5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BigDecimal x = new BigDecimal(scanner.nextLine());
        BigDecimal y = new BigDecimal(scanner.nextLine());

        System.out.println(x.multiply(y));
    }
}
