package SetsAndMapsAdvancedExercises;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Phonebook05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //John-0888080808
        //search
        //Maria
        //John
        //stop
        String line = scanner.nextLine();
        Map<String, String> phonebook = new HashMap<>();

        while (!line.equals("search")){
            String [] tokens = line.split("-");
            String name = tokens[0];
            String number = tokens[1];
            phonebook.put(name, number);
            //If you receive a name that already exists in
            // the phonebook, simply update its number.
            //реално то си се ъпдейтва

            line = scanner.nextLine();
        }
        String input = scanner.nextLine();
        while (!input.equals("stop")){
            String name = input; // за по-прегледно и ясно
            if (phonebook.containsKey(name)){
                System.out.printf("%s -> %s%n", name, phonebook.get(name));
            } else {
                System.out.printf("Contact %s does not exist.%n", name);
            }
            input = scanner.nextLine();
        }
    }
}
