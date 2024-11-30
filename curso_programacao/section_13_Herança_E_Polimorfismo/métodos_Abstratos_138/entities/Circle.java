package entities;

import enums.Color;

public class Circle extends Shape{

	public double radius;

	
	public Circle(Color color, double radius) {
		super(color);
		this.radius = radius;
	}
	
	@Override
	public double area() {
		return 3.14 * radius;
	}

	
}
