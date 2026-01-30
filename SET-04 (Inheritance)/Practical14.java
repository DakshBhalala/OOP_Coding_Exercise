import java.util.Scanner;

public class Practical14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Savings Account ===");
        System.out.print("Enter Account Number: ");
        int savAccNo = scanner.nextInt();
        scanner.nextLine(); // consume newline
        System.out.print("Enter Name: ");
        String savName = scanner.nextLine();
        System.out.print("Enter Balance: ");
        double savBal = scanner.nextDouble();

        SavingAccount sa = new SavingAccount();
        sa.openAccount(savAccNo, savName, savBal);

        System.out.print("Enter Interest Rate (%): ");
        double rate = scanner.nextDouble();
        System.out.print("Enter Time (years): ");
        int time = scanner.nextInt();
        System.out.println("Interest: " + sa.calculateInterest(rate, time));
        sa.checkBalance();

        System.out.println("\n=== Fixed Deposit Account ===");
        System.out.print("Enter Account Number: ");
        int fdAccNo = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter Name: ");
        String fdName = scanner.nextLine();
        System.out.print("Enter Principal Amount: ");
        double fdBal = scanner.nextDouble();
        System.out.print("Enter Term (years): ");
        int term = scanner.nextInt();
        System.out.print("Enter FD Interest Rate (%): ");
        double fdRate = scanner.nextDouble();

        FixedDepositAccount fa = new FixedDepositAccount();
        fa.openAccount(fdAccNo, fdName, fdBal);
        System.out.println("Maturity Amount: " + fa.maturityAmount(fdRate, term));
        fa.checkBalance();

        scanner.close();
    }
}

class BankAccount {
    int accountNumber;
    String accountHolderName;
    double balance;

    void openAccount(int accNo, String name, double bal) {
        accountNumber = accNo;
        accountHolderName = name;
        balance = bal;
        System.out.println("Account Opened Successfully.");
    }

    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient Balance.");
        }
    }

    void checkBalance() {
        System.out.println("Current Balance: " + balance);
    }
}

class SavingAccount extends BankAccount {
    double calculateInterest(double rate, int time) {
        return (balance * rate * time) / 100;
    }
}

class FixedDepositAccount extends BankAccount {
    double maturityAmount(double rate, int time) {
        return balance * Math.pow((1 + rate / 100), time);
    }
}
