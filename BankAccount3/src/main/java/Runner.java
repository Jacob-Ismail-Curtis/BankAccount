import java.util.ArrayList;
import java.util.List;

public class Runner {
    public static void main(String[] args) {
        BankAccount bankAccount1 = new BankAccount(100,10,"Jacob Curtis");
        SavingsAccount savingsAccount1 = new SavingsAccount(4000,10, "Sarvesh", 0.15);
        CurrentAccount currentAccount1 = new CurrentAccount(1000, 0, "Dan", "9999");

        List<BankAccount> accountList = new ArrayList<BankAccount>();
        accountList.add(bankAccount1);
        accountList.add(savingsAccount1);
        accountList.add(currentAccount1);

        for (BankAccount account: accountList){
            System.out.println(account);
        }


    }

}
