package ArrayLists.Excercise10;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ClassInput {

    public List<String> classesAndExercises;

    public ClassInput(Scanner scanner) {
        this.classesAndExercises = Arrays.stream(scanner.nextLine().split(", ")).collect(Collectors.toList());
    }


    public void actions(Scanner scanner) {
        List<String> command = Arrays.stream(scanner.nextLine().split(":")).collect(Collectors.toList());
        while (!"course start".equals(command.get(0))) {
            switch (command.get(0)) {
                case "Add":
                    boolean alreadyExist = false;
                    for (int i = 0; i < this.classesAndExercises.size(); i++) {
                        if (command.get(1).equals(this.classesAndExercises.get(i))) {
                            alreadyExist = true;
                        }
                    }
                    if (!alreadyExist) {
                        this.classesAndExercises.add(command.get(1));
                    }
                    break;
                case "Insert":
                    alreadyExist = false;
                    for (int i = 0; i < this.classesAndExercises.size(); i++) {
                        if (command.get(1).equals(this.classesAndExercises.get(i))) {
                            alreadyExist = true;
                        }
                    }
                    if (!alreadyExist) {
                        this.classesAndExercises.add(Integer.parseInt(command.get(2)), command.get(1));
                    }
                    break;
                case "Remove":
                    for (int i = 0; i < this.classesAndExercises.size(); i++) {
                        if (command.get(1).equals(this.classesAndExercises.get(i))) {
                            this.classesAndExercises.remove(i);
                            if (this.classesAndExercises.contains(command.get(1) + "-Exercise")) {
                                this.classesAndExercises.remove(i + 1);
                            }
                        }
                    }

                    break;
                case "Swap":
                    int index1 = -1;
                    int index2 = -1;
                    for (int i = 0; i < this.classesAndExercises.size(); i++) {
                        if (this.classesAndExercises.get(i).equals(command.get(1))) {
                            index1 = i;
                        }
                        if (this.classesAndExercises.get(i).equals(command.get(2))) {
                            index2 = i;
                        }
                    }

                    if (index1 >= 0 && index2 >= 0 && index1 < index2) {
                        this.classesAndExercises.add(index2 + 1, command.get(1));
                        this.classesAndExercises.remove(index2);
                        if (this.classesAndExercises.contains(command.get(1) + "-Exercise")) {
                            this.classesAndExercises.remove(command.get(1) + "-Exercise");
                            this.classesAndExercises.add(index2 + 1, command.get(1) + "-Exercise");
                        }

                        this.classesAndExercises.add(index1 + 1, command.get(2));
                        this.classesAndExercises.remove(index1);
                        if (this.classesAndExercises.contains(command.get(2) + "-Exercise")) {
                            this.classesAndExercises.remove(command.get(2) + "-Exercise");
                            this.classesAndExercises.add(index1 + 1, command.get(2) + "-Exercise");
                        }
                    }
                    if (index1 >= 0 && index2 >= 0 && index1 > index2) {

                        this.classesAndExercises.add(index1 + 1, command.get(2));
                        this.classesAndExercises.remove(index1);
                        if (this.classesAndExercises.contains(command.get(2) + "-Exercise")) {
                            this.classesAndExercises.remove(command.get(2) + "-Exercise");
                            this.classesAndExercises.add(index1 + 1, command.get(2) + "-Exercise");
                        }
                        this.classesAndExercises.add(index2 + 1, command.get(1));
                        this.classesAndExercises.remove(index2);
                        if (this.classesAndExercises.contains(command.get(1) + "-Exercise")) {
                            this.classesAndExercises.remove(command.get(1) + "-Exercise");
                            this.classesAndExercises.add(index2 + 1, command.get(1) + "-Exercise");
                        }
                    }
                    break;
                case "Exercise":
                    if (this.classesAndExercises.contains(command.get(1)) && !this.classesAndExercises.contains(command.get(1) + "-Exercise")) {
                        int index3 = 0;
                        for (int i = 0; i < this.classesAndExercises.size(); i++) {
                            if (command.get(1).equals(this.classesAndExercises.get(i))) {
                                index3 = i;
                            }
                        }
                        this.classesAndExercises.add(index3 + 1, command.get(1) + "-Exercise");
                    }
                    if (!this.classesAndExercises.contains(command.get(1))) {
                        this.classesAndExercises.add(command.get(1));
                        this.classesAndExercises.add(command.get(1) + "-Exercise");
                    }
                    break;
            }
            command = Arrays.stream(scanner.nextLine().split(":")).collect(Collectors.toList());
        }
    }

    public void print() {
        for (int i = 0; i < this.classesAndExercises.size(); i++) {
            System.out.print(i + 1 + ".");
            System.out.println(this.classesAndExercises.get(i));
        }
    }

}
