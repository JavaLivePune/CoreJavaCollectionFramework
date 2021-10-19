package com.javalive;

import java.util.HashSet;

public class EqualsAndHashCodeDemoPart4 {
	public static void main(String[] args) {
		Student4 alex1 = new Student4(1, "Alex");
		Student4 alex2 = new Student4(1, "Alex");

		HashSet<Student4> students = new HashSet<Student4>();
		students.add(alex1);
		students.add(alex2);
		System.out.println("HashSet size = " + students.size());
		System.out.println("HashSet contains Alex = " + students.contains(new Student4(1, "Alex")));
	}
}

class Student4 {
	private int id;
	private String name;

	public Student4(int id, String name) {
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

	@Override
	public boolean equals(Object obj) {
		if (obj == null)
			return false;
		if (!(obj instanceof Student4))
			return false;
		if (obj == this)
			return true;
		return this.getId() == ((Student4) obj).getId();
	}

	@Override
	public int hashCode() {
		return id;
	}
}
