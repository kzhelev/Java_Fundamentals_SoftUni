package MidExam3;

import java.util.Arrays;
import java.util.Scanner;

public class Exc2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] sequenceInt = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        String input = scanner.nextLine();

        int targetIndex;
        int eliminated = 0;

        while (!"End".equals(input)) {

            targetIndex = Integer.parseInt(input);

            if (targetIndex >= 0 && targetIndex <= sequenceInt.length-1 && sequenceInt[targetIndex] != -1) {
                for (int i = 0; i < sequenceInt.length; i++) {
                    if (sequenceInt[targetIndex] >= sequenceInt[i] && i != targetIndex && sequenceInt[i] != -1) {
                       sequenceInt[i] += sequenceInt[targetIndex];
                    } else if (sequenceInt[targetIndex] < sequenceInt[i] && i != targetIndex && sequenceInt[i] != -1) {
                        sequenceInt[i] -= sequenceInt[targetIndex];
                    }
                }
                sequenceInt[targetIndex] = -1;
                eliminated++;
            }
            input = scanner.nextLine();
        }

        System.out.printf("Shot targets: %d -> ",eliminated);
        for (int i = 0; i < sequenceInt.length; i++) {
            System.out.print(sequenceInt[i]+" ");
        }

    }
}
