package ObjectsAndClasses.Exc5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.SimpleTimeZone;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Students> studentsList = new ArrayList<>();
        Students.studentsList(scanner, studentsList);
        Students.print(scanner, studentsList);
    }
}
