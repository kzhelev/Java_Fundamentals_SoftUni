package StringAndStringBilder.Exercise;

import java.util.Scanner;

public class Exc2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] string = scanner.nextLine().split(" ");

        char[] first = string[0].toCharArray();
        char[] second = string[1].toCharArray();
        int sum = 0;

        if (first.length >= second.length) {
            for (int i = 0; i < second.length; i++) {
                sum += first[i] * second[i];
            }
            for (int i = second.length; i < first.length; i++) {
                sum += first[i];
            }
        } else {
            for (int i = 0; i < first.length; i++) {
                sum += first[i] * second[i];
            }
            for (int i = first.length; i < second.length; i++) {
                sum += second[i];
            }
        }
        System.out.println(sum);
    }
}
