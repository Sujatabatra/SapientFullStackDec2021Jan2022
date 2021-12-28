package com.sujata.demo;

import com.sujata.demo.OurOuter.OurInner;

class OurOuter{
	private int x;
	private static int y;
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public static int getY() {
		return y;
	}
	public static void setY(int y) {
		OurOuter.y = y;
	}
	static class OurInner{
		private String name;

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}
		
	}
}

public class NestedInnerClassDemo {

	public static void main(String[] args) {
		OurOuter.setY(20);
		System.out.println("y : "+OurOuter.getY());
		
		OurOuter.OurInner ob=new OurOuter.OurInner();
		ob.setName("Sujata");
		System.out.println("name : "+ob.getName());
}
}