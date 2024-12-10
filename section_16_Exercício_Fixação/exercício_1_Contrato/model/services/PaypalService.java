package model.services;

public class PaypalService implements OnlinePaymentService {

	@Override
	public Double paymentFee(double amount) {
		amount = amount * 0.02;
		return amount;
	}

	@Override
	public Double interest(double amount, int months) {
		return  (amount *  months) / 100;
	}

}
