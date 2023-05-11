    package Exc3Arrays;

    import java.util.Scanner;

    public class Exc10wrong {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            String[] chestContent = scanner.nextLine().split("\\|");
            String[] chestContentNew = new String[chestContent.length + 5];
            String[] command = scanner.nextLine().split(" ");
            int loop = 0;
            boolean alreadyLooted = false;
            int counter = 0;
            int counterTwo = 0;
            String freeToUse = "";
            int loop2 = 0;
            int free = 0;
            boolean fixed = false;

            while (!"Yohoho!".equals(command[0])) {
                loop++;
                if ("Loot".equals(command[0])) {
                    for (int i = 1; i < command.length; i++) {
                        free = 0;
                        for (int j = 0; j < chestContent.length; j++) {
                            if (command[i].equals(chestContent[j])) {
                                alreadyLooted = true;
                                break;
                            }
                        }
                        if (!alreadyLooted) {
                            chestContentNew[counterTwo] = chestContentNew[0];
                            if (counterTwo>=2) {
                                String temporary = chestContentNew[counterTwo-1];
                                chestContentNew[counterTwo-1] = chestContentNew[counterTwo];
                                chestContentNew[counterTwo] = temporary;
                            }
                            chestContentNew[0] = command[i];
                            counterTwo++;
                        }
                        alreadyLooted = false;
                    }
                        for (int i = 0; i < chestContentNew.length; i++) {
                            if (chestContentNew[i] != null) {
                                free++;
                            } else {
                                break;
                            }
                        }
                        for (int i = 0; i < chestContent.length; i++) {
                            chestContentNew[free + i] = chestContent[i];
                        }


                    command = scanner.nextLine().split(" ");
                }
                if ("Drop".equals(command[0])) {
                    free = 0;
                    if (fixed != true) {
                        for (int i = 0; i < chestContentNew.length; i++) {
                            if (chestContentNew[i] != null) {
                                free++;
                            } else {
                                break;
                            }
                        }
                        for (int i = 0; i < chestContent.length; i++) {
                            chestContentNew[free + i] = chestContent[i];
                        }
                        fixed = true;
                    }
                    if (Integer.parseInt(command[1]) <= 0) {
                        command = scanner.nextLine().split(" ");
                    } else {
                        int index = Integer.parseInt(command[1]);

                        for (int i = index; i < chestContentNew.length - 1; i++) {
                            freeToUse = chestContentNew[i + 1];
                            chestContentNew[i + 1] = chestContentNew[i];
                            chestContentNew[i] = freeToUse;
                        }
                        for (int i = 0; i < chestContentNew.length - 1; i++) {
                            if (chestContentNew[i] == null) {
                                chestContentNew[i] = chestContentNew[chestContentNew.length - 1];
                                chestContentNew[chestContentNew.length - 1] = null;
                                break;
                            }
                        }


                        command = scanner.nextLine().split(" ");
                    }
                }
                if ("Steal".equals(command[0])) {
                    if (fixed != true) {
                        for (int i = 0; i < chestContentNew.length; i++) {
                            if (chestContentNew[i] != null) {
                                free++;
                            } else {
                                break;
                            }
                        }
                        for (int i = free; i < chestContent.length + free; i++) {
                            chestContentNew[i] = chestContent[counter];
                            counter++;

                        }
                    }
                    int x = 0;
                    for (int i = 0; i < chestContentNew.length; i++) {
                        if (chestContentNew[i] != null) {
                            x++;
                        }
                    }
                    for (int i = x-Integer.parseInt(command[1]); i < chestContentNew.length; i++) {
                            loop2++;
                            if (loop2 != Integer.parseInt(command[1])) {
                                System.out.print(chestContentNew[i] + ", ");
                            } else {
                                System.out.print(chestContentNew[i]+"\n");
                            }
                            chestContentNew[i] = null;
                            if (loop2 == Integer.parseInt(command[1])) {
                                break;
                            }
                        }
                    command = scanner.nextLine().split(" ");
                }
            }
            double averageGain = 0;
            int count = 0;
            for (int i = 0; i < chestContentNew.length; i++) {
                String s = chestContentNew[i];
                if (s != null) {
                    averageGain += s.length();
                    count++;
                }
            }
            if (count != 0) {
                System.out.printf("Average treasure gain: %.2f pirate credits.", (averageGain/count));
            } else if (count == 0) {
                System.out.println("Failed treasure hunt.");
            }
        }
    }
