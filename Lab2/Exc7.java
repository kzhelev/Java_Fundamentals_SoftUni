package Lab2;

import java.util.Scanner;

public class Exc7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char a = scanner.next().charAt(0);
        char b = scanner.next().charAt(0);
        char c = scanner.next().charAt(0);
        char space = ' ';
        char asd = 50;

        StringBuilder combinedChars = new StringBuilder().append(c).append(space).append(b).append(space).append(a);

        System.out.println(combinedChars);


        System.out.printf("%c %c %c",c ,b, a);

    }
}
