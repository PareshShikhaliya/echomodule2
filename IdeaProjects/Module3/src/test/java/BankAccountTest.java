import org.example.class3.BankAccount4;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BankAccountTest {

    @Test
    public void testDeposit() {
        BankAccount4 account = new BankAccount4("Alice", 100.0);
        account.deposit(50.0);
        assertEquals(150.0, account.getBalance());
    }

    @Test
    public void testWithdraw() {
        BankAccount4 account = new BankAccount4("Bob", 200.0);
        account.withdraw(50.0);
        assertEquals(150.0, account.getBalance());
    }

    @Test
    public void testDepositNegativeAmount() {
        BankAccount4 account = new BankAccount4("Charlie", 300.0);
        assertThrows(IllegalArgumentException.class, () -> {
            account.deposit(-50.0);
        });
    }

    @Test
    public void testWithdrawNegativeAmount() {
        BankAccount4 account = new BankAccount4("David", 400.0);
        assertThrows(IllegalArgumentException.class, () -> {
            account.withdraw(-50.0);
        });
    }

    @Test
    public void testWithdrawInsufficientBalance() {
        BankAccount4 account = new BankAccount4("Eve", 50.0);
        assertThrows(IllegalStateException.class, () -> {
            account.withdraw(100.0);
        });
    }

    @Test
    public void testIsOverdraft() {
        BankAccount4 account = new BankAccount4("Frank", -20.0);
        assertTrue(account.isOverdraft());
    }

    @Test
    public void testIsNotOverdraft() {
        BankAccount4 account = new BankAccount4("Grace", 1000.0);
        assertFalse(account.isOverdraft());
    }

    @Test
    public void testIsAccountHolder() {
        BankAccount4 account = new BankAccount4("Hannah", 500.0);
        assertTrue(account.isAccountHolder("Hannah"));
    }

    @Test
    public void testIsNotAccountHolder() {
        BankAccount4 account = new BankAccount4("Isaac", 600.0);
        assertFalse(account.isAccountHolder("John"));
    }
}
