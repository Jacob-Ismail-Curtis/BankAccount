public class SavingsAccount extends BankAccount{

    private double interestRate;

    public SavingsAccount(double balance, double minimumBalance, String accountHolderName, double interestRate) {
        super(balance, minimumBalance, accountHolderName);
        this.interestRate = interestRate;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    @Override
    public String toString() {
        return "SavingsAccount{" +
                "interestRate=" + interestRate +
                "} " + super.toString();
    }
}
