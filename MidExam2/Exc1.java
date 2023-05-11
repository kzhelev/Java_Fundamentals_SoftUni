package MidExam2;

import java.util.Arrays;
import java.util.Scanner;

public class Exc1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstEmplKPD = Integer.parseInt(scanner.nextLine());
        int secondEmplKPD = Integer.parseInt(scanner.nextLine());
        int thirdEmplKPD = Integer.parseInt(scanner.nextLine());
        int peopleToHelp = Integer.parseInt(scanner.nextLine());
        int peopleHelpedPerHour = firstEmplKPD + secondEmplKPD + thirdEmplKPD;
        int hours = peopleToHelp/peopleHelpedPerHour;
        if (peopleToHelp % peopleHelpedPerHour != 0) {
            hours += 1;
        }
        if (hours > 3 && hours % 3 == 0) {
            hours += hours/3 - 1;
        } else if (hours > 3 && hours % 3 != 0) {
            hours += hours/3;
        }
        System.out.printf("Time needed: %dh.",hours);
    }
}
