package Exc3Arrays;

import java.util.Scanner;

public class Exc102wrong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] items = scanner.nextLine().split("\\|");
        String[] command = scanner.nextLine().split(" ");
        String[] itemsNew = new String[items.length + 5];
        int added = 1;
        boolean looted = false;
        int count = 0;
        String freeToUse = "";
        int loop2 = 0;
        String toCompareWith = "";
        int loop = 0;
        int drop = 0;
        int steal = 0;

        while (!command[0].equals("Yohoho!")) {
            loop++;
            if (command[0].equals("Loot")) {
                for (int i = 1; i < command.length; i++) {
                    looted = false;
                    for (int j = 0; j < items.length; j++) {
                        if (command[i].equals(items[j])) {
                            looted = true;
                            break;
                        }
                    }
                    if (!looted) {
                        itemsNew[itemsNew.length - added] = command[i];
                        added++;
                    }
                }
                toCompareWith = itemsNew[itemsNew.length-1];
            }
            if (command[0].equals("Drop")) {
                drop++;
                if (Integer.parseInt(command[1]) < 0 || Integer.parseInt(command[1]) > items.length+added) {
                    command = scanner.nextLine().split(" ");
                    continue;
                } else {
                    if (itemsNew[0] == toCompareWith) {


                    } else {
                        for (int i = 0; i < itemsNew.length; i++) {
                            if (itemsNew[i] == null) {
                                count++;
                            }
                        }
                        int index = count;
                        for (int i = 0; i < itemsNew.length - count; i++) {
                            itemsNew[i] = itemsNew[index];
                            itemsNew[index] = null;
                            index++;
                        }
                        for (int i = 0; i < items.length; i++) {
                            itemsNew[itemsNew.length - count + i] = items[i];
                        }
                    }
                    int indexNew = Integer.parseInt(command[1]);

                    for (int i = indexNew; i < itemsNew.length - 1; i++) {
                        freeToUse = itemsNew[i + 1];
                        itemsNew[i + 1] = itemsNew[i];
                        itemsNew[i] = freeToUse;
                    }
                    for (int i = 0; i < itemsNew.length - 1; i++) {
                        if (itemsNew[i] == null) {
                            itemsNew[i] = itemsNew[itemsNew.length - 1];
                            itemsNew[itemsNew.length - 1] = null;
                            break;
                        }
                    }

                }
            }
            if (command[0].equals("Steal")) {
                steal ++;
                if (drop == 0) {
                    for (int i = 0; i < itemsNew.length; i++) {
                        if (itemsNew[i] == null) {
                            count++;
                        }
                    }
                    int index = count;
                    for (int i = 0; i < itemsNew.length - count; i++) {
                        itemsNew[i] = itemsNew[index];
                        itemsNew[index] = null;
                        index++;
                    }
                    for (int i = 0; i < items.length; i++) {
                        itemsNew[itemsNew.length - count + i] = items[i];
                    }
                }
                int x = 0;
                for (int i = 0; i < itemsNew.length; i++) {
                    if (itemsNew[i] != null) {
                        x++;
                    }
                }
                if (Integer.parseInt(command[1]) > x) {

                    int local = Integer.parseInt(command[1]);
                    local = x;
                    for (int i = x - local; i < itemsNew.length + local; i++) {
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
        if (loop < 1) {
            for (int i = 0; i < items.length ; i++) {
                itemsNew[i] = items[i];
            }
        }
        if (drop == 0 && steal == 0) {
            for (int i = 0; i < itemsNew.length; i++) {
                if (itemsNew[i] == null) {
                    count++;
                }
            }
            int index = count;
            for (int i = 0; i < itemsNew.length - count; i++) {
                itemsNew[i] = itemsNew[index];
                itemsNew[index] = null;
                index++;
            }
            for (int i = 0; i < items.length; i++) {
                itemsNew[itemsNew.length - count + i] = items[i];
            }
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
            System.out.printf("Average treasure gain: %.2f pirate credits.", (averageGain/count1));
        } else if (count1 == 0) {
            System.out.println("Failed treasure hunt.");
        }
    }
}

