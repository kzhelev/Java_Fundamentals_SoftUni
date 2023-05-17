package Exc2;

import java.util.Scanner;

public class Exc5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int startPoint = Integer.parseInt(scanner.nextLine());
        int endPoint = Integer.parseInt(scanner.nextLine());

        for (int i = startPoint; i <= endPoint; i++) {
            char a = (char) i;
            System.out.print(a+" ");
        }
    }
}
