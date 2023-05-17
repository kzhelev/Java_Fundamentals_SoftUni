package MapsLambdaStreamAPI.Exercise;

import java.util.*;
import java.util.stream.Collectors;

public class Exc6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        LinkedHashMap<String, List<Double>> studentsGrades = new LinkedHashMap<>();
        String name;
        double grade;

        for (int i = 0; i < n; i++) {
            name = scanner.nextLine();
            grade = Double.parseDouble(scanner.nextLine());
            if (!studentsGrades.containsKey(name)) {
                studentsGrades.put(name,new ArrayList<>());
                studentsGrades.get(name).add(grade);
            } else {
                studentsGrades.get(name).add(grade);
            }
        }
        for (Map.Entry<String, List<Double>> student : studentsGrades.entrySet()) {
            if (student.getValue().stream().reduce(0.0,Double::sum)/student.getValue().size() >= 4.50) {
                System.out.printf("%s -> %.2f%n", student.getKey()
                        , student.getValue().stream().reduce(0.0, Double::sum) / student.getValue().size());
            }
        }

    }
}
