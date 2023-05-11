package Methods;

import java.util.Scanner;

public class Exc6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(rectangleArea(scanner));

    }
    public static int rectangleArea(Scanner scanner) {
        return (Integer.parseInt(scanner.nextLine()) * Integer.parseInt(scanner.nextLine()));
    }
}
