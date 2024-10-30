import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class TestBankAccount {

    @Test
    public void testDeposit(){
        BankAccount bankAccount = new BankAccount();
        bankAccount.setBalance(200);
        bankAccount.deposit(200);
        assertEquals(400,bankAccount.getBalance());

        assertThrows(IllegalArgumentException.class, () -> bankAccount.deposit(-50));
    }

    @Test
    public void testWithdraw(){
        BankAccount bankAccount = new BankAccount();
        bankAccount.setBalance(300);
        bankAccount.withdraw(100);
        assertEquals(200,bankAccount.getBalance());

        assertThrows(IllegalArgumentException.class, () -> bankAccount.withdraw(600));
        assertThrows(IllegalArgumentException.class, () -> bankAccount.withdraw(-200));

    }


}
