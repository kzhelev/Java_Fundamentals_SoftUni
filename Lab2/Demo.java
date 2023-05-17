package Lab2;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char a = scanner.next().charAt(0);

        if (Character.isUpperCase(a)) {
            a = Character.toLowerCase(a);
            System.out.println(a);
        }
    }
}
