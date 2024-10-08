package FunctionalProgrammingExercises;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Predicate;

public class PredicateForrNames06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        Predicate<String> checkLength = str -> str.length() <= n;

        Arrays.stream(scanner.nextLine().split("\\s+"))
                .filter(checkLength)
                .forEach(System.out::println);
    }
}
