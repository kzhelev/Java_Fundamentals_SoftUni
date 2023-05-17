package MapsLambdaStreamAPI;

import java.util.*;

public class Exc2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        LinkedHashMap<String, List<String>> wordsAndSynonyms = new LinkedHashMap<>();
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            String word = scanner.nextLine();
            String synonym = scanner.nextLine();
            if (!wordsAndSynonyms.containsKey(word)) {
                wordsAndSynonyms.put(word, new ArrayList<>());
                wordsAndSynonyms.get(word).add(synonym);
            } else if (wordsAndSynonyms.containsKey(word)) {
                wordsAndSynonyms.get(word).add(synonym);
            }
        }
        for (Map.Entry<String, List<String>> input : wordsAndSynonyms.entrySet()) {
            System.out.printf("%s - %s%n", input.getKey(), String.join(", ", input.getValue()));
        }
    }
}
