package FinalExam3;

import java.util.Scanner;

public class SecretChat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String message = scanner.nextLine();

        String input = scanner.nextLine();

        while (!input.equals("Reveal")) {
            String[] command = input.split(":\\|:");

            switch (command[0]) {
                case "InsertSpace":
                    int index = Integer.parseInt(command[1]);
                    message = message.substring(0, index) + " " + message.substring(index, message.length() + 0);
                    System.out.println(message);
                    break;
                case "Reverse":
                    String substring = command[1];
                    if (message.contains(substring)) {
                        message = message.replaceFirst(substring, "");
                        String[] substringAsArray = substring.split("");
                        for (int i = substringAsArray.length - 1; i >= 0; i--) {
                            message += substringAsArray[i];

                        }
                        System.out.println(message);
                    } else {
                        System.out.println("error");
                    }

                    break;
                case "ChangeAll":
                    String substringToReplace = command[1];
                    String toReplaceWith = command[2];
                    if (message.contains(substringToReplace)) {
                        message = message.replaceAll(substringToReplace, toReplaceWith);
                    } else {
                        System.out.println("error");
                    }
                    System.out.println(message);
                    break;
            }

            input = scanner.nextLine();
        }

        System.out.println("You have a new text message: " + message);

    }
}
