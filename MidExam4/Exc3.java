package MidExam4;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Exc3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] house = Arrays.stream(scanner.nextLine().split("@")).mapToInt(Integer::parseInt).toArray();
        List<String> command = Arrays.stream(scanner.nextLine().split("\\s+")).collect(Collectors.toList());
        int jump;
        int position = 0;

        while (!"Love!".equals(command.get(0))) {
            jump = Integer.parseInt(command.get(1));
            position += jump;
            if (position > house.length-1) {
                position = 0;
            }
            if (house[position] == 0) {
                System.out.printf("Place %d already had Valentine's day.%n", position);
            } else {
                house[position] -= 2;
                if (house[position] == 0) {
                    System.out.printf("Place %d has Valentine's day.%n", position);
                }
            }
            command = Arrays.stream(scanner.nextLine().split("\\s+")).collect(Collectors.toList());
        }
        System.out.printf("Cupid's last position was %d.%n", position);
        boolean successfulMission = true;
        int fails = 0;
        for (int i = 0; i < house.length; i++) {
            if (house[i] != 0) {
                successfulMission = false;
                fails ++;
            }
        }
        if (successfulMission) {
            System.out.println("Mission was successful.");
        } else {
            System.out.printf("Cupid has failed %d places.", fails);
        }
    }
}
