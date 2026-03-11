public class BankAccount {
    private String owner;
    private double balance;
    private static int totalTransactions = 0;

    public BankAccount(String owner, double initialBalance) {
        this.owner = owner;
        this.balance = initialBalance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            totalTransactions++;
        }
    }

    public boolean withdraw(double amount) {
        if (amount > 0 && balance >= amount) {
            balance -= amount;
            totalTransactions++;
            return true;
        }
        return false;
    }

    public double getBalance() {
        return balance;
    }

    public static int getTotalTransactions() {
        return totalTransactions;
    }

    public static void resetTotalTransactions() {
        totalTransactions = 0;
    }
}