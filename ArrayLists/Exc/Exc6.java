package ArrayLists.Exc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Exc6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> playerOne = new ArrayList<>();
        List<Integer> playerTwo = new ArrayList<>();

        playerOne = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());
        playerTwo = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());

        while(playerOne.size() != 0 && playerTwo.size() != 0) {
            if (playerOne.get(0) > playerTwo.get(0)) {
                playerOne.add(playerOne.get(0));
                playerOne.add(playerTwo.get(0));
                playerOne.remove(0);
                playerTwo.remove(0);
            } else if (playerOne.get(0) < playerTwo.get(0)) {
                playerTwo.add(playerTwo.get(0));
                playerTwo.add(playerOne.get(0));
                playerOne.remove(0);
                playerTwo.remove(0);
            } else if (playerOne.get(0).equals(playerTwo.get(0))) {
                playerOne.remove(0);
                playerTwo.remove(0);
            }
        }
        int sum = 0;
        if (playerOne.size() > playerTwo.size()) {
            for (int i = 0; i < playerOne.size(); i++) {
                sum += playerOne.get(i);
            }
            System.out.printf("First player wins! Sum: %d",sum);
        } else {
            for (int i = 0; i < playerTwo.size(); i++) {
                sum += playerTwo.get(i);
            }
            System.out.printf("Second player wins! Sum: %d",sum);
        }
    }
}
