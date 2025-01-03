package application;

import entities.Account;
import entities.BusinessAccount2;
import entities.SavingsAccount2;

public class Program2 {

	public static void main(String[] args) {
		
		Account acc1 = new Account(1001, "Alex", 1000.0);
		acc1.withdraw(100);
		System.out.println(acc1.getBalance());
		
		Account acc2 = new SavingsAccount2(1001, "Alex", 1000.0, 0.01);
		acc2.withdraw(100); // Savings account no have tax for the withdraw.
		System.out.println(acc2.getBalance());
		
		Account acc3 = new BusinessAccount2(1003, "Bob", 1000.0, 100.0);
		acc3.withdraw(100.0);
		System.out.println(acc3.getBalance());

	}
	
}
