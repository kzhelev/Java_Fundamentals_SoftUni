package Methods;

import java.util.Scanner;

public class Exc9 {
    public static int maxNumber(int a, int b){
        int result = Math.max(a,b);
        return (result);
    }
    public static char maxNumber(char z, char d){
        if (z > d) {
            return (z);
        } else {
            return (d);
        }
    }
    public static String maxNumber(String x, String y){

        if (x.compareTo(y) > 0) {
            return (x);
        } else {
            return (y);
        }
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        switch (scanner.nextLine()) {
            case "int":
                System.out.println(maxNumber(Integer.parseInt(scanner.nextLine()),Integer.parseInt(scanner.nextLine())));
                break;
            case "char":
                System.out.println(maxNumber(scanner.nextLine().charAt(0),scanner.nextLine().charAt(0)));
                break;
            case "string":
                System.out.println(maxNumber(scanner.nextLine(),scanner.nextLine()));
                break;
        }
    }
}
