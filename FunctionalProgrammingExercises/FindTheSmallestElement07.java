package FunctionalProgrammingExercises;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class FindTheSmallestElement07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        List<Integer> numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());

        Consumer<List<Integer>> printLastIndexOfMinElement = list -> {
            int minElement = Collections.min(list);
            System.out.println(list.lastIndexOf(minElement));
        };
        printLastIndexOfMinElement.accept(numbers);
    }
}
