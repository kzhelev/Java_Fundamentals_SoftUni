package FinalExam;

import java.util.*;

public class Exc3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String,Integer> animals = new LinkedHashMap<>();
        Map<String, List<String>> areasInTheZoo = new LinkedHashMap<>();

        String input = scanner.nextLine();

        while (!input.equals("EndDay")) {

            String[] command = input.split("\\s+");
            String[] info = command[1].split("-");
            String animalName;
            int neededFood;
            String area;
            int fedWith;

            switch (command[0]) {
                case "Add:":
                    animalName = info[0];
                    neededFood = Integer.parseInt(info[1]);
                    area = info[2];
                    if (!animals.containsKey(animalName)) {
                        animals.put(animalName, neededFood);
                    } else {
                        animals.put(animalName, animals.get(animalName) + neededFood);
                    }
                    if (!areasInTheZoo.containsKey(area)) {
                        areasInTheZoo.put(area, new ArrayList<>());
                        areasInTheZoo.get(area).add(animalName);
                    } else {
                        if (!areasInTheZoo.get(area).contains(animalName)) {
                            areasInTheZoo.get(area).add(animalName);
                        }
                    }
                    break;
                case "Feed:":
                    animalName = info[0];
                    fedWith = Integer.parseInt(info[1]);

                    if (animals.containsKey(animalName)) {
                        if (animals.get(animalName) <= fedWith) {
                            animals.remove(animalName);
                            for (Map.Entry<String, List<String>> entry : areasInTheZoo.entrySet()) {
                               if (entry.getValue().contains(animalName)) {
                                   entry.getValue().remove(animalName);
                                   break;
                               }
                            }
                            System.out.printf("%s was successfully fed%n",animalName);
                        } else {
                            animals.put(animalName, animals.get(animalName) - fedWith);
                        }
                    }

                    break;
            }

            input = scanner.nextLine();
        }

        System.out.println("Animals:");
        for (Map.Entry<String, Integer> entry : animals.entrySet()) {
            System.out.println(" " + entry.getKey() + " -> " + entry.getValue()+"g");
        }

        System.out.println("Areas with hungry animals:");
        for (Map.Entry<String, List<String>> area : areasInTheZoo.entrySet()) {
            if (area.getValue().size() != 0) {
                System.out.println(" " + area.getKey() + ": " + area.getValue().size());
            }
        }

    }
}
