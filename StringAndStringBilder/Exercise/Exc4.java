package StringAndStringBilder.Exercise;

import java.util.Scanner;

public class Exc4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        char[] decrypted = string.toCharArray();
        char[] encrypted = new char[decrypted.length];
        for (int i = 0; i < decrypted.length; i++) {
            encrypted[i] = (char) (decrypted[i]+3);
        }
        for (int i = 0; i < encrypted.length; i++) {
            System.out.print(encrypted[i]);
        }
    }
}
