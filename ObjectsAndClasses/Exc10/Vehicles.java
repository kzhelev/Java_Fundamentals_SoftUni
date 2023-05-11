package ObjectsAndClasses.Exc10;

import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Vehicles {
    private String type;
    private String model;
    private String color;
    private int horsepower;

    public Vehicles(List<String> vehiclesInfo) {
        this.type = vehiclesInfo.get(0);
        this.model = vehiclesInfo.get(1);
        this.color = vehiclesInfo.get(2);
        this.horsepower = Integer.parseInt(vehiclesInfo.get(3));
    }

    public static void vehiclesInfoFillingAndPrinting(Scanner scanner, List<Vehicles> carList, List<Vehicles> truckList) {

        List<String> vehiclesInfo = Arrays.stream(scanner.nextLine().split("\\s+")).collect(Collectors.toList());
        double carsHorsepower = 0;
        double trucksHorsepower = 0;
        while (!vehiclesInfo.get(0).equals("End")) {
            switch (vehiclesInfo.get(0)) {
                case "car":
                    carList.add(new Vehicles(vehiclesInfo));
                    carsHorsepower += carList.get(carList.size() - 1).horsepower;
                    break;
                case "truck":
                    truckList.add(new Vehicles(vehiclesInfo));
                    trucksHorsepower += truckList.get(truckList.size() - 1).horsepower;
                    break;
            }
            vehiclesInfo = Arrays.stream(scanner.nextLine().split("\\s+")).collect(Collectors.toList());
        }

        vehiclesInfo = Arrays.stream(scanner.nextLine().split("\\s+")).collect(Collectors.toList());

        while (!vehiclesInfo.get(0).equals("Close")) {
            for (int i = 0; i < carList.size(); i++) {
                if (vehiclesInfo.get(0).equals(carList.get(i).model)) {
                    System.out.printf("Type: %s%n",carList.get(i).type.substring(0,1).toUpperCase()+
                            carList.get(i).type.substring(1).toLowerCase());
                    System.out.printf("Model: %s%n",carList.get(i).model);
                    System.out.printf("Color: %s%n",carList.get(i).color);
                    System.out.printf("Horsepower: %d%n",carList.get(i).horsepower);
                }
            }
            for (int i = 0; i < truckList.size(); i++) {
                if (vehiclesInfo.get(0).equals(truckList.get(i).model)) {
                    System.out.printf("Type: %s%n",truckList.get(i).type.substring(0,1).toUpperCase()+
                            truckList.get(i).type.substring(1).toLowerCase());
                    System.out.printf("Model: %s%n",truckList.get(i).model);
                    System.out.printf("Color: %s%n",truckList.get(1).color);
                    System.out.printf("Horsepower: %d",truckList.get(i).horsepower);
                }
            }
            vehiclesInfo = Arrays.stream(scanner.nextLine().split("\\s+")).collect(Collectors.toList());
        }
        if (carList.size() == 0) {
            System.out.printf("Cars have average horsepower of 0.00.%n");
        } else {
            System.out.printf("Cars have average horsepower of %.2f.%n", carsHorsepower / carList.size());
        }

        if (truckList.size() == 0) {
            System.out.printf("Trucks have average horsepower of 0.00.");
        } else {
            System.out.printf("Trucks have average horsepower of %.2f.", trucksHorsepower / truckList.size());
        }

    }
}
