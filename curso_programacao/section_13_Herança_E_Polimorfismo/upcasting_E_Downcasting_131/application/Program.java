package application;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount2;

public class Program {

	public static void main(String[] args) {
		
		Account acc = new Account(1002, "Alex", 0.0);
		BusinessAccount bacc = new BusinessAccount(1003, "Nicolas", 0.0, 400.0);
		
		// UPCASTING
		
		Account acc1 = bacc;
		Account acc2 = new BusinessAccount(1004, "João", 0.0, 400.0);
		Account acc3 = new SavingsAccount2(1005, "Biel", 0.3, 3.3);
		
		// DOWNCASTING 
		
		BusinessAccount acc4 = (BusinessAccount) acc2;
		acc4.loan(90.0);
		
		// BusinessAccount2 acc5 = (BusinessAccount2) acc3; 
		/*
		 * this is not allowed, and i am don't like this operations 
		 * in downcasting, because is not orthogonal.
		 */
	
		
		System.out.println(acc2.toString());
		
	}
	
}
