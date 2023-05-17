package MidExam2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Exc2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arrayInt = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();

        String input = scanner.nextLine();
        List<String> command = new ArrayList<>();

        while (!"end".equals(input)) {
            command = Arrays.stream(input.split("\\s+")).collect(Collectors.toList());

            switch (command.get(0)) {
                case "swap":
                    int index1 = Integer.parseInt(command.get(1));
                    int index2 = Integer.parseInt(command.get(2));
                    int work = arrayInt[index1];
                    arrayInt[index1] = arrayInt[index2];
                    arrayInt[index2] = work;
                    break;
                case "multiply":
                    arrayInt[Integer.parseInt(command.get(1))] *= arrayInt[Integer.parseInt(command.get(2))];
                    break;
                case "decrease":
                    for (int i = 0; i < arrayInt.length; i++) {
                        arrayInt[i]--;
                    }
                    break;
            }
            input = scanner.nextLine();
        }
        for (int i = 0; i < arrayInt.length; i++) {
            if (i != arrayInt.length - 1) {
                System.out.print(arrayInt[i]+", ");
            } else {
                System.out.print(arrayInt[i]);
            }

        }
    }
}
