package construtores_76;

public class Employee {

	Double realSalary;

	public String name;
	public Double grossSalary;
	public Double tax;
	public Double percentage;
	
	public Employee( String name,  Double grossSalary, Double tax) {
		this.name = name;
		this.grossSalary = grossSalary;
		this.tax = tax;
	}

	public double NetSalary() {
		realSalary = grossSalary -= tax;
		return realSalary;
	}

	public double IncreaseSalary() {
		return realSalary += ((grossSalary * percentage) / 100);
	}

	public String toString() {
		return name + ", " + realSalary;
	}
}
