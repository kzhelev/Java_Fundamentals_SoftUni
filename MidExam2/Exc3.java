package MidExam2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Exc3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] integerList = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt)
                .toArray();

        double sum = 0;

        for (int i = 0; i < integerList.length; i++) {
            sum += integerList[i];
        }

        double average = sum / integerList.length;

        int[] workArray = new int[integerList.length];

        for (int i = 0; i < integerList.length; i++) {
            if (average < integerList[i]) {
                workArray[i] = integerList[i];
            }
        }

        workArray = Arrays.stream(workArray).sorted().toArray();

        int numberPrinted = 0;

        int counter = 0;
        if (workArray[workArray.length - 1] > 0) {
            for (int i = workArray.length - 1; i >= 0; i--) {
                counter++;
                if (workArray[i] != 0) {
                    System.out.print(workArray[i] + " ");
                    numberPrinted++;
                }
                if (counter == 5) {
                    break;
                }
            }
        } else {
            for (int i = workArray.length - 1; i >= 0; i--) {

                if (workArray[i] != 0) {
                    System.out.print(workArray[i] + " ");
                    numberPrinted++;
                }
                if (numberPrinted == 5) {
                    break;
                }
            }
        }

        if (numberPrinted == 0) {
            System.out.println("No");
        }
    }
}
