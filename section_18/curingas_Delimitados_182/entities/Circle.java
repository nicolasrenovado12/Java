package entities;

public class Circle implements Shape {

	private double radius;

	public Circle(double radius) {
		super();
		this.radius = radius;
	}

	@Override
	public Double area() {
		return Math.PI * radius*radius;
	}

}
