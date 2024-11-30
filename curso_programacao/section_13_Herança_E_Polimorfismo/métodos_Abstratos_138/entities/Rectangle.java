package entities;

import enums.Color;

public class Rectangle extends Shape {

	public double width;
	public double height;
	
	
	
	public Rectangle(Color color, double width, double height) {
		super(color);
		this.width = width;
		this.height = height;
	}



	@Override
	public double area() {
		return width*height;
	}

	
	
}
