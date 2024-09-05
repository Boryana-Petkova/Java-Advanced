package FunctionalProgramming;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;


public class SortEvenNumbers01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(", "))
                .map(Integer::parseInt)
                .filter(e -> e % 2 == 0)
                .collect(Collectors.toList());// събираме ги заедно

        //String evenNotSorted = joinNumbers(numbers);// този ред може и без него

        Function<List<Integer>, String> format = l -> l.stream()
                        .map(String::valueOf)
                                .collect(Collectors.joining(", "));
                        // това замества долния метод

        System.out.println(format.apply(numbers));

        List<Integer> sortedNumbers = numbers.stream().sorted() // тук вече ги сортираме
                .collect(Collectors.toList());

        System.out.println(format.apply(sortedNumbers));

    }
//    private static String joinNumbers(List<Integer> numbers) { // правим ги пак на Стринг,
//                                                            // заради запетаите и принтирането
//        return  numbers.stream()
//                .map(String::valueOf)
//                .collect(Collectors.joining(", "));
    //}
}
