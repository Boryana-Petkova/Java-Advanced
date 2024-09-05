package FunctionalProgramming;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class CountUppercaseWords03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        String[] words = text.split("\\s+");

        Predicate<String> isUpperCases = s -> Character.isUpperCase(s.charAt(0));
        // Предикат връща true or false

        Function<String[], List<String>> upperCases = List -> Arrays.stream(List)
                .filter(isUpperCases)
                .collect(Collectors.toList());

        List<String> onlyUpperCases = upperCases.apply(words);
        // прилагаме Function върху всички думи

        System.out.println(onlyUpperCases.size());// принтираме count на специфичните думи
        Consumer<String> outPutUpper = System.out::println;
        // правим Consumer, за да му кажем как да принтира

        onlyUpperCases.forEach(outPutUpper);
        // и само избраните думи, всичките ги принтираме
    }
}
