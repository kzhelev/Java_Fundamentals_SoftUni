package ObjectsAndClasses.Exc9;

import java.util.*;
import java.util.stream.Collectors;

public class StudentsAndGrades {
    private String firstName;
    private String lastName;
    private double grade;

    public StudentsAndGrades(String input) {
        List<String> inputInfo = Arrays.stream(input.split("\\s+")).collect(Collectors.toList());
        this.firstName = inputInfo.get(0);
        this.lastName = inputInfo.get(1);
        this.grade = Double.parseDouble(inputInfo.get(2));
    }
    public StudentsAndGrades() {};
    public static void sortAndPrint() {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        String input;
        List<StudentsAndGrades> studenstList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            input = scanner.nextLine();
            studenstList.add(new StudentsAndGrades(input));
        }
        List<StudentsAndGrades> sortedList = new ArrayList<>();
        for (int i = 0; i < studenstList.size(); i++) {
            sortedList.add(studenstList.get(i));
        }
        for (int i = 0; i < studenstList.size(); i++) {
            int counter = 0;
            for (int j = 0; j < studenstList.size(); j++) {
                if (studenstList.get(i).grade < studenstList.get(j).grade) {
                    counter++;
                }
            }
            sortedList.set(counter,studenstList.get(i));
        }

        for (int i = 0; i < studenstList.size(); i++) {
            System.out.printf("%s %s: %.2f%n",sortedList.get(i).firstName,sortedList.get(i).lastName,
                    sortedList.get(i).grade);
        }
    }
}
