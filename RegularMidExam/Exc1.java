package RegularMidExam;

import java.util.Scanner;

public class Exc1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double experienceNeeded = Double.parseDouble(scanner.nextLine());
        int countOfBattles = Integer.parseInt(scanner.nextLine());
        double experiencePerBattle = 0;
        int battleNumbers = 0;
        double experienceGained = 0;
        double expThisBattle = 0;
        double moreExpNeeded = 0;

        for (int i = 1; i <= countOfBattles; i++) {
            experiencePerBattle = Double.parseDouble(scanner.nextLine());
            battleNumbers++;
            expThisBattle = experiencePerBattle;
            if (i % 15 == 0) {
                expThisBattle = expThisBattle * 1.05;
            } else if (i % 3 == 0) {
                expThisBattle = expThisBattle * 1.15;
            } else if (i % 5 == 0) {
                expThisBattle = expThisBattle * 0.90;
            }
            experienceGained += expThisBattle;
            if (experienceGained >= experienceNeeded) {
                break;
            }
        }

        if (experienceGained >= experienceNeeded) {
            System.out.printf("Player successfully collected his needed experience for %d battles.",battleNumbers);
        } else {
            moreExpNeeded = experienceNeeded - experienceGained;
            System.out.printf("Player was not able to collect the needed experience, %.2f more needed.",moreExpNeeded);
        }
    }
}
