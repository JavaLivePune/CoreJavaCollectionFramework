package com.javalive;

public class EqualsAndHashCodeDemoPart1 {
	public static void main(String[] args) {
		Student1 alex1 = new Student1(1, "Alex");
		Student1 alex2 = new Student1(1, "Alex");
		System.out.println("alex1 hashcode = " + alex1.hashCode());
		System.out.println("alex2 hashcode = " + alex2.hashCode());
		System.out.println("Checking equality between alex1 and alex2 = " + alex1.equals(alex2));
	}
}

class Student1 {
	private int id;
	private String name;

	public Student1(int id, String name) {
		this.name = name;
		this.id = id;
	}

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
}