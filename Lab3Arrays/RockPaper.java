package Lab3Arrays;

import java.util.Random;
import java.util.Scanner;

public class RockPaper {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose [r]ock, [p]aper, [s]cissors");
        String[] choose = {"rock", "paper", "scissors"};
        String input = scanner.nextLine();
        switch (input) {
            case "r":
                System.out.println("rock");
                break;
            case "p":
                System.out.println("paper");
                break;
            case "s":
                System.out.println("scissors");
                break;
        }
        int rnd = new Random().nextInt(choose.length-1);
        System.out.println(choose[rnd]);

    }
}
