package ObjectsAndClasses.Exc7;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Articles {
    private String title;
    private String content;
    private String author;

    public Articles(Scanner scanners) {
        List<String> info = Arrays.stream(scanners.nextLine().split(",\\s+")).collect(Collectors.toList());
        this.title = info.get(0);
        this.content = info.get(1);
        this.author = info.get(2);
    }

    public void setContent(List<String> info) {
        this.content = info.get(1);
    }

    public void setAuthor(List<String> info) {
        this.author = info.get(1);
    }

    public void setTitle(List<String> info) {
        this.title = info.get(1);
    }

    public void edit(Scanner scanner) {
        int n = Integer.parseInt(scanner.nextLine());
        String input = "";
        for (int i = 0; i < n; i++) {
            input = scanner.nextLine();
            List<String> info = Arrays.stream(input.split(":\\s+")).collect(Collectors.toList());
            switch (info.get(0)) {
                case "Edit":
                    setContent(info);
                    break;
                case "ChangeAuthor":
                    setAuthor(info);
                    break;
                case "Rename":
                    setTitle(info);
                    break;
            }
        }
    }
    public void print () {
        System.out.printf("%s - %s: %s", this.title,this.content,this.author    );
    }
}
