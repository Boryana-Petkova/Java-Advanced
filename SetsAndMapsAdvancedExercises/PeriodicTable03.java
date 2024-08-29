package SetsAndMapsAdvancedExercises;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class PeriodicTable03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        //4
        //Ce O
        //Mo O Ce
        //Ee
        //Mo
        Set<String> elements = new TreeSet<>();
        for (int i = 0; i < n; i++) {
            //            String[] tokens = scanner.nextLine().split("\\s+");
            //
            //            for (String element : tokens) {
            //                elements.add(element);
            //            }
                        // 1 вариант за прибавяне в сета различен брой подадени елементи

            //            Arrays.stream(scanner.nextLine().split("\\s+"))
            //                  .forEach(elements::add);
                        // 2 вариант за прибавяне в сета различен брой подадени елементи

            elements.addAll(Arrays.asList(scanner.nextLine().split("\\s+")));
            // 3 вариант за прибавяне в сета различен брой подадени елементи
        }

        String result = String.join(" ", elements);
        System.out.println(result);
    }
}
