package model.entities;

import model.enums.Color;
import model.interfaces.Shape;

public abstract class AbstractShape implements Shape {

	private Color color;
	
	public Color getColor() {
		return color;
	}

	public AbstractShape(Color color) {
		super();
		this.color = color;
	}
	
	public abstract double area();
	
	
}
