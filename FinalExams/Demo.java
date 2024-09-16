package FinalExams;

import DefiningClassesLab.BankAccount;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String line = scanner.nextLine();

        Map<Integer, BankAccount> bank = new HashMap<>();

        while (!line.equals("End")) {
            String[] tokens = line.split(" ");
            String command = tokens[0];

        }
    }
}
