import java.util.List;

public class Bank {
    List<Account> myList;

    public Bank(List<Account> myList)
    {
        this.myList = myList;
    }

    public void update(double interestToAdd)
    {
        for (Account account : myList)
            if (account.getClass().equals(SavingAccount.class)) {
                ((SavingAccount) account).addInterest(interestToAdd);
            }
            else if(account.getClass().equals(CurrentAccount.class)){
                ((CurrentAccount) account).checkOverDraft();
            }
    }

    public void openAccount(int number)
    {
        for (Account account : myList)
            if (account.getAccountNumber() == number)
            {
                System.out.println("\nAccount " + account.getAccountNumber() + " is now open \n");
            }
    }

    public  void closeAccount(int number)
    {
        for (Account account : myList)
            if (account.getAccountNumber() == number)
            {
                System.out.println("Account "+ account.getAccountNumber() + " is now closed \n");
            }

    }

    public void addDividends(double dividend)
    {
        for (Account account : myList)
            account.deposit(dividend);
    }

    public void showAll()
    {
        for (Account account : myList)
            account.print();
    }
}
