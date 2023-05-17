package Exc1;

import java.util.Scanner;

public class Exc10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double fund = Double.parseDouble(scanner.nextLine());
        int studentsCount = Integer.parseInt(scanner.nextLine());
        double lightsaber = Double.parseDouble(scanner.nextLine());
        double robe = Double.parseDouble(scanner.nextLine());
        double belt = Double.parseDouble(scanner.nextLine());

        double totalPrice = (lightsaber * Math.ceil(studentsCount * 1.1)) + studentsCount * robe + (studentsCount
                - (studentsCount/6))*belt;
        if (totalPrice <= fund) {
            System.out.printf("The money is enough - it would cost %.2flv.", totalPrice);
        } else {
            System.out.printf("George Lucas will need %.2flv more.", (totalPrice-fund));
        }
    }
}
