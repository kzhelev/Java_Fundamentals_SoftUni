package Lab1;

import java.util.Scanner;

public class Exc4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hour = Integer.parseInt(scanner.nextLine());
        int minutes = Integer.parseInt(scanner.nextLine());

        int allInMinutes = hour * 60 + minutes;
        int appointmentHours = (allInMinutes + 30)/60;
        int appointmentMinutes = (allInMinutes + 30) % 60;
        if (appointmentHours >= 24){
            appointmentHours = 0;
        }

        System.out.printf("%d:%02d", appointmentHours, appointmentMinutes);
    }
}
