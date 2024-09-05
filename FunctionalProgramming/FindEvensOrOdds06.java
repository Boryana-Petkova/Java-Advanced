package FunctionalProgramming;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.IntPredicate;
import java.util.stream.IntStream;

public class FindEvensOrOdds06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int [] range = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt).toArray();

        int start = range[0];
        int end = range[1];

        String condition = scanner.nextLine();
        if (condition.equals("odd")){
            printRange(start, end, v -> v % 2 != 0); // това реално е Predicate-а,
                                                    // давам му параметрите
        } else {
            printRange(start, end, v -> v % 2 == 0);
        }
    }

    private static void printRange(int start, int end, IntPredicate predicate) {
        // IntPredicate е, защото ни трябва int стойности заради IntStream-а
        IntStream.rangeClosed(start, end) // rangeClosed включва и двете стойности
                                        // включ. и последната
                .filter(predicate)
                .forEach(n -> System.out.print(n + " "));

    }
}
