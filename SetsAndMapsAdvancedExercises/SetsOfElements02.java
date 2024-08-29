package SetsAndMapsAdvancedExercises;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class SetsOfElements02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] tokens = scanner.nextLine().split("\\s+");
        int n = Integer.parseInt(tokens[0]);
        int m = Integer.parseInt(tokens[1]);

        Set<String> firstSet = new LinkedHashSet<>();
        for (int i = 0; i < n; i++) {
            firstSet.add(scanner.nextLine()); //наливаме в сет 1
        }

        Set<String> secondSet = new LinkedHashSet<>();
        for (int i = 0; i < m; i++) {
            secondSet.add(scanner.nextLine()); //наливаме в сет 2
        }

        firstSet.retainAll(secondSet); // остави само елементи, които ги има и във втория сет

        String result = String.join(" ", firstSet); //принтираме
        System.out.println(result);
    }
}
