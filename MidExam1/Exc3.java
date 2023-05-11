package MidExam1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Exc3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> playSequence = Arrays.stream(scanner.nextLine().split("\\s+")).collect(Collectors.toList());

        String input = scanner.nextLine();

        List<Integer> indexes = new ArrayList<>();
        int counter = 0;

        while (!"end".equals(input)) {
            counter++;
            indexes = Arrays.stream(input.split("\\s+")).map(Integer::parseInt).
                    collect(Collectors.toList());
            if (indexes.get(0) == indexes.get(1) || indexes.get(0) < 0 || indexes.get(1) < 0 || indexes.get(1) > playSequence.size() - 1 ||
                    indexes.get(0) > playSequence.size() - 1) {
                playSequence.add(playSequence.size() / 2, "-" + counter +"a");
                playSequence.add(playSequence.size() / 2, "-" + counter +"a");
                System.out.println("Invalid input! Adding additional elements to the board");
            } else {
                if (!playSequence.get(indexes.get(0)).equals(playSequence.get(indexes.get(1)))) {
                    System.out.println("Try again!");
                }
                if (playSequence.get(indexes.get(0)).equals(playSequence.get(indexes.get(1)))) {
                    System.out.printf("Congrats! You have found matching elements - %s!%n", playSequence.get(indexes.get(0)));
                    int index1 = indexes.get(0);
                    int index2 = indexes.get(1);
                    if (indexes.get(0) >= indexes.get(1)) {
                        playSequence.remove(index1);
                        playSequence.remove(index2);
                    } else {
                        playSequence.remove(index2);
                        playSequence.remove(index1);
                    }
                }
            }

            if (playSequence.size() == 0) {
                System.out.printf("You have won in %d turns!", counter);
                break;
            }

            input = scanner.nextLine();
        }

        if (playSequence.size() != 0) {
            System.out.println("Sorry you lose :(");
            System.out.println(playSequence.toString().replaceAll("[\\[\\],]", ""));
        }

    }
}
