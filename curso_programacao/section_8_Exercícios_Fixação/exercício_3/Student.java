package exercício_3;

public class Student {

	String name;

	public double firstNote;
	public double secondNote;
	public double thirdNote;
	
	
	public String calculate() {
		double finalNote = firstNote + secondNote + thirdNote;
		
		if (finalNote > 60) {
			return "PASS";
		} else {
			double missingNote = 60 - finalNote;
			return "FAILED, \nMISSING " + missingNote + " POINTS";
		}
	}
	
}
