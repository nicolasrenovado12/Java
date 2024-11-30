package entities;

import enums.Color;

public abstract class Shape {

	public Color color;
	
	public abstract double area();

	public Shape(Color color) {
		super();
		this.color = color;
	}
	
	
	
}
