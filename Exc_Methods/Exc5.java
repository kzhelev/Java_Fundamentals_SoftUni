package Exc_Methods;

import java.util.Scanner;

public class Exc5 {
    public static void sumSub(Scanner scanner) {
        System.out.println((Integer.parseInt(scanner.nextLine())+Integer.parseInt(scanner.nextLine()))-
                Integer.parseInt(scanner.nextLine()));
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        sumSub(scanner);
    }
}
