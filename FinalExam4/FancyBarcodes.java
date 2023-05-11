package FinalExam4;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FancyBarcodes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int productsNumber = Integer.parseInt(scanner.nextLine());


        Pattern pattern = Pattern.compile("@[#]+[A-Z][A-Za-z0-9]{4,}[A-Z]@[#]+");
        Matcher matcher;

        for (int i = 0; i < productsNumber; i++) {
            String product = scanner.nextLine();
            matcher = pattern.matcher(product);
            if (!matcher.find()) {
                System.out.println("Invalid barcode");
            } else {
                String productBarcode = matcher.group();
                    char[] productBarcodeAsChars = productBarcode.toCharArray();
                    String productGroup = "";

                    for (int j = 0; j < productBarcodeAsChars.length; j++) {
                        if (productBarcodeAsChars[j] >= 48 && productBarcodeAsChars[j] <= 57) {
                            productGroup += productBarcodeAsChars[j];
                        }
                    }
                    if (productGroup.length() != 0) {
                        System.out.printf("Product group: %s%n", productGroup);
                    } else {
                        System.out.println("Product group: 00");
                    }

            }
        }
    }
}
