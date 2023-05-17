package Lab2;

import java.util.Scanner;

public class Exc8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char a = scanner.next().charAt(0);
        if (Character.isUpperCase(a)) {
            System.out.println("upper-case");
        } else {
            System.out.println("lower-case");
        }


    }
}
