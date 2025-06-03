package FinalDanStatic.Bank;

public class TestBankAccount {
    public static void main(String[] args) {
        SavingsAccount sa = new SavingsAccount("123456", 1000.0);

        // Panggil method final dari superclass
        sa.displayAccountInfo();

        // Panggil method tambahan khusus subclass
        sa.displayCustomInfo();
    }
}

