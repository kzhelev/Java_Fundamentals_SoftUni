package StringAndStringBilder.Exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Exc7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        List<String> charList = Arrays.stream(input.split("")).collect(Collectors.toList());
        int strength = 0;

        for (int i = 0; i < charList.size(); i++) {
            if (charList.get(i).equals(">")) {
                strength += Integer.parseInt(charList.get(i+1));
            } else if (!charList.get(i).equals(">") && strength != 0) {
                charList.set(i,"");
                strength--;
            }
        }
        for (int i = 0; i < charList.size(); i++) {
            if (!charList.get(i).equals("")) {
                System.out.print(charList.get(i));
            }
        }
    }
}
