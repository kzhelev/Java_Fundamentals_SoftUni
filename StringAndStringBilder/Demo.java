package StringAndStringBilder;

import java.util.Date;

public class Demo {
    public static void main(String[] args) {
        System.out.println(new Date());
        StringBuilder text = new StringBuilder();
        for (int i = 0; i < 100000000; i++) {
            text.append("a");
        }
        System.out.println(new Date());
    }
}
