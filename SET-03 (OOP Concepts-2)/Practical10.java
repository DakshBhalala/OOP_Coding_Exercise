import java.util.Scanner;

public class Practical10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Account Holder Name: ");
        String name = scanner.nextLine();
        System.out.print("Enter Initial Balance: ");
        double balance = scanner.nextDouble();

        BankAccount account = new BankAccount(name, balance);

        System.out.println("Initial Interest Rate: " + BankAccount.getInterestRate() + "%");
        account.displayInterest();

        System.out.print("\nEnter new Interest Rate: ");
        double newRate = scanner.nextDouble();
        BankAccount.setInterestRate(newRate);

        System.out.println("New Interest Rate: " + BankAccount.getInterestRate() + "%");
        account.displayInterest();

        scanner.close();
    }
}

class BankAccount {
    private String accountHolderName;
    private double balance;
    private static double interestRate = 3.5;

    public BankAccount(String accountHolderName, double balance) {
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    public static void setInterestRate(double rate) {
        interestRate = rate;
    }

    public static double getInterestRate() {
        return interestRate;
    }

    public void displayInterest() {
        double interest = (balance * interestRate) / 100;
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Balance: " + balance);
        System.out.println("Interest Earned: " + interest);
    }
}
