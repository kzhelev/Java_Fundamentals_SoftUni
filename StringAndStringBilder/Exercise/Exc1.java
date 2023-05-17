package StringAndStringBilder.Exercise;

import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Exc1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] names = scanner.nextLine().split(", ");
        Pattern pattern = Pattern.compile("[^a-zA-z0-9-_]");
        for (int i = 0; i < names.length; i++) {
            Matcher matcher = pattern.matcher(names[i]);
            if (!matcher.find() && names[i].length() >= 3 && names[i].length() <= 16){
                System.out.println(names[i]);
            }
        }
    }
}
