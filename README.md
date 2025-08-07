# Bank-Management-System
This is a console-based Bank Account Management System developed in Java using Object-Oriented Programming (OOP) concepts. The project allows users to create bank accounts (Savings or Current), perform deposits and withdrawals, check balances, and apply interest to savings accounts.
  It demonstrates the four major OOP principles:
    Encapsulation
    Inheritance
    Polymorphism
    Abstraction

⚙️ Features
✅ Create a new bank account (Savings / Current)
✅ Deposit money into account
✅ Withdraw money with balance and overdraft validation
✅ View current balance
✅ View full account details
✅ Apply interest to savings accounts

🧱 Technologies Used
Java (JDK 8 or above)
Console I/O
No external libraries required

Project Structure:
BankManagement/
├── BankAccount.java         // Abstract base class
├── SavingsAccount.java      // Extends BankAccount
├── CurrentAccount.java      // Extends BankAccount
├── BankSystem.java          // Manages all accounts
└── Main.java                // Application entry point


🖥️ How to Run
1.Clone the repository:
git clone https://github.com/yourusername/BankAccountManagement.git
cd BankAccountManagement

2.Compile all .java files:
javac *.java

3.Run the project:
java Main

