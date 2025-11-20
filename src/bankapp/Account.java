
package bankapp;
import java.util.ArrayList;
import java.util.List;

public class Account {
	  protected String accountHolder;
	    protected double balance;
	    protected List<String> transactions;

	    public Account(String accountHolder, double balance) {
	        this.accountHolder = accountHolder;
	        this.balance = balance;
	        this.transactions = new ArrayList<>();
	        transactions.add("Account created with balance: " + balance);
	    }

	    public void deposit(double amount) {
	        balance += amount;
	        transactions.add("Deposited: " + amount);
	    }

	    public void withdraw(double amount) {
	        if (amount > balance) {
	            transactions.add("Failed Withdrawal: " + amount + " (Insufficient balance)");
	            System.out.println("Insufficient balance!");
	            return;
	        }
	        balance -= amount;
	        transactions.add("Withdrawn: " + amount);
	    }

	    public void showBalance() {
	        System.out.println("Current Balance: " + balance);
	    }

	    public void showTransactions() {
	        System.out.println("\nTransaction History:");
	        for (String t : transactions) {
	            System.out.println(t);
	        }
	    }
	}


