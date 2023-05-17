package Lab2;

import java.util.Scanner;

public class Exc6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char a = scanner.next().charAt(0);
        char b = scanner.next().charAt(0);
        char c = scanner.next().charAt(0);

        StringBuilder combinedChars = new StringBuilder().append(a).append(b).append(c);

        System.out.println(combinedChars);

        System.out.printf("%c%c%c", a,b,c);
    }
}
