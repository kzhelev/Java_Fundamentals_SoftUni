package Exc2;

import java.util.Scanner;

public class Exc3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int people = Integer.parseInt(scanner.nextLine());
        int capacity = Integer.parseInt(scanner.nextLine());

        double courses = Math.ceil((double)people/capacity);
        System.out.printf("%.0f",courses);
    }
}
