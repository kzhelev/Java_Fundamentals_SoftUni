package MapsLambdaStreamAPI.Exercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Exc2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String resource = scanner.nextLine();
        int quantity;
        LinkedHashMap<String, Integer> list = new LinkedHashMap<>();

        while (!"stop".equals(resource)) {
            quantity = Integer.parseInt(scanner.nextLine());
            if (!list.containsKey(resource)) {
                list.put(resource, quantity);
            } else {
                list.put(resource, list.get(resource)+ quantity);
            }
            resource = scanner.nextLine();
        }
        for (Map.Entry<String, Integer> listItem : list.entrySet()) {
            System.out.println(listItem.getKey()+" -> "+listItem.getValue());
        }

    }
}
