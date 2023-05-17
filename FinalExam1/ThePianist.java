package FinalExam1;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ThePianist {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Map<String, String>> playList = new LinkedHashMap<>();

        int tracksCount = Integer.parseInt(scanner.nextLine());

        String[] trackInfo;

        for (int i = 0; i < tracksCount; i++) {
            trackInfo = scanner.nextLine().split("\\|");
            playList.put(trackInfo[0], new LinkedHashMap<>());
            playList.get(trackInfo[0]).put(trackInfo[1],trackInfo[2]);
        }

        String input = scanner.nextLine();

        while (!input.equals("Stop")) {
            String[] command = input.split("\\|");
            switch (command[0]) {
                case  "Add":
                    if (playList.containsKey(command[1])) {
                        System.out.printf("%s is already in the collection!%n", command[1]);
                    } else {
                        playList.put(command[1], new LinkedHashMap<>());
                        playList.get(command[1]).put(command[2],command[3]);
                        System.out.printf("%s by %s in %s added to the collection!%n",command[1],command[2],command[3]);
                    }
                    break;
                case  "Remove":
                    if (!playList.containsKey(command[1])) {
                        System.out.printf("Invalid operation! %s does not exist in the collection.%n", command[1]);
                    } else {
                        playList.remove(command[1]);
                        System.out.printf("Successfully removed %s!%n",command[1]);
                    }
                    break;
                case  "ChangeKey":
                    if (!playList.containsKey(command[1])) {
                        System.out.printf("Invalid operation! %s does not exist in the collection.%n", command[1]);
                    } else {
                        String composer = playList.get(command[1]).keySet().stream().map(String::valueOf).collect(Collectors.joining());
                        playList.get(command[1]).put(composer, command[2]);
                        System.out.printf("Changed the key of %s to %s!%n",command[1],command[2]);
                    }
                    break;
                default:throw new IllegalArgumentException("Unknown command: "+command[0]);
            }
            input = scanner.nextLine();
        }
        for (Map.Entry<String, Map<String, String>> stringMapEntry : playList.entrySet()) {
            System.out.print(stringMapEntry.getKey()+" -> ");
            for (Map.Entry<String, String> stringStringEntry : playList.get(stringMapEntry.getKey()).entrySet()) {
                System.out.printf("Composer: %s, Key: %s%n",stringStringEntry.getKey(),stringStringEntry.getValue());
            }
        }
    }
}
