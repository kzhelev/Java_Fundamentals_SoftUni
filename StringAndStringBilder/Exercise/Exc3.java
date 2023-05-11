package StringAndStringBilder.Exercise;

import java.util.Scanner;

public class Exc3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] path = scanner.nextLine().split("\\\\");
        String[] nameAndExtension = path[path.length-1].split("\\.");
        System.out.println("File name: "+nameAndExtension[0]);
        System.out.println("File extension: "+nameAndExtension[1]);
    }
}
