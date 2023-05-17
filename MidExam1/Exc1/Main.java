package MidExam1.Exc1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Customer pit = new Customer();
        pit.bill(scanner);
        pit.billPrint();
    }
}
