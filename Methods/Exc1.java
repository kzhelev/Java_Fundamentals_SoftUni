package Methods;

import java.util.Scanner;

public class Exc1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = Integer.parseInt(scanner.nextLine());
        numberCheck(x);
    }
    public  static  void numberCheck(int intToCheck) {
        if (intToCheck > 0) {
            System.out.printf("The number %d is positive.",intToCheck);
        } else if (intToCheck < 0) {
            System.out.printf("The number %d is negative.",intToCheck);
        } else {
            System.out.println("The number 0 is zero.");
        }
    }


    /*public static void main(String[] args) {
        signCheck();
    }

    public static void signCheck() {
        Scanner scanner = new Scanner(System.in);
        int x = Integer.parseInt(scanner.nextLine());

        if (x > 0) {
            System.out.printf("The number %d is positive.",x);
        } else if (x < 0) {
            System.out.printf("The number %d is negative.",x);
        } else {
            System.out.println("The number 0 is zero.");
        }
    }*/
}
