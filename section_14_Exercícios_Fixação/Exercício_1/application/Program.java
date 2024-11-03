package application;

import java.util.Scanner;

import entities.Account;
import exceptions.WithdrawException;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.println("Enter account data");
			System.out.print("Number: ");
			int number = sc.nextInt();
			System.out.print("Holder: ");
			String holder = sc.next();
			System.out.print("Initial balance: ");
			double balance = sc.nextDouble();
			System.out.print("withdraw limit: ");
			double withdrawlimit = sc.nextDouble();
			
			Account account = new Account(number, holder, balance, withdrawlimit);
			
			System.out.print("\nEnter amount for withdraw: ");
			double amount = sc.nextDouble();
			account.withdraw(amount);
			account.deposit(amount);
			
			System.out.print("New balance: " + account.getBalance());
			
		} catch (WithdrawException e) {
			System.out.print("Withdraw error: " + e.getMessage());
		}
		
		
		
		sc.close();
	}
	
}
