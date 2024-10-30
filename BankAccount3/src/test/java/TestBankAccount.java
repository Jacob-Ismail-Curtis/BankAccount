import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestBankAccount {

    @Test
    public void testDeposit(){
        BankAccount bankAccount = new BankAccount();
        bankAccount.setBalance = 200;
        bankAccount.deposit(200);
        assertEquals(400,bankAccount.Balance);
    }

    @Test
    public void testWithdraw(){
        BankAccount bankAccount = new BankAccount();
        bankAccount.setBalance = 300
        bankAccount.withdraw(100);
        assertEquals(200,bankAccount.Balance);

    }


}
