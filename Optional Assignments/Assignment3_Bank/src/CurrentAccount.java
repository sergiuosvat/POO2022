public class CurrentAccount extends Account{
    private double overDraftLimit;

    public CurrentAccount(int number) {
        super(number);
    }

    public void addLimit(double overDraftLimit)
    {
        this.overDraftLimit = overDraftLimit;
    }

    public void checkOverDraft()
    {
        if(getBalance()<overDraftLimit)
        {
            System.out.println("\nAccount " + getAccountNumber() + " is in overdraft \n");
        }
    }

    @Override
    public String toString() {
        return "CurrentAccount{ " +
                "overDraftLimit = " + overDraftLimit + ", balance = " + getBalance() +
                '}';
    }
}
