package ObjectsAndClasses.Exc8;

import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> newList = new LinkedList<>();
        Person.fillingPersonsInfo(newList);
        Person.print(newList);
    }
}
