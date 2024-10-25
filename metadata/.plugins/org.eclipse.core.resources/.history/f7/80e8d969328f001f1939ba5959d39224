package entities;

public class Outsourced_Employee extends Employee {

	public Double additionalCharge;

	public Outsourced_Employee(String name, Integer hours, Double valuePerHour, Double additionalCharge) {
		super(name, hours, valuePerHour);
		this.additionalCharge = additionalCharge;
	}
	@Override
	public Double payment() {
		return (valuePerHour * hours) + additionalCharge;
		
	}

	
	
	
	
	
}
