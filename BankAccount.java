package Inheritance;

import com.sun.org.apache.regexp.internal.recompile;

public class BankAccount {
	private String userName;
	private String accountNumber;
	private double balance;
	
	public BankAccount(String userName, String accountNumber, double balance)
	{
		super();
		this.userName = userName;
		this.accountNumber = accountNumber;
		this.balance = balance;
	}

	public String getAccountNumber() {
		return accountNumber;
	}
	
	public String getUserName(){
		return userName;
	}
	
	public double getBalance(){
		return balance;
	}
	
	public double Deposite(double ammount)
	{
		balance += ammount;
		return balance;
	}
	
	public double Withdraw(double ammount)
	{
		balance -= ammount;
		return balance;
	}
}
