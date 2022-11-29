import java.util.ArrayList;
import java.util.List;

public class Testing {
    // the requirements of the task are very ambiguous so perhaps some methods might not correspond to what i was expected to do.
    public static void main(String[] args) {

        Account a1 = new Account(1);
        SavingAccount s1 = new SavingAccount(2);
        CurrentAccount c1 = new CurrentAccount(3);
        a1.deposit(100);
        c1.addLimit(-100);
        c1.withdraw(200);
        s1.deposit(100);
        List<Account> myList = new ArrayList<>();
        myList.add(a1);
        myList.add(s1);
        myList.add(c1);
        Bank bank = new Bank(myList);
        bank.openAccount(2);
        bank.closeAccount(2);
        bank.update(0.02);
        bank.addDividends(0.1);
        bank.showAll();

    }
}