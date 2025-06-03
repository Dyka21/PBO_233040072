package FinalDanStatic.Bank;
// Subclass mencoba meng-override method final (AKAN ERROR!)

public class SavingsAccount extends BankAccount {

    public SavingsAccount(String accountNumber, double balance) {
        super(accountNumber, balance);
    }

    /*
    // ERROR: Cannot override the final method from BankAccount
    @Override
    public void displayAccountInfo() {
        System.out.println("This is savings account info.");
    }
    */

    // Solusi: Buat method tambahan untuk kebutuhan khusus, tanpa override method final
    public void displayCustomInfo() {
        System.out.println("This is savings account (custom display).");
        System.out.println("Balance: $" + balance);
    }
}
