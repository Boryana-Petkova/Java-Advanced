package SetAndMapsLab;

import java.util.List;
import java.util.Scanner;

public class DemoSorting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = List.of(7, 55, 2, 6, 3, 90);

//        numbers.stream()
//                .sorted()
//                .forEach(e -> System.out.print(e + " ")); // без зададено конкретно сортиране,
//                                                        // ги сортира нарастващо

        numbers.stream()
                .sorted((f, s) -> Integer.compare(f, s)) // така сравняваме числата и което е първо,
                                                        // то питаме то по-малко ли е от второто
                .forEach(e -> System.out.print(e + " "));
        System.out.println();

        numbers.stream()
                .sorted((f, s) -> Integer.compare(s, f)) // разменени, пак
                // питаме s по-малко ли е от f
                .forEach(e -> System.out.print(e + " "));
    }
}
