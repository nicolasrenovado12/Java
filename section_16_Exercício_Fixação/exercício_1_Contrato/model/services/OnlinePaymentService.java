package model.services;

public interface OnlinePaymentService {

	public Double paymentFee(double amount);
	public Double interest(double amount, int months);
	
}
