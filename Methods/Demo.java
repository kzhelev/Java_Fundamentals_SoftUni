package Methods;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(sum(Integer.parseInt(scanner.nextLine())));

    }
    public static int sum(int a) {
        if (a > 0) {
           return a + sum(a - 1);
        } else {
            return 0;
        }
    }
}
