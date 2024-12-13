package entities;

import java.security.InvalidParameterException;

public class UsaInterestService implements InterestService {

	public double interestRate;

	public UsaInterestService(double interestRate) {
		super();
		this.interestRate = interestRate;
	}

	@Override
	public double getInterestRate() {
		return interestRate;
	}

}
