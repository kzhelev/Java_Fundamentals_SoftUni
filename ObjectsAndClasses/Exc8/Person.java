package ObjectsAndClasses.Exc8;

import java.util.*;
import java.util.stream.Collectors;

public class Person {
    private String name;
    private int age;

    public Person(List<String> personsInfo){
        this.name = personsInfo.get(0);
        this.age = Integer.parseInt(personsInfo.get(1));
    }

    public static void fillingPersonsInfo(List<Person> newList) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        List<String> personsInfo = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            personsInfo = Arrays.stream(scanner.nextLine().split("\\s+")).collect(Collectors.toList());
            newList.add(new Person(personsInfo));
        }
    }
    public static void print(List<Person> newList) {
        for (int i = 0; i < newList.size(); i++) {
            if (newList.get(i).age > 30) {
                System.out.printf("%s - %d%n", newList.get(i).name, newList.get(i).age);
            }
        }
    }
}
