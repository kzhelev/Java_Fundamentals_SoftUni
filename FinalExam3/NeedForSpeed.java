package FinalExam3;

import java.util.*;

public class NeedForSpeed {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfCars = Integer.parseInt(scanner.nextLine());

        Map<String, List<Integer>> cars = new LinkedHashMap<>();

        for (int i = 0; i < numberOfCars; i++) {
            String[] carInfo = scanner.nextLine().split("\\|");
            String carModel = carInfo[0];
            int mileage = Integer.parseInt(carInfo[1]);
            int fuel = Integer.parseInt(carInfo[2]);
            cars.put(carModel, new ArrayList<>());
            cars.get(carModel).add(Integer.parseInt(carInfo[1]));
            cars.get(carModel).add(Integer.parseInt(carInfo[2]));
        }

        String input = scanner.nextLine();

        while (!input.equals("Stop")) {
            String[] commands = input.split(" : ");

            String carModel;
            int fuelNeeded;
            int fuelForRefiled;

            switch (commands[0]) {

                case "Drive":
                    carModel = commands[1];
                    int distance = Integer.parseInt(commands[2]);
                    fuelNeeded = Integer.parseInt(commands[3]);
                    if (fuelNeeded > cars.get(carModel).get(1)) {
                        System.out.println("Not enough fuel to make that ride");
                    } else {
                        cars.get(carModel).set(0,cars.get(carModel).get(0)+distance);
                        cars.get(carModel).set(1,cars.get(carModel).get(1)-fuelNeeded);
                        System.out.printf("%s driven for %d kilometers. %d liters of fuel consumed.%n"
                                ,carModel,distance,fuelNeeded);
                    }
                    if (cars.get(carModel).get(0) > 100000) {
                        cars.remove(carModel);
                        System.out.printf("Time to sell the %s!%n",carModel);
                    }
                    break;
                case "Refuel":
                    carModel = commands[1];
                    fuelForRefiled = Integer.parseInt(commands[2]);
                    int maxFuel = 75;
                    int usedFuel = 0;
                    if (fuelForRefiled+cars.get(carModel).get(1) > maxFuel) {
                        usedFuel = maxFuel - cars.get(carModel).get(1);
                        cars.get(carModel).set(1, 75);
                    } else {
                        usedFuel = fuelForRefiled;
                        cars.get(carModel).set(1, cars.get(carModel).get(1)+usedFuel);
                    }
                    System.out.printf("%s refueled with %d liters%n",carModel, usedFuel);
                    break;
                case "Revert":
                    carModel = commands[1];
                    int kilometersRevert = Integer.parseInt(commands[2]);
                    int revertedKm = 0;

                    if (cars.get(carModel).get(0) - kilometersRevert < 10000) {
                        cars.get(carModel).set(0, 10000);
                        revertedKm = cars.get(carModel).get(0) - 10000;
                    } else {
                        revertedKm = kilometersRevert;
                        cars.get(carModel).set(0, cars.get(carModel).get(0) - kilometersRevert);
                        System.out.printf("%s mileage decreased by %d kilometers%n",carModel,revertedKm);
                    }

                    break;
            }

            input = scanner.nextLine();
        }

        for (Map.Entry<String, List<Integer>> entry : cars.entrySet()) {
            System.out.printf("%s -> Mileage: %d kms, Fuel in the tank: %d lt.%n",entry.getKey(), entry.getValue().get(0),
                    entry.getValue().get(1));
        }

    }
}
