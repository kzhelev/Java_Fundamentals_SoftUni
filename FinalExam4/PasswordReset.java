package FinalExam4;

import java.util.Scanner;

public class PasswordReset {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String password = scanner.nextLine();

        String input = scanner.nextLine();

        while (!input.equals("Done")) {
            String[] command = input.split("\\s+");

            int startIndex = 0;
            int endIndex = 0;
            String substring;
            String substitute;

            switch (command[0]) {
                case "TakeOdd":
                    char[] passwordAsCharArray = password.toCharArray();
                    password = "";
                    for (int i = 1; i < passwordAsCharArray.length; i += 2) {
                        password += passwordAsCharArray[i];
                    }
                    System.out.println(password);
                    break;
                case "Cut":
                    startIndex = Integer.parseInt(command[1]);
                    endIndex = startIndex + Integer.parseInt(command[2]);

                    password = password.replaceFirst(password.substring(startIndex,endIndex),"");

                    System.out.println(password);
                    break;
                case "Substitute":
                    substring = command[1];
                    substitute = command[2];

                    if (password.contains(substring)) {
                        password = password.replaceAll(substring, substitute);
                        System.out.println(password);
                    } else {
                        System.out.println("Nothing to replace!");
                    }
                    break;
            }
            input = scanner.nextLine();
        }
        System.out.printf("Your password is: %s",password);
    }
}
