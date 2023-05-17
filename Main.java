import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();


        int a = 5;
        int b = a++;
        int c = ++a;
        System.out.println(c);

        boolean isTrue = 100f == 100d;
        System.out.println(isTrue);

        String greetings = "Hello World";
        System.out.println(greetings.substring(3,5));

        for (int i = 10; i > 3 ; i-=2) {
            System.out.println(i);
        }
        String text = "text";

        printText(text);
    }

    private static void printText(String text) {
        System.out.println("I love"+ text);
    }


}