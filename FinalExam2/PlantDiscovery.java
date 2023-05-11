package FinalExam2;

import java.text.DecimalFormat;
import java.util.*;

public class PlantDiscovery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lines = Integer.parseInt(scanner.nextLine());

        String[] plansGathered;

        Map<String, Double> plantsRarity = new LinkedHashMap<>();
        Map<String, List<Double>> plantsRating = new LinkedHashMap<>();

        for (int i = 0; i < lines; i++) {
            plansGathered = scanner.nextLine().split("<->");
            plantsRarity.put(plansGathered[0], Double.parseDouble(plansGathered[1]));
        }

        String input = scanner.nextLine();

        while (!input.equals("Exhibition")) {

            String[] command = input.split(": ");
            String[] plantNameAndRating = command[1].split(" - ");

            switch (command[0]) {
                case "Rate":
                    if(plantsRarity.containsKey(plantNameAndRating[0])) {
                        if(plantsRating.containsKey(plantNameAndRating[0])) {
                            plantsRating.get(plantNameAndRating[0]).add(Double.parseDouble(plantNameAndRating[1]));
                        } else {
                            plantsRating.put(plantNameAndRating[0],new ArrayList<>());
                            plantsRating.get(plantNameAndRating[0]).add(Double.parseDouble(plantNameAndRating[1]));
                        }
                    } else {
                        System.out.println("error");
                    }
                    break;
                case "Update":
                    if (plantsRarity.containsKey(plantNameAndRating[0])) {
                        plantsRarity.put(plantNameAndRating[0], Double.parseDouble(plantNameAndRating[1]));
                    } else {
                        System.out.println("error");
                    }
                    break;
                case "Reset":
                    if(plantsRating.containsKey(plantNameAndRating[0])) {
                        plantsRating.get(plantNameAndRating[0]).clear();
                    } else {
                        System.out.println("error");
                    }
                    break;
            }
            input = scanner.nextLine();
        }

        DecimalFormat decimalFormat = new DecimalFormat("##.##");

        System.out.println("Plants for the exhibition:");
        for (Map.Entry<String, Double> entry : plantsRarity.entrySet()) {
            double averageRating = 0;
            if (plantsRating.containsKey(entry.getKey())) {
                averageRating = plantsRating.get(entry.getKey()).stream().mapToDouble(e -> e).average().orElse(0);
            }
            System.out.printf("- %s; Rarity: %s; Rating: %.2f%n",entry.getKey(),decimalFormat.format(entry.getValue()),averageRating);
        }
    }
}
