package entities;

import exceptions.WithdrawException;

public class Account {

	private Integer number;
	private String holder;
	private Double balance;
	private Double withdrawLimit;

	public Account(Integer number, String holder, Double balance, Double withdrawLimit) {
		super();
		this.number = number;
		this.holder = holder;
		this.balance = balance;
		this.withdrawLimit = withdrawLimit;
	}

	public Double getBalance() {
		return balance;
	}

	public void withdraw(Double amount) throws WithdrawException {

		if (amount > withdrawLimit) {
			throw new WithdrawException("The amount exceeds withdraw limit");
		}
	}

	public void deposit(Double amount) {
		balance += amount;
	}
}
