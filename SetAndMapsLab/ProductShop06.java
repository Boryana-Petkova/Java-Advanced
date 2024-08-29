package SetAndMapsLab;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class ProductShop06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String line = scanner.nextLine();
        TreeMap<String, LinkedHashMap<String, Double>> data = new TreeMap<>();

        while (!line.equals("Revision")){
        String [] tokens = line.split(", ");
        String shop = tokens[0];
        String product = tokens[1];
        double price = Double.parseDouble(tokens[2]);

        data.putIfAbsent(shop, new LinkedHashMap<>());
            LinkedHashMap<String, Double> innerData = data.get(shop);
            innerData.putIfAbsent(product, price);

            line = scanner.nextLine();
        }
        for (var entry :  data.entrySet()) { // var за по-кратко изписване в този случай
            // с Алт и Ентер риплейс на дългия вариант
            System.out.println(entry.getKey() + "->");

            LinkedHashMap<String, Double> innerData = entry.getValue();
            for (var productData : innerData.entrySet()  ) {
                System.out.printf("Product: %s, Price: %.1f%n", productData.getKey(),
                        productData.getValue()); //принтиране на мап с мап вътре
            }
        }
    }
}
