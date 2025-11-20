package bankapp;

public class Main {
	 public static void main(String[] args) {

	        SavingsAccount acc = new SavingsAccount("Darthi", 5000);

	        acc.deposit(2000);
	        acc.withdraw(1000);
	        acc.withdraw(8000);
	        acc.showBalance();
	        acc.showTransactions();
	    }
	}


