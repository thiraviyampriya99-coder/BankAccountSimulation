package bankapp;

class SavingsAccount extends Account {
	public SavingsAccount(String accountHolder, double balance) {
        super(accountHolder, balance);
    }

    @Override
    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Savings Account - Withdrawal Failed! Not enough balance.");
            transactions.add("Failed Withdrawal in Savings: " + amount);
            return;
        }
        balance -= amount;
        transactions.add("Savings Withdrawal Successful: " + amount);
    }
}



