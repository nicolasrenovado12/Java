package objects;

public class  Action {

	public String name;
	public double actionNumber;
	public double actionDividends;
	
	public Action(String name, double actionNumber, double actionDividends) {
		this.name = name;
		this.actionNumber = actionNumber;
		this.actionDividends = actionDividends;
	}
	
	public double calculedividends(double quantity) {
		
		double b = actionDividends * quantity;
		return b;
	}
	
	
	
	
	
}
