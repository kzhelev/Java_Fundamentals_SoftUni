package FinalExam;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Exc2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfLines = Integer.parseInt(scanner.nextLine());

        Pattern pattern = Pattern.compile("\\|[A-Z]{4,}\\|:#[A-Za-z]+ [A-Za-z]+#");
        Matcher matcher;

        for (int i = 0; i < numberOfLines; i++) {
            String line = scanner.nextLine();
            matcher = pattern.matcher(line);
            if (matcher.find()) {
                line = line.replaceAll("\\|", "").replaceAll("#", "");
                String[] info = line.split(":");
                String name = info[0];
                String position = info[1];

                System.out.printf("%s, The %s%n",name,position);
                System.out.println(">> Strength: "+name.length());
                System.out.println(">> Armor: "+position.length());
            } else {
                System.out.println("Access denied!");
            }
        }
    }
}
