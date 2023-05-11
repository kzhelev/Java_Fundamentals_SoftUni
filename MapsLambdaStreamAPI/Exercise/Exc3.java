package MapsLambdaStreamAPI.Exercise;

import javax.swing.*;
import java.util.*;
import java.util.stream.Collectors;

public class Exc3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> productInfo = Arrays.stream(scanner.nextLine().split(" ")).collect(Collectors.toList());
        LinkedHashMap<String, Integer> productQuantities = new LinkedHashMap<>();
        LinkedHashMap<String, Double> productPrice = new LinkedHashMap<>();
        int counter = 0;
        while (!"buy".equals(productInfo.get(0))) {
            counter++;
            int quantities = Integer.parseInt(productInfo.get(2));
            double price = Double.parseDouble(productInfo.get(1));
            if (!productQuantities.containsKey(productInfo.get(0))) {
                productQuantities.put(productInfo.get(0), quantities);
                productPrice.put(productInfo.get(0), price);
            } else {
                productQuantities.put(productInfo.get(0), productQuantities.get(productInfo.get(0))+quantities);
                productPrice.put(productInfo.get(0), price);
            }
            productInfo = Arrays.stream(scanner.nextLine().split(" ")).collect(Collectors.toList());
        }
        for (Map.Entry<String, Integer> product : productQuantities.entrySet()) {
            System.out.printf("%s -> %.2f%n",product.getKey(),product.getValue()*productPrice.get(product.getKey()));
        }

    }
}
