package ObjectsAndClasses.Exc7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Articles first = new Articles(scanner);
        first.edit(scanner);
        first.print();
    }
}
