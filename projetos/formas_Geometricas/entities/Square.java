package entities;

public class Square implements Shape{

	private double side;
	
	@Override
	public double area() {
		return side*side;
	}

}
