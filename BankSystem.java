import java.util.*;

public class BankSystem {
    private Map<String, BankAccount> accounts = new HashMap<>();
    private Scanner sc = new Scanner(System.in);

    public void createAccount() {
        System.out.print("Enter account number: ");
        String accNo = sc.next();
        System.out.print("Enter holder name: ");
        String name = sc.next();
        System.out.print("Enter initial balance: ");
        double bal = sc.nextDouble();
        System.out.print("Account type (1: Savings, 2: Current): ");
        int type = sc.nextInt();

        BankAccount acc = null;
        if (type == 1)
            acc = new SavingsAccount(accNo, name, bal);
        else if (type == 2)
            acc = new CurrentAccount(accNo, name, bal);

        if (acc != null) {
            accounts.put(accNo, acc);
            System.out.println("Account created successfully.");
        }
    }

    public void depositMoney() {
        BankAccount acc = getAccount();
        if (acc == null) return;
        System.out.print("Enter amount to deposit: ");
        acc.deposit(sc.nextDouble());
    }

    public void withdrawMoney() {
        BankAccount acc = getAccount();
        if (acc == null) return;
        System.out.print("Enter amount to withdraw: ");
        acc.withdraw(sc.nextDouble());
    }

    public void checkBalance() {
        BankAccount acc = getAccount();
        if (acc != null)
            System.out.println("Current balance: ₹" + acc.getBalance());
    }

    public void showDetails() {
        BankAccount acc = getAccount();
        if (acc != null)
            acc.displayDetails();
    }

    private BankAccount getAccount() {
        System.out.print("Enter account number: ");
        String accNo = sc.next();
        BankAccount acc = accounts.get(accNo);
        if (acc == null) System.out.println("Account not found.");
        return acc;
    }

    public void applyInterestToSavings() {
        for (BankAccount acc : accounts.values()) {
            if (acc instanceof SavingsAccount) {
                ((SavingsAccount) acc).applyInterest();
            }
        }
    }
}
