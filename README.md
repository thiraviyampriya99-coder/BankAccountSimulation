🏦 Bank Account Simulation – Java OOP Project

This project is created as part of the Java Developer Internship – Task 5.
The goal is to simulate basic bank account operations using Object-Oriented Programming concepts in Java.

🎯 Objective

Create a class-based banking system

Perform deposit, withdraw operations

Maintain transaction history

Apply OOP concepts like inheritance & method overriding

🧠 Key Concepts Used

Classes & Objects

Constructors

Inheritance (SavingsAccount extends Account)

Method Overriding

Encapsulation

ArrayList for transaction history

📁 Project Structure
BankAccountSimulation/
│
├── src/
│   └── bankapp/
│        ├── Account.java
│        ├── SavingsAccount.java
│        └── Main.java
│
└── README.md

📝 Code Summary
✔ Account.java

Contains:

balance

deposit()

withdraw()

transaction history

✔ SavingsAccount.java

Inherits Account

Overrides withdraw() method

✔ Main.java

Creates object

Calls deposit, withdraw

Prints output

▶️ How to Run the Project
1. Compile
javac src/bankapp/*.java

2. Run
java bankapp.Main

💻 Sample Output
Savings Account - Withdrawal Failed! Not enough balance.
Current Balance: 6000

Transaction History:
Account created with balance: 5000.0
Deposited: 2000.0
Savings Withdrawal Successful: 1000.0
Failed Withdrawal in Savings: 8000.0

🛠 Technologies Used

Java

VS Code / Eclipse / IntelliJ

OOP Concepts
