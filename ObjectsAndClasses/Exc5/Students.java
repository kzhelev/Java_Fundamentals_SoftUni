package ObjectsAndClasses.Exc5;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Students {
    private String firstName;
    private String lastName;
    private int age;
    private String city;

    public Students(String input) {
        List<String> info = Arrays.stream(input.split("\\s+")).collect(Collectors.toList());
        this.firstName = info.get(0);
        this.lastName = info.get(1);
        this.age = Integer.parseInt(info.get(2));
        this.city = info.get(3);
    }
    public static void studentsList (Scanner scanner, List<Students> studentsList) {
        String input = scanner.nextLine();
        int counter = 0;
        while (!"end".equals(input)) {
            List<String> inputToCheck = Arrays.stream(input.split("\\s+")).collect(Collectors.toList());
            if (counter != 0) {
                boolean overwrite = false;
                for (int i = 0; i < studentsList.size(); i++) {
                    if (inputToCheck.get(0).equals(studentsList.get(i).firstName) &&
                            inputToCheck.get(1).equals(studentsList.get(i).lastName)) {
                        studentsList.add(i+1,new Students(input));
                        studentsList.remove(i);
                        overwrite = true;
                    }
                }
                if (!overwrite) {
                        studentsList.add(new Students(input));
                }
            } else {
                studentsList.add(new Students(input));
            }
            counter ++;
            input = scanner.nextLine();
        }
    }
    public static void print (Scanner scanner, List<Students> studentsList ) {
        String city = scanner.nextLine();
        for (int i = 0; i < studentsList.size(); i++) {
            if (studentsList.get(i).city.equals(city)) {
                System.out.printf("%s %s is %d years old%n",studentsList.get(i).firstName,studentsList.get(i).lastName, studentsList.get(i).age);
            }
        }
    }
}
