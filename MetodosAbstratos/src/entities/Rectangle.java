package entities;

import entities.enums.Colors;

public class Rectangle extends Shape {

	private double height, width;
	
	public Rectangle() {
	}
	
	public Rectangle(Colors color, double height, double width) {
		super(color);
		this.height = height;
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	@Override
	public double area() {
		return height * width;
	}

	

}
