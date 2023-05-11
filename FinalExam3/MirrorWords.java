package FinalExam3;

import java.io.StringReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MirrorWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        List<String> words = new ArrayList<>();

        Pattern pattern = Pattern.compile("#[A-Za-z]{3,}##[A-Za-z]{3,}#|@[A-Za-z]{3,}@@[A-Za-z]{3,}@");
        Matcher matcher = pattern.matcher(input);
        int pairs = 0;

        while (matcher.find()) {
            String match = matcher.group().replaceAll("#", " ").replaceAll("@", " ").trim();
            char[] wordsToChar = match.toCharArray();

            int counter = wordsToChar.length - 1;
            boolean areEqual = true;
            for (int i = 0; i < wordsToChar.length / 2; i++) {
                if (wordsToChar[i] != wordsToChar[counter]) {
                    areEqual = false;
                    break;
                }
                counter--;
            }
            if (areEqual) {
                words.addAll(Arrays.asList(match.split("\\s+")));
            }
            pairs++;
        }

        if (pairs != 0) {
            System.out.printf("%d word pairs found!%n", pairs);
        } else {
            System.out.println("No word pairs found!");
        }

        if (words.size() != 0) {
            System.out.println("The mirror words are:");
            for (int i = 0; i < words.size(); i += 2) {
                System.out.printf("%s <=> %s", words.get(i), words.get(i + 1));
                if (i != words.size() - 2) {
                    System.out.print(", ");
                }
            }
        } else {
            System.out.println("No mirror words!");
        }
    }
}
