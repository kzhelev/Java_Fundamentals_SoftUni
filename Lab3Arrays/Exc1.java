package Lab3Arrays;

import java.util.Scanner;

public class Exc1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] dayOfTheWeek = new String[] {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday",
                "Saturday", "Sunday"};
        int dayNumber = Integer.parseInt(scanner.nextLine());
        if (dayNumber >= 1 && dayNumber <=7) {
            System.out.println(dayOfTheWeek[dayNumber-1]);
        } else {
            System.out.println("Invalid day!");
        }
    }
}
