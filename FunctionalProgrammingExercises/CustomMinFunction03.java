package FunctionalProgrammingExercises;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Function;

public class CustomMinFunction03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Function<Integer[], Integer> findSmallest = arr -> {
            return Arrays.stream(arr)
                    .min(Integer::compare)
                    .get();
        };

        Integer [] numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .toArray(Integer[]::new); // правим Integer, не - int

        Integer smallestNum = findSmallest.apply(numbers);

        System.out.println(smallestNum);

    }
}
