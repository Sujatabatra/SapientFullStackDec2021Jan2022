package com.sujata.generics;

class InputInteger{
	private Integer value;

	public Integer getValue() {
		return value;
	}

	public void setValue(Integer value) {
		this.value = value;
	}
	
}

class InputString{
	private String value;

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}
	
}

class InputDouble{
	Double value;

	public Double getValue() {
		return value;
	}

	public void setValue(Double value) {
		this.value = value;
	}
	
}

class GenericInputClass<T>{
	
	private T value;

	public T getValue() {
		return value;
	}

	public void setValue(T value) {
		this.value = value;
	}
	
}
public class MyFirstDemo {

	public static void main(String[] args) {
		GenericInputClass<String> sOb=new GenericInputClass<String>();
		sOb.setValue("sujata");
		System.out.println(sOb.getValue());
		
		GenericInputClass<Float> fOb=new GenericInputClass<Float>();
		fOb.setValue(4.5f);
		System.out.println(fOb.getValue());

		GenericInputClass<Person> pOb=new GenericInputClass<Person>();
		pOb.setValue(new Person(101, "AAAA"));
		/*
		 * whenever we display object with System.out.println(),
		 * implicit call to Object Class toString() happens,
		 * the default behaviour of toString() method is to display hashcode
		 */
		System.out.println(pOb.getValue()/*.toString()*/);
		
	}

}
