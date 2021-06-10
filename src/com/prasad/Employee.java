package com.prasad;

public class Employee {
	private int id;
	private int sal;

	@Override
	public String toString() {
		return "Employee [id=" + id + ", sal=" + sal + "]";
	}

	public int getId() { 
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getSal() {
		return sal;
	}

	public void setSal(int sal) {
		this.sal = sal;
	}
}
