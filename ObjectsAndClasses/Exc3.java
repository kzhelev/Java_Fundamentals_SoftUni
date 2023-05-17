package ObjectsAndClasses;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;

public class Exc3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rand = scanner.nextInt();
        BigDecimal a = new BigDecimal(1);

        for (int i = 1; i <= rand; i++) {
            a = a.multiply(new BigDecimal(i));
        }
        System.out.println(a);
    }
}
