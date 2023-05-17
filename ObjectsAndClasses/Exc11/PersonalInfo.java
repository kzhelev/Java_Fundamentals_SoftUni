package ObjectsAndClasses.Exc11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class PersonalInfo  {
    private String name;
    private String id;
    private int age;
    private static List<PersonalInfo> listOfPeople = new ArrayList<>();

    public PersonalInfo(List<String> infoInput) {
        this.name = infoInput.get(0);
        this.id = infoInput.get(1);
        this.age = Integer.parseInt(infoInput.get(2));
    }

    public static void personalInfoFilingAndPrinting () {
        Scanner scanner = new Scanner(System.in);
        List<String> infoInput = Arrays.stream(scanner.nextLine().split("\\s+")).collect(Collectors.toList());
        List<PersonalInfo> workList = new ArrayList<>();
        while (!infoInput.get(0).equals("End")) {
            workList.add(new PersonalInfo(infoInput));
            infoInput = Arrays.stream(scanner.nextLine().split("\\s+")).collect(Collectors.toList());
        }
        for (int i = 0; i < workList.size(); i++) {
            listOfPeople.add(workList.get(i));
        }
        for (int i = 0; i < workList.size(); i++) {
            int counter = 0;
            for (int j = 0; j < workList.size(); j++) {
                if (workList.get(i).age > workList.get(j).age) {
                    counter++;
                }
            }
            listOfPeople.set(counter,workList.get(i));
        }

    }
    public static void print() {
        for (int i = 0; i < listOfPeople.size(); i++) {
            System.out.printf("%s with ID: %s is %d years old%n",listOfPeople.get(i).name,listOfPeople.get(i).id,
                    listOfPeople.get(i).age);
        }
    }
}
