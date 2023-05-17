package Exc3Arrays;

import java.util.Scanner;

public class Exc103 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] items = scanner.nextLine().split("\\|");
        String[] itemsNew = new String[items.length + 5];
        String[] command = scanner.nextLine().split(" ");
        boolean looted = false;

        for (int i = 0; i < items.length; i++) {
            itemsNew[i] = items[i];
        }

        while (!"Yohoho!".equals(command[0])) {

            if (command[0].equals("Loot")) {
                for (int i = 1; i < command.length; i++) {
                    looted = false;
                    for (int j = 0; j < itemsNew.length; j++) {
                        if (command[i].equals(itemsNew[j])) {
                            looted = true;
                        }
                    }
                    if (!looted) {
                        for (int j = itemsNew.length - 2; j >= 0; j--) {
                            itemsNew[j + 1] = itemsNew[j];
                        }
                        itemsNew[0] = command[i];
                    }
                }
            }

            if (command[0].equals("Drop")) {
                int x = 0;
                for (int i = 0; i < itemsNew.length; i++) {
                    if (itemsNew[i] != null) {
                        x++;
                    }
                }
                if (Integer.parseInt(command[1]) < 0 || Integer.parseInt(command[1]) > x) {
                    command = scanner.nextLine().split(" ");
                    continue;
                } else {
                    x = Integer.parseInt(command[1]);
                    for (int i = x; i < itemsNew.length - 1; i++) {
                        if (itemsNew[i + 1] == null) {
                            break;
                        } else {
                            String local = itemsNew[i];
                            itemsNew[i] = itemsNew[i + 1];
                            itemsNew[i + 1] = local;
                        }
                    }
                }
            }
            if (command[0].equals("Steal")) {
                int x = 0;
                int loop2 = 0;
                for (int i = 0; i < itemsNew.length; i++) {
                    if (itemsNew[i] != null) {
                        x++;
                    }
                }
                if (Integer.parseInt(command[1]) > x) {

                    int local = Integer.parseInt(command[1]);
                    local = x;
                    for (int i = 0; i < x; i++) {
                        loop2++;
                        if (loop2 != local) {
                            System.out.print(itemsNew[i] + ", ");
                        } else {
                            System.out.print(itemsNew[i] + "\n");
                        }
                        itemsNew[i] = null;
                        if (loop2 == local) {
                            break;
                        }
                    }
                } else {
                    for (int i = x - Integer.parseInt(command[1]); i < itemsNew.length + Integer.parseInt(command[1]); i++) {
                        loop2++;
                        if (loop2 != Integer.parseInt(command[1])) {
                            System.out.print(itemsNew[i] + ", ");
                        } else {
                            System.out.print(itemsNew[i] + "\n");
                        }
                        itemsNew[i] = null;
                        if (loop2 == Integer.parseInt(command[1])) {
                            break;
                        }
                    }
                }
            }
            command = scanner.nextLine().split(" ");
        }
        double averageGain = 0;
        int count1 = 0;
        for (int i = 0; i < itemsNew.length; i++) {
            String s = itemsNew[i];
            if (s != null) {
                averageGain += s.length();
                count1++;
            }
        }
        if (count1 != 0) {
            System.out.printf("Average treasure gain: %.2f pirate credits.", (averageGain / count1));
        } else if (count1 == 0) {
            System.out.println("Failed treasure hunt.");
        }

    }

}



