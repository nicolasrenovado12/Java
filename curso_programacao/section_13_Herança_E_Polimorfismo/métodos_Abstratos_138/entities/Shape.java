package entities;

import enums.Color;

public abstract class Shape {

	public Color color;
	
	public abstract double Area();

	public Shape(Color color) {
		super();
		this.color = color;
	}
	
	
	
}
