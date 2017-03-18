package Inheritance;

public class SavingAccount extends BankAccount{
	private double interestRate;
	
	public SavingAccount(String userName, String accountNumber, double balance, double interestRate)
	{
		super(userName, accountNumber, balance);
		this.interestRate = interestRate;
	}
	
	public double getInterestRate()
	{
		return interestRate;
	}
	
	public double Withdraw(double ammount)
	{
		if(super.getBalance()<ammount)
		{
			System.out.println("Insufficient Balance");
		}
		else{
			Withdraw(ammount);
		}
		return super.getBalance();
	}
	
}
