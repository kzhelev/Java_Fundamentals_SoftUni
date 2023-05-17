package ObjectsAndClasses;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Exc1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] array = scanner.nextLine().split(" ");
        Random random = new Random();
        String workStr = "";

        for (int i = 0; i < array.length; i++) {
            int rand = random.nextInt(array.length);
            workStr = array[i];
            array[i] = array[rand];
            array[rand] = workStr;
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
