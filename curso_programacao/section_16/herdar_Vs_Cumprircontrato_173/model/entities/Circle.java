package model.entities;

import model.enums.Color;

public class Circle extends Shape {

	private double radius;
	
	@Override
	public double area() {
		return Math.PI * Math.pow(radius, 2);
	}

	public Circle(Color color, double radius) {
		super(color);
		this.radius = radius;
	}
	
}
