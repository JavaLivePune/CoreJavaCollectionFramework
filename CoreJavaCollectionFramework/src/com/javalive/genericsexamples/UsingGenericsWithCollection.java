package com.javalive.genericsexamples;

import java.util.ArrayList;
import java.util.List;

class Employee {
	private int id;
	private String name;
	private String address;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Employee(int id, String name, String address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
	}

	public Employee() {
		super();
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", address=" + address + "]";
	}

}

public class UsingGenericsWithCollection {
	public static void main(String[] args) {
		Integer i= new Integer(10);
		Float f= new Float(5.5f);
		String s=new String("StringValue");
		Employee emp=new Employee(10,"Name1","Address1");
		//Flavour1: here the List is of raw datatype i.e. we can add any type of object in it. 
		List list1=new ArrayList();
		list1.add(i);
		list1.add(f);
		list1.add(s);
		list1.add(emp);
		System.out.println("Contents of List1:  "+list1.toString());
		
		//Flavour2: here we create List with generics and see what happens.
		List<Employee> list2=new ArrayList<Employee>();
		//list2.add(i);
		list2.add(emp);
		System.out.println("Contents of List1:  "+list2.toString());
	}
}
