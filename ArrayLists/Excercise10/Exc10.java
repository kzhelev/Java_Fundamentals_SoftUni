package ArrayLists.Excercise10;

import java.util.Scanner;

public class Exc10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ClassInput fundamentals = new ClassInput(scanner);
        fundamentals.actions(scanner);
        fundamentals.print();
    }
}
