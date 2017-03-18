package Inheritance;

public class CheckingAccount extends BankAccount{
	private double serviceCharge;

	public CheckingAccount(String userName, String accountNumber,
			double balance, double serviceCharge) {
		super(userName, accountNumber, balance);
		this.serviceCharge = serviceCharge;
	}
	
	public double getServiceCharge(){
		return serviceCharge;
	}
	
	/*public double Withdraw(double ammount)
	{
		
		return getBalance();
	}*/
	
}
