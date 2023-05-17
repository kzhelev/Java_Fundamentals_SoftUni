package MapsLambdaStreamAPI;

import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Exc1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] doubleArr = Arrays.stream(scanner.nextLine().split(" ")).mapToDouble(Double::parseDouble).toArray();
        Arrays.sort(doubleArr);
        TreeMap<Double, Integer> treeMap = new TreeMap<>();
        int counter = 0;
        for (int i = 0; i < doubleArr.length; i++) {
            counter++;
            treeMap.put(doubleArr[i], counter);
            if (i != doubleArr.length-1 && doubleArr[i] != doubleArr[i+1]) {
               counter = 0;
            }
        }
        for (Map.Entry m : treeMap.entrySet()) {
            System.out.printf("%.0f -> %d%n",m.getKey(), m.getValue());
        }
    }
}
