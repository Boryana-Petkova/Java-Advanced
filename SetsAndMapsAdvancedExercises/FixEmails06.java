package SetsAndMapsAdvancedExercises;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class FixEmails06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //John
        //johnDoe@softuni.org
        //Peter Smith
        //smith.peter@softuni.org
        //Taylor Baker
        //baker@gmail.com
        //stop
        String name = scanner.nextLine();

        Map<String, String> emails = new LinkedHashMap<>();

        while (!"stop".equals(name)) {
            String email = scanner.nextLine();
            // "us", "uk," or "com"
            if (!email.endsWith(".us") && !email.endsWith(".uk") && !email.endsWith(".com")) {
                emails.put(name, email);
            }

            name = scanner.nextLine();
        }

        emails.forEach((key, value) -> System.out.printf("%s -> %s\n", key, value));
    }
}
