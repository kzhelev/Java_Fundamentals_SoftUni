package ObjectsAndClasses.Exc4;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ClassSongs {
    private String typeList;
    private String name;
    private String time;

    public ClassSongs(Scanner scanner) {
        List<String> songInfo = Arrays.stream(scanner.nextLine().split("_")).collect(Collectors.toList());
        this.typeList = songInfo.get(0);
        this.name = songInfo.get(1);
        this.time = songInfo.get(2);
    }

    public static void songInfo(Scanner scanner) {
        int n = Integer.parseInt(scanner.nextLine());
        ClassSongs[] song = new ClassSongs[n];
        for (int i = 0; i < n; i++) {
            song[i] = new ClassSongs(scanner);
        }
        String album = scanner.nextLine();
        for (int i = 0; i < n; i++) {
            if (album.equals("all")) {
                for (int j = 0; j < n; j++) {
                    System.out.println(song[i]);
                }
            }
            if (song[i].typeList.equals(album)) {
                System.out.println(song[i].name);
            }
        }

    }
}
