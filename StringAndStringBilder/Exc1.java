    package StringAndStringBilder;

    import java.util.Scanner;

    public class Exc1 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            String input = scanner.nextLine();
            StringBuilder reverseInput = new StringBuilder();

            while (!"end".equals(input)) {
                reverseInput.append(input);
                System.out.printf("%s = %s%n",input, reverseInput.reverse());
                reverseInput.setLength(0);
                input = scanner.nextLine();
            }
        }
    }
