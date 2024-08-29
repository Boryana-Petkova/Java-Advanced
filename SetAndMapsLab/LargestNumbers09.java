package SetAndMapsLab;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class LargestNumbers09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //10 30 15 20 50 5 - търсим 3 най-големи числа
        Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .sorted(
                        (left, right) -> right.compareTo(left)
                ).limit(3)
                .forEach(number -> System.out.printf("%d ", number));
        //50 30 20
    }
}
