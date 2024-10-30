public class CurrentAccount extends BankAccount{
    private double maxWithdrawal;

    public CurrentAccount(double balance, double minimumBalance, String accountHolderName, double maxWithdrawal) {
        super(balance, minimumBalance, accountHolderName);
        this.maxWithdrawal = maxWithdrawal;
    }

    public double getMaxWithdrawal() {
        return maxWithdrawal;
    }

    public void setMaxWithdrawal(double maxWithdrawal) {
        this.maxWithdrawal = maxWithdrawal;
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= maxWithdrawal){
            super.withdraw(amount);
        }
        else{
            throw new IllegalArgumentException("Above withdrawal limit");
        }
    }

    @Override
    public String toString() {
        return "CurrentAccount{" +
                "maxWithdrawal=" + maxWithdrawal +
                "} " + super.toString();
    }
}
