package com.sujata.generics;
/*
 * if two objects are meaningfully equal,then their hashcode must also be same
 * if two objects hashcode are same they might not be meaningfully equal
 */
public class Person {

	private int pId;
	private String pName;
	public Person(int pId, String pName) {
		super();
		this.pId = pId;
		this.pName = pName;
	}
	@Override
	public String toString() {
		return "Person [pId=" + pId + ", pName=" + pName + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + pId;
		result = prime * result + ((pName == null) ? 0 : pName.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (pId != other.pId)
			return false;
		if (pName == null) {
			if (other.pName != null)
				return false;
		} else if (!pName.equals(other.pName))
			return false;
		return true;
	}
	
	
	
}
