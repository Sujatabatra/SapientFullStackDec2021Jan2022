package com.sujata.demo;

class Person{
	private int id;
	private String name;
	public Person(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + "]";
	}
	
}

interface PersonFactory{
	Person getObject(int id,String name);
}
public class ConstructorCallMethodReference {

	public static void main(String[] args) {
//		PersonFactory personFactory=new PersonFactory() {
//			@Override
//			public Person getObject(int id, String name) {
//				return new Person(id,name);
//			}
//		};

//		PersonFactory personFactory=(id,name)-> new Person(id,name);
		PersonFactory personFactory=Person::new;
			
		System.out.println(personFactory.getObject(101, "AAAA"));
	}

}
