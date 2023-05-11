package ArrayLists.Exc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Exc8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> stringList = new ArrayList<>();
        stringList = Arrays.stream(scanner.nextLine().split(" ")).collect(Collectors.toList());

        List<String> command = new ArrayList<>();
        command = Arrays.stream(scanner.nextLine().split(" ")).collect(Collectors.toList());

        while (!"3:1".equals(command.get(0))) {

            if ("merge".equals(command.get(0))) {
                if (Integer.parseInt(command.get(1)) < 0) {
                    command.set(1, "0");
                }
                if (Integer.parseInt(command.get(2)) > stringList.size() - 1) {
                    command.set(2, String.valueOf(stringList.size() - 1));
                }
                for (int i = Integer.parseInt(command.get(1)) + 1; i <= Integer.parseInt(command.get(2)); i++) {
                    stringList.set(Integer.parseInt(command.get(1)), stringList.get(Integer.parseInt(command.get(1)))
                            + stringList.get(i));
                }
                for (int i = Integer.parseInt(command.get(2)); i >= Integer.parseInt(command.get(1)) + 1; i--) {
                    stringList.remove(i);
                }
            } else if ("divide".equals(command.get(0))) {
                int index = Integer.parseInt(command.get(1));
                int times = Integer.parseInt(command.get(2));
                String workString = stringList.get(index);
                int nWordLength = workString.length()/times;
                int ostatak = workString.length() % times;
                int counter = 0;
                for (int i = 0; i < times; i++) {
                    stringList.add(index+1+i,"");
                }
                for (int i = index+1; i < index+1+times ; i++) {
                    for (int j = 0; j < nWordLength; j++) {
                        stringList.set(i,stringList.get(i)+stringList.get(index).charAt(counter));
                        counter++;
                    }
                }
                if (ostatak != 0) {
                    for (int j = 0; j < ostatak; j++) {
                        stringList.set(index+times,stringList.get(index+times)+stringList.get(index).charAt(counter));
                        counter++;
                    }
                }
                stringList.remove(Integer.parseInt(command.get(1)));
            }
            command = Arrays.stream(scanner.nextLine().split(" ")).collect(Collectors.toList());
        }
        System.out.println(stringList.toString().replaceAll("[\\[\\],]",""));
    }
}
