package FinalExam2;

import java.util.Scanner;

public class WorldTour {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String travelPlan = scanner.nextLine();

        String input = scanner.nextLine();

        while (!input.equals("Travel")) {

            String[] command = input.split(":");
            int index;
            int indexEnd;
            int stringEnd;

            switch (command[0]) {
                case "Add Stop":
                    index = Integer.parseInt(command[1]);
                    stringEnd = travelPlan.length();
                    if (travelPlan.length()-1 >= index && index >= 0) {
                        travelPlan = travelPlan.substring(0,index) + command[2] + travelPlan.substring(index,stringEnd);
                        System.out.println(travelPlan);
                    } else {
                        System.out.println(travelPlan);
                    }
                    break;
                case "Remove Stop":
                    index = Integer.parseInt(command[1]);
                    indexEnd = Integer.parseInt(command[2])+1;
                    stringEnd = travelPlan.length();
                    if (travelPlan.length()-1 >= index && travelPlan.length() >= indexEnd && index >= 0 && indexEnd >= 0 &&
                    index < indexEnd)  {
                        travelPlan = travelPlan.substring(0,index) + travelPlan.substring(indexEnd,stringEnd);
                        System.out.println(travelPlan);
                    } else {
                        System.out.println(travelPlan);
                    }
                    break;
                case "Switch":
                    if (travelPlan.contains(command[1])) {
                        travelPlan = travelPlan.replace(command[1],command[2]);
                        System.out.println(travelPlan);
                    } else {
                        System.out.println(travelPlan);
                    }
                    break;
            }

            input = scanner.nextLine();

        }
        System.out.println("Ready for world tour! Planned stops: "+travelPlan);
    }
}
