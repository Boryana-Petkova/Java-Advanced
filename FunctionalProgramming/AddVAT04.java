package FunctionalProgramming;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Function;

public class AddVAT04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        System.out.println("Prices with VAT:"); // първо принтираме първия ред
        Function<String, Double> parsePriceAddingVat = s -> Double.parseDouble(s) * 1.2;
        // смятаме VAT към цената, което е 1.2 и също парсваме от стринг към double

        Arrays.stream(text.split(", "))
                .map(parsePriceAddingVat)
                .forEach(d -> System.out.printf("%.2f%n", d));
    }
}
