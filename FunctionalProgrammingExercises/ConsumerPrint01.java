package FunctionalProgrammingExercises;

import java.util.Arrays;
import java.util.Scanner;

import static java.util.Arrays.stream;

public class ConsumerPrint01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Arrays.stream(scanner.nextLine().split("\\s+"))
                .forEach(s -> System.out.println(s));

    }
}
