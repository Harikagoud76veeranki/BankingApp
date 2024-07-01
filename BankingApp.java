package com.collections;

public class BankingApp {
	// Instance variables to store account number and balance
	int accountNo;
	int balance;

	// Constructor to initialize account number and balance
	public BankingApp(int accountNo, int balance) {
		super();
		this.accountNo = accountNo;
		this.balance = balance;
	}

	// Method to deposit amount into the account
	void deposit(int amt) {
		balance += amt;
		System.out.println("New Balance: " + balance);
	}

	// Method to withdraw amount from the account
	void withDraw(int amt) throws InsufficientBalanceException {
		if (balance - amt >= 1000) {
			balance -= amt;
			System.out.println("Amount withdrawn successfully: " + amt + "\n New Balance: " + balance);
		} else {
			// Throw InsufficientBalanceException if balance is insufficient
			throw new InsufficientBalanceException("Insufficient Balance");
		}
	}

	public static void main(String[] args) throws InsufficientBalanceException {
		// Create a new BankingApp object with account number and initial balance
		BankingApp bankingapp = new BankingApp(3216532, 200000);

		// Deposit amount into the account
		bankingapp.deposit(5000);

		try {
			// Try to withdraw amount from the account
			bankingapp.withDraw(204090);
		} catch (InsufficientBalanceException e) {
			// Catch InsufficientBalanceException and print the cause
			System.out.println(e.getCause());
		}
	}
}
