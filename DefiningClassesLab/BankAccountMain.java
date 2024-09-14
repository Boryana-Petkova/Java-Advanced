package DefiningClassesLab;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class BankAccountMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String line = scanner.nextLine();
        Map<Integer, BankAccount> bank = new HashMap<>();

        while (!line.equals("End")){
            String [] tokens = line.split(" ");
            String command =tokens[0];
            if (command.equals("Create")){
                BankAccount account = new BankAccount();
                bank.put(account.getId(), account);
                System.out.println("Account ID " + account.getId() + " created");
            } else if (command.equals("Deposit")){
                int id = Integer.parseInt(tokens[1]);
                int amount = Integer.parseInt(tokens[2]);
                BankAccount account = bank.get(id);

                if (account != null){
                    account.deposit(amount);
                    System.out.println("Deposited " + amount + " to ID1" + id);

                } else {
                    System.out.println("Account does not exist");
                }
            } else if (command.equals("SetInterest")){
                setInterest(Double.parseDouble(tokens[1]));
            } else if (command.equals("GetInterest")){

            }

//•	GetInterest {ID} {Years}

            line = scanner.nextLine();
        }
    }



    private static void setInterest(Double interest) {
        BankAccount.setInterestRate(interest);

    }
}
