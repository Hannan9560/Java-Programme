package Inheritance;

import javax.swing.JOptionPane;

public class StartPoint {

	public static void main(String[] args) {
		
		BankAccount bankAccount = new BankAccount("HHH", "123", 10000);
		SavingAccount savingAccount = new SavingAccount("Hhh", "123", 10000, 10);
		CheckingAccount checkingAccount = new CheckingAccount("HH", "1234", 10000, 15);
		
		System.out.println(bankAccount.Deposite(500));
		System.out.println(savingAccount.Withdraw(15000));
		System.out.println(checkingAccount.Withdraw(20000));
		

	}

}
