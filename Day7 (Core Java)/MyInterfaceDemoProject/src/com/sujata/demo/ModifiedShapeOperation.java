package com.sujata.demo;

public class ModifiedShapeOperation extends ShapeOperation {

	@Override
	public void shapeOperation() {
		getShape().area();
		getShape().perimeter();
		getShape().circumference();
	}
}
