package MapsLambdaStreamAPI.Exercise;

import java.util.*;
import java.util.stream.Collectors;

public class Exc7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> input = new ArrayList<>();
        LinkedHashMap<String, Integer> goods = new LinkedHashMap<>();
        goods.put("shards",0);
        goods.put("fragments",0);
        goods.put("motes",0);
        boolean win = false;

        while (true) {
            input = Arrays.stream(scanner.nextLine().toLowerCase().split("\\s+")).collect(Collectors.toList());
            for (int i = 0; i < input.size(); i+=2) {
                if (!goods.containsKey(input.get(i+1))) {
                    goods.put(input.get(i+1),Integer.parseInt(input.get(i)));
                } else {
                    goods.put(input.get(i+1),goods.get(input.get(i+1))+Integer.parseInt(input.get(i)));
                }
                if (goods.containsKey("shards") && goods.get("shards") >= 250 ||
                        goods.containsKey("fragments") && goods.get("fragments") >= 250 ||
                        goods.containsKey("motes") && goods.get("motes") >= 250 ) {
                    win = true;
                    break;
                }
            }
            if (win) {
                break;
            }
        }
        if (goods.containsKey("shards") && goods.get("shards") >= 250) {
            System.out.println("Shadowmourne obtained!");
            goods.put("shards", goods.get("shards")-250);
        } else if (goods.containsKey("fragments") && goods.get("fragments") >= 250) {
            System.out.println("Valanyr obtained!");
            goods.put("fragments", goods.get("fragments")-250);
        } else if (goods.containsKey("motes") && goods.get("motes") >= 250) {
            System.out.println("Dragonwrath obtained!");
            goods.put("motes", goods.get("motes")-250);
        }
        for (Map.Entry<String, Integer> item : goods.entrySet()) {
            System.out.printf("%s: %d%n",item.getKey(),item.getValue());
        }
    }
}
