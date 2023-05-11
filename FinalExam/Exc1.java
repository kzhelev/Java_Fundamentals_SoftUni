package FinalExam;

import java.util.Scanner;

public class Exc1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String string = scanner.nextLine();

        String input = scanner.nextLine();

        while (!input.equals("End")) {

            String[] command = input.split("\\s+");

            String givenChar;
            String replacement;
            String substring;
            int startIndex;
            int numberOfIndexes;
            int endIndex;

            switch (command[0]) {
                case "Translate":
                    givenChar = command[1];
                    replacement = command[2];
                    string = string.replaceAll(givenChar,replacement);
                    System.out.println(string);
                    break;
                case "Includes":
                    substring = command[1];
                    System.out.println(string.contains(substring) ? "True" : "False");
                    break;
                case "Start":
                    substring = command[1];
                    System.out.println(string.startsWith(substring) ? "True" : "False");
                    break;
                case "Lowercase":
                    string = string.toLowerCase();
                    System.out.println(string);
                    break;
                case "FindIndex":
                    givenChar = command[1];
                    System.out.println(string.lastIndexOf(givenChar));
                    break;
                case "Remove":
                    startIndex = Integer.parseInt(command[1]);
                    numberOfIndexes = Integer.parseInt(command[2]);
                    endIndex = startIndex+numberOfIndexes;
                    string = string.substring(0,startIndex) + string.substring(endIndex,string.length());
                    System.out.println(string);
                    break;
            }

            input = scanner.nextLine();
        }


    }
}
