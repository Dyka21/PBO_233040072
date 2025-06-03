package FinalDanStatic.Tugas2;

public class BankAccount {
    private final String accountNumber; // final: tidak bisa diubah
    protected double balance; // saldo

    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    // final: tidak bisa dioverride di subclass
    public final void displayAccountInfo() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: $" + balance);
    }
}
