package Methods;

import java.util.Scanner;

public class Exc3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = Integer.parseInt(scanner.nextLine());

        pyramidPrinter(x);

    }


    public static void pyramidPrinter(int height) {
        int counter = 0;
        for (int i = 1; i <= height; i++) {
                for (int j = 1; j <= i; j++) {
                    System.out.print(j+" ");
                }
                System.out.println("");
            }

        for (int i = 1; i < height; i++) {
            for (int j = 1; j < height-counter; j++) {
                System.out.print(j+" ");
            }
            counter++;
            System.out.println("");
        }
    }
}
