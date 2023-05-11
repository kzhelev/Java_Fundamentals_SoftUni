package ObjectsAndClasses.Exc10;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Vehicles> carList = new LinkedList<>();
        List<Vehicles> truckList = new LinkedList<>();
        Vehicles.vehiclesInfoFillingAndPrinting(scanner,carList,truckList);
    }
}
