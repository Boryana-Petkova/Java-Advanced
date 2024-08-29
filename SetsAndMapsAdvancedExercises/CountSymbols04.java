package SetsAndMapsAdvancedExercises;

import java.util.Scanner;
import java.util.TreeMap;

public class CountSymbols04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //SoftUni rocks
        String text = scanner.nextLine();
        TreeMap<Character, Integer> dictionary = new TreeMap<>();
                                //ще ги подреди както са в аски таблицата

        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);

            if (!dictionary.containsKey(currentChar)){
                dictionary.put(currentChar, 1);
            } else {
                int currentValue = dictionary.get(currentChar);
                dictionary.put(currentChar, currentValue + 1);
            }
        }
        dictionary.entrySet().forEach(entry ->
                System.out.printf("%c: %d time/s%n", entry.getKey(), entry.getValue()));
    }
}
