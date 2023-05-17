package MidExam5;

import java.util.Scanner;

public class Exc1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int studentsNumber = Integer.parseInt(scanner.nextLine());
        int lecturesNumber = Integer.parseInt(scanner.nextLine());
        int additionalBonus = Integer.parseInt(scanner.nextLine());
        int[] attendances = new int[studentsNumber];
        double[] totalBonus = new double[studentsNumber];
        double maxBonus = 0;
        int index = 0;
        if (studentsNumber == 0 || lecturesNumber == 0) {
            System.out.println("Max Bonus: 0.");
            System.out.println("The student has attended 0 lectures.");
        } else {
            for (int i = 0; i < studentsNumber; i++) {
                attendances[i] = Integer.parseInt(scanner.nextLine());
                totalBonus[i] = attendances[i] / (double) lecturesNumber * (5 + additionalBonus);
            }
            for (int i = 0; i < studentsNumber; i++) {
                if (totalBonus[i] > maxBonus) {
                    maxBonus = totalBonus[i];
                    index = i;
                }
            }
            System.out.printf("Max Bonus: %d.%n", Math.round(maxBonus));
            System.out.printf("The student has attended %d lectures.", attendances[index]);
        }
    }
}
