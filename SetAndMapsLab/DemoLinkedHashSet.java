package SetAndMapsLab;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.stream.Collectors;

public class DemoLinkedHashSet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        LinkedHashSet<Integer> deck = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toCollection(LinkedHashSet::new));

        int firstCard = deck.iterator().next(); //взимаме чрез iterator
        // първия елемент от сета // от задача 03 повече за това
    }
}
