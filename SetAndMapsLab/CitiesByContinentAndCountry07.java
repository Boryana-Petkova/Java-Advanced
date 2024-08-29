package SetAndMapsLab;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class CitiesByContinentAndCountry07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        LinkedHashMap<String, LinkedHashMap<String, List<String>>>
        countriesByContinent = new LinkedHashMap<>(); // континетите и страните са уникални
                                            // и ги държим в ключ, затова правим за тях мапове

        while (n-- > 0){
            String [] tokens = scanner.nextLine().split("\\s+");
            String continent = tokens[0];
            String country = tokens[1];
            String city = tokens[2];

            countriesByContinent.putIfAbsent(continent, new LinkedHashMap<>());

            LinkedHashMap<String, List<String>> citiesByCountry =
                    countriesByContinent.get(continent); // извеждаме в променлива страните
            citiesByCountry.putIfAbsent(country, new ArrayList<>()); // добавяме страните,
                                                                        // ако ги няма вече
            List<String> cities = citiesByCountry.get(country);// извеждаме в променлива градовете
            cities.add(city); // добавяме градовете

        }


        countriesByContinent.entrySet().stream().forEach(entry -> {
            System.out.println(entry.getKey() + ":");

            entry.getValue().entrySet().stream().forEach(innerEntry -> {

                String cities = innerEntry.getValue().stream()
                        .collect(Collectors.joining(", ")); // за градовете

                System.out.println("  " + innerEntry.getKey() + " -> " + cities);
            });
        });
        //Europe:
        //  Bulgaria -> Sofia, Plovdiv
        //  Poland -> Warsaw, Poznan
        //  Germany -> Berlin
        //Asia:
        //  China -> Beijing, Shanghai
        //  Japan -> Tokyo

    }
}
