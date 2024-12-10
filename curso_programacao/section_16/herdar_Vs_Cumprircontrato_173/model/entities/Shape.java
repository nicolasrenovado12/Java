package model.entities;

import model.enums.Color;

public abstract class Shape {

	private Color color;
	
	public abstract double area();
	
	public Color getColor() {
		return color;
	}

	public Shape(Color color) {
		super();
		this.color = color;
	} 
	
	
}
