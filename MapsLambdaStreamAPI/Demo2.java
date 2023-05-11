package MapsLambdaStreamAPI;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Scanner;

public class Demo2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedHashMap<String, Integer> firstMap = new LinkedHashMap<>();
        firstMap.put("one", 12);
        firstMap.put("two", 14);
        firstMap.put("tree", 15);

        System.out.println(firstMap.get("tree"));
    }
}
