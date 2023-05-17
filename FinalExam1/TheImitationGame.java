package FinalExam1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;

public class TheImitationGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String code = scanner.nextLine();

        String[] command = scanner.nextLine().split("\\|");

        List<Character> codeAsListOfChars = new ArrayList<>();

        for (int i = 0; i < code.length(); i++) {
            codeAsListOfChars.add(code.charAt(i));
        }

        while (!command[0].equals("Decode")) {


            switch (command[0]) {
                case "Move":
                    for (int i = 0; i < Integer.parseInt(command[1]); i++) {
                        codeAsListOfChars.add(codeAsListOfChars.get(0));
                        codeAsListOfChars.remove(0);
                    }
                    break;
                case "Insert":
                    int index = Integer.parseInt(command[1]);
                    String value = command[2];

                    for (int i = value.length()-1; i >= 0; i--) {
                        codeAsListOfChars.add(index, value.charAt(i));
                    }
                    break;
                case "ChangeAll":
                    char substring = command[1].charAt(0);
                    char replacement = command[2].charAt(0);
                    UnaryOperator<Character> unaryOperator = e -> {
                        if (e == substring) {
                            return e = replacement;
                        } else {
                            return e;
                        }
                    };
                    codeAsListOfChars = codeAsListOfChars.stream().map(unaryOperator).collect(Collectors.toList());
                    break;
                default:
                    throw new IllegalArgumentException("Unknown command " + command[0]);
            }
            command = scanner.nextLine().split("\\|");
        }

        System.out.println("The decrypted message is: " +
                codeAsListOfChars.stream().map(String::valueOf).collect(Collectors.joining("")));
    }
}
