package exercício_1;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter holder: ");
		String holder = sc.nextLine();
		
		System.out.println("Enter account number: ");
		int number = sc.nextInt();

		System.out.println("Is there a initial deposit (y/n)? ");
		char whichUser = sc.next().charAt(0);
		
		Account account = new Account(number, holder, 0);
		
		if (whichUser == 'y') {
			
			System.out.println("Enter initial deposit value: ");
			double deposit = sc.nextDouble();
			account.deposit(deposit);
			System.out.println("Account data: ");
			System.out.println(account.toString());
			
		} else {
			System.out.println("Account data: ");
			System.out.println(account.toString());		
		}
		
		System.out.println("Enter a deposit value: ");
		double deposit = sc.nextDouble();
		account.deposit(deposit);
		
		System.out.println("Update account data: ");
		System.out.println(account.toString());
		
		System.out.println("Enter a withdraw value: ");
		double withdraw = sc.nextDouble();
		account.withdraw(withdraw);
		
		System.out.println("Update account data: ");
		System.out.println(account.toString());		
		
		
		

		

		
	}

	
}
