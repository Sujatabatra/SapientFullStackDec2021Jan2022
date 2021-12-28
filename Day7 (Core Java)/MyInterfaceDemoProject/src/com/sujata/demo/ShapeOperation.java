package com.sujata.demo;

public class ShapeOperation {

	private Shape shape;
	public ShapeOperation() {
		
	}
	public ShapeOperation(Shape shape) {
		super();
		this.shape = shape;
	}
	public Shape getShape() {
		return shape;
	}
	public void setShape(Shape shape) {
		this.shape = shape;
	}
	
	public void shapeOperation() {
		shape.area();
	}
}
