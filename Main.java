import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        BankSystem bank = new BankSystem();
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n===== Bank Menu =====");
            System.out.println("1. Create Account");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Check Balance");
            System.out.println("5. Show Account Details");
            System.out.println("6. Apply Interest (Savings Only)");
            System.out.println("0. Exit");
            System.out.print("Choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1: bank.createAccount(); break;
                case 2: bank.depositMoney(); break;
                case 3: bank.withdrawMoney(); break;
                case 4: bank.checkBalance(); break;
                case 5: bank.showDetails(); break;
                case 6: bank.applyInterestToSavings(); break;
                case 0: System.out.println("Thank you for banking with us!"); break;
                default: System.out.println("Invalid choice.");
            }

        } while (choice != 0);
    }
}
