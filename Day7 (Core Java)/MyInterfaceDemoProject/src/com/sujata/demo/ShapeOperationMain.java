package com.sujata.demo;



public class ShapeOperationMain {

	public static void main(String[] args) {
		ShapeOperation sOb=new ShapeOperation();
		sOb.setShape(new Rectangle());
		sOb.shapeOperation();

		sOb.setShape(new Circle());
		sOb.shapeOperation();
		
		sOb=new ModifiedShapeOperation();
		sOb.setShape(new Rectangle());
		sOb.shapeOperation();
		
		sOb.setShape(new Oval());
		sOb.shapeOperation();
	}

}
