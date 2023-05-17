package Lab3Arrays;

import java.util.Scanner;

public class Exc4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /* Този метод става ако са единични букви.

        StringBuffer string = new StringBuffer(scanner.nextLine()).reverse();
        String[] x = string.toString().split(" ");

        for (int i = 0; i < x.length; i++) {
            System.out.print(x[i]+" ");
        } */
        String[] strings = scanner.nextLine().split(" ");
        for (int i = strings.length-1; i >= 0 ; i--) {
            System.out.print(strings[i]+" ");
        }
    }
}
