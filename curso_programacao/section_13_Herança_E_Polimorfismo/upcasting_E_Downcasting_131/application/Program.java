package application;

import entities.Account2;
import entities.BusinessAccount2;
import entities.SavingsAccount;

public class Program {

	public static void main(String[] args) {
		
		Account2 acc = new Account2(1002, "Alex", 0.0);
		BusinessAccount2 bacc = new BusinessAccount2(1003, "Nicolas", 0.0, 400.0);
		
		// UPCASTING
		
		Account2 acc1 = bacc;
		Account2 acc2 = new BusinessAccount2(1004, "João", 0.0, 400.0);
		Account2 acc3 = new SavingsAccount(1005, "Biel", 0.3, 3.3);
		
		// DOWNCASTING 
		
		BusinessAccount2 acc4 = (BusinessAccount2) acc2;
		acc4.loan(90.0);
		
		// BusinessAccount2 acc5 = (BusinessAccount2) acc3; 
		/*
		 * this is not allowed, and i am don't like this operations 
		 * in downcasting, because is not orthogonal.
		 */
	
		
		System.out.println(acc2.toString());
		
	}
	
}
