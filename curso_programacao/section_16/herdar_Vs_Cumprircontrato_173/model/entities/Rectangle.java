package model.entities;

import model.enums.Color;

public class Rectangle extends Shape{

	private double height;
	private double width;
	
	public double area() {
		return width * height;
	}

	public Rectangle(Color color, double height, double width) {
		super(color);
		this.height = height;
		this.width = width;
	}

	
	
	
}
