package Methods;

import java.util.Scanner;

public class Exc4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String action = scanner.nextLine();
        int x = Integer.parseInt(scanner.nextLine());
        int y = Integer.parseInt(scanner.nextLine());
        calculation(action,x,y);

    }
    public static void calculation(String action, int x, int y) {
        switch (action) {
            case "add":
                add(x,y);
                break;
            case "multiply":
                multiply(x,y);
                break;
            case "subtract":
                subtract(x,y);
                break;
            case "divide":
                divide(x,y);
                break;
        }
    }
    public static void add(int x, int y) {
        int result = x + y;
        System.out.println(result);
    }
    public static void multiply(int x, int y) {
        int result = x * y;
        System.out.println(result);
    }
    public static void subtract(int x, int y) {
        int result = x - y;
        System.out.println(result);
    }
    public static void divide(int x, int y) {
        int result = x / y;
        System.out.println(result);
    }

}
