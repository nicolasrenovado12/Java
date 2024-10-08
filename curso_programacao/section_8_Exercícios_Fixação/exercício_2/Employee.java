package exercício_2;

public class Employee {

	Double realSalary;
	
	public String name;

	public Double grossSalary;
	
	public Double tax;
	
	public Double percentage;
	
	
	public double NetSalary() {
		realSalary = grossSalary -= tax;
		return realSalary;
	}
	public double IncreaseSalary() {
		return realSalary += ((grossSalary * percentage) / 100 );
	}
	public String toString() {
		return name + ", " + realSalary;
	}
}
