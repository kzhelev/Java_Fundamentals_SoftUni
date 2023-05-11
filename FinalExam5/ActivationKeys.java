package FinalExam5;

import java.util.Scanner;

public class ActivationKeys {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String activationKey = scanner.nextLine();

        String input = scanner.nextLine();

        while (!input.equals("Generate")) {
            String[] command = input.split(">>>");

            String substring;
            String caseType;
            int starIndex;
            int endIndex;

            switch (command[0]) {
                case "Contains":
                    substring = command[1];
                    if (activationKey.contains(substring)){
                        System.out.printf("%s contains %s%n",activationKey,substring);
                    } else {
                        System.out.println("Substring not found!");
                    }
                    break;
                case "Flip":
                    caseType = command[1];
                    starIndex = Integer.parseInt(command[2]);
                    endIndex = Integer.parseInt(command[3]);

                    if ("Upper".equals(caseType)) {

                        activationKey = activationKey.substring(0,starIndex) + activationKey.substring(starIndex,endIndex).toUpperCase() +
                                activationKey.substring(endIndex,activationKey.length()+0);

                        System.out.println(activationKey);
                    } else if ("Lower".equals(caseType)) {

                        activationKey = activationKey.substring(0,starIndex) + activationKey.substring(starIndex,endIndex).toLowerCase() +
                                activationKey.substring(endIndex,activationKey.length()+0);

                        System.out.println(activationKey);
                    }
                    break;
                case "Slice":
                    starIndex = Integer.parseInt(command[1]);
                    endIndex = Integer.parseInt(command[2]);
                    activationKey = activationKey.substring(0,starIndex) + activationKey.substring(endIndex,activationKey.length()+0);
                    System.out.println(activationKey);
                    break;
            }

            input = scanner.nextLine();
        }
        System.out.printf("Your activation key is: %s",activationKey);
    }
}
