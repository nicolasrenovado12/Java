package exercício_1;

public class Account {

	public int number;
	public String holder;
	private double balance;
	
	public Account(int number, String holder, double balance) {
		this.number = number;
		this.holder = holder;
		this.balance = balance;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	
	public double deposit(double deposit) {
		return balance += deposit;
	}
	public double withdraw(double withdraw) {
		return balance -= withdraw - 5;
	}


	public String toString() {
		return "Account " + number + ", holder: " + holder + ", balance: $ " + balance  ;
	}
	
	
	
}
