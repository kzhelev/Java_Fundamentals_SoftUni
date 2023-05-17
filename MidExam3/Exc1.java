package MidExam3;

import java.util.Scanner;

public class Exc1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int energy = Integer.parseInt(scanner.nextLine());
        String input = scanner.nextLine();
        int distance;
        int remainingEnergy = energy;
        int battles = 0;

        while (!"End of battle".equals(input)) {

            distance = Integer.parseInt(input);

            if (distance <= remainingEnergy) {
                remainingEnergy -= distance;
                battles++;
            } else {
                System.out.printf("Not enough energy! Game ends with %d won battles and %d energy",battles,remainingEnergy);
                break;
            }

            if (battles % 3 == 0) {
                remainingEnergy += battles;
            }

            input = scanner.nextLine();
        }
        if ("End of battle".equals(input)) {
            System.out.printf("Won battles: %d. Energy left: %d", battles, remainingEnergy);
        }
    }
}
