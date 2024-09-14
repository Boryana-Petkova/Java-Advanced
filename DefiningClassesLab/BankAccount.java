package DefiningClassesLab;

public class BankAccount {
    private static double interestRate = 0.02;
    private static int idCounter = 1;
    private int id;
    private double balance;

    public BankAccount() {
        this.id = idCounter;
        idCounter++;
    }

    public int getId() {
        return id;
    }

    public double getInterest(int years){
        return interestRate * years * balance;
    }
    //getInterest(int Years): double
    public void deposit(double amount){
        balance += amount;

    }
    //deposit(double amount): void
    public static void setInterestRate(double interestRate) {
        BankAccount.interestRate = interestRate;
    }
}

