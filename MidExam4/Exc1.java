package MidExam4;

import java.util.Scanner;

public class Exc1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double food = Double.parseDouble(scanner.nextLine());
        double hay = Double.parseDouble(scanner.nextLine());
        double cover = Double.parseDouble(scanner.nextLine());
        double gWeight  = Double.parseDouble(scanner.nextLine());

        double foodNeeded = 30 * 0.3;
        double hayNeeded = 0;
        double foodExcess = food;
        for (int i = 0; i < 15; i++) {
            foodExcess -= 0.6;
            hayNeeded += foodExcess * 0.05;
        }
        double coverNeeded = 10 * (gWeight/3);

        if (food < foodNeeded || hay < hayNeeded || cover < coverNeeded) {
            System.out.println("Merry must go to the pet store!");
        } else {
            double foodExcessFinal = food - foodNeeded;
            double hayExcess = hay - hayNeeded;
            double coverExcess = cover - coverNeeded;
            System.out.printf("Everything is fine! Puppy is happy! Food: %.2f, Hay: %.2f, Cover: %.2f.",
                    foodExcessFinal,hayExcess,coverExcess);
        }

    }
}
