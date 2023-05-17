package RegularMidExam;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Exc3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> itemsList = Arrays.stream(scanner.nextLine().split(", ")).map(Integer::parseInt)
                .collect(Collectors.toList());
        int entryPoint = Integer.parseInt(scanner.nextLine());
        String command = scanner.nextLine();
        int priceLeft = 0;
        int priceRight = 0;
        for (int i = 0; i < entryPoint; i++) {
            switch (command) {
                case "cheap":
                    if (itemsList.get(entryPoint) > itemsList.get(i)){
                        priceLeft += itemsList.get(i);
                    }
                    break;
                case "expensive":
                    if (itemsList.get(entryPoint) <= itemsList.get(i)){
                        priceLeft += itemsList.get(i);
                    }
                    break;
            }
        }
        for (int i = entryPoint+1; i < itemsList.size(); i++) {
            switch (command) {
                case "cheap":
                    if (itemsList.get(entryPoint) > itemsList.get(i)){
                        priceRight += itemsList.get(i);
                    }
                    break;
                case "expensive":
                    if (itemsList.get(entryPoint) <= itemsList.get(i)){
                        priceRight += itemsList.get(i);
                    }
                    break;
            }
        }
        if (priceLeft >= priceRight) {
            System.out.println("Left - " + priceLeft);
        } else {
            System.out.println("Right - " + priceRight);
        }
    }
}
