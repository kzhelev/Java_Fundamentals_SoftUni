package StringAndStringBilder;

import java.util.Scanner;

public class Exc3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String substract = scanner.next();
        String input = scanner.next();


        while (input.contains(substract)) {
            input = input.replace(substract, "");
        }
        System.out.println(input);
    }
}
