package Methods;

import java.util.Scanner;

public class Exc7 {
    public  static  StringBuffer repeat(Scanner scanner){
        StringBuffer x = new StringBuffer(scanner.nextLine());
        StringBuffer xNew = new StringBuffer();
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            xNew = xNew.append(x);
        }
        return (xNew);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(repeat(scanner));
    }
}
