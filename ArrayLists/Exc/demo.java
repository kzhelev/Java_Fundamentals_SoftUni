package ArrayLists.Exc;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class demo {
    public static void main(String[] args) {
        String a = "aaabbbcccddd";
        List<String> b = Arrays.stream(a.split("",4)).collect(Collectors.toList());
        System.out.println(b);
    }
}
