package ObjectsAndClasses.Exc6;

import java.util.Random;
import java.util.Scanner;

public class AdvertisementMessage {
    public String[] phrases = {"Excellent product.", "Such a great product.", "I always use that product.",
            "Best product of its category.", "Exceptional product.", "I can’t live without this product."};
    public String[] events = {"Now I feel good.", "I have succeeded with this product.",
            "Makes miracles. I am happy of the results!", "I cannot believe but now I feel awesome.",
            "Try it yourself, I am very satisfied.", "I feel great!"};
    public String[] authors = {"Diana", "Petya", "Stella", "Elena", "Katya", "Iva", "Annie", "Eva"};
    public String[] cities = {"Burgas", "Sofia", "Plovdiv", "Varna", "Ruse"};

    public static void messageGenerator() {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        AdvertisementMessage massage = new AdvertisementMessage();
        Random one = new Random();

        for (int i = 0; i < n; i++) {
            int phr = one.nextInt(6);
            int ev = one.nextInt(6);
            int auth = one.nextInt(8);
            int c = one.nextInt(5);
            System.out.printf("%s %s %s - %s%n",massage.phrases[phr],massage.events[ev],massage.authors[auth],massage.cities[c]);
        }

    }
}
