package application;

import entities.Account;
import entities.SavingsAccount2;

public class Program_Polymorphism {

	public static void main(String[] args) {

		Account acc1 = new Account(100, "Alex", 1000.0);
		Account acc2 = new SavingsAccount2(1001, "Pedro", 200.0, 1.01);
		
		
		System.out.println(acc1.getBalance());
		System.out.println(acc2.getBalance());
		
		
	}
	
}
