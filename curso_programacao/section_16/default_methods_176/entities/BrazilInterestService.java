package entities;

import java.security.InvalidParameterException;

public class BrazilInterestService implements InterestService {

	public double interestRate;

	public BrazilInterestService(double interestRate) {
		super();
		this.interestRate = interestRate;
	}

	@Override
	public double getInterestRate() {
		return interestRate;
	}

}
