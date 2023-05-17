package Demo;

import java.util.Locale;
import java.util.Scanner;

public class stringFunctions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();

        int length = a.length();

        for (int i = 0; i < length; i++) {
            char b = a.charAt(i);
            if (b >= 65 && b <= 90) {
                b += 32;
            }
            System.out.print(b);
        }
        System.out.println("");

        for (int j = length-1; j >= 0; j--) {
            char c = a.charAt(j);
            if (c >= 65 && c <= 90) {
                c += 32;
            }
            System.out.print(c);
        }
        System.out.println("");

        String z = a.toUpperCase(Locale.ROOT);
        System.out.println(z);
        z = a.toLowerCase();
        System.out.println(z);



    }
}
