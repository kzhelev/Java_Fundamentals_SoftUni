    package MidExam1;

    import java.util.Arrays;
    import java.util.Scanner;

        public class Exc2 {
            public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
                int peopleOnTheQueue = Integer.parseInt(scanner.nextLine());
                int[] wagons = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
                int places = 0;
                int freeSits = wagons.length*4;
                for (int i = 0; i < wagons.length; i++) {
                    places += wagons[i];
                    freeSits -= wagons[i];
                }
                if (peopleOnTheQueue < freeSits) {
                    int sitsNeeded = peopleOnTheQueue;
                    System.out.println("The lift has empty spots!");
                    for (int i = 0; i < wagons.length; i++) {
                        for (int j = 0; j < 4; j++) {
                            if (wagons[i] == 4) {
                                break;
                            }
                            if (sitsNeeded == 0) {
                                break;
                            }
                            wagons[i] += 1;
                            sitsNeeded -= 1;
                        }
                    }
                    for (int i = 0; i < wagons.length; i++) {
                        System.out.print(wagons[i]+" ");
                    }
                } else if (peopleOnTheQueue > freeSits) {
                    for (int i = 0; i < wagons.length; i++) {
                        for (int j = 0; j < 4; j++) {
                            if (wagons[i] == 4) {
                            break;
                            }
                            wagons[i] += 1;
                            peopleOnTheQueue -= 1;

                        }
                    }
                    System.out.printf("There isn't enough space! %d people in a queue!%n",peopleOnTheQueue);
                    for (int i = 0; i < wagons.length; i++) {
                        System.out.print(wagons[i]+" ");
                    }
                } else if (peopleOnTheQueue == freeSits) {
                    int sitsNeeded = peopleOnTheQueue;
                    for (int i = 0; i < wagons.length; i++) {
                        for (int j = 0; j < 4; j++) {
                            if (wagons[i] == 4) {
                                break;
                            }
                            if (sitsNeeded == 0) {
                                break;
                            }
                            wagons[i] += 1;
                            sitsNeeded -= 1;
                        }
                    }
                    for (int i = 0; i < wagons.length; i++) {
                        System.out.print(wagons[i]+" ");
                    }
                }
            }
        }