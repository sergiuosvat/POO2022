public class SavingAccount extends Account{

    private double interest;
    public SavingAccount(int number) {
        super(number);
    }

    public void addInterest(double interestToAdd)
    {
        this.interest = interestToAdd;
        double sum = getBalance()*interest;
        deposit(sum);
    }

    @Override
    public String toString() {
        return "SavingAccount{ " +
                " interest = " + interest + ", balance = " + getBalance() +
                '}';
    }
}
