package com.javalive;

import java.util.ArrayList;
import java.util.List;

public class EqualsAndHashCodeDemoPart2 {
	public static void main(String[] args) {
		Student2 alex1 = new Student2(1, "Alex");
		Student2 alex2 = new Student2(1, "Alex");
		System.out.println("alex1 hashcode = " + alex1.hashCode());
		System.out.println("alex2 hashcode = " + alex2.hashCode());
		System.out.println("Checking equality between alex1 and alex2 = " + alex1.equals(alex2));
		
		
		List < Student2> studentsLst = new ArrayList <Student2> ();
        studentsLst.add(alex1);
        System.out.println("Arraylist size = " + studentsLst.size());
        System.out.println("Arraylist contains Alex = " + studentsLst.contains(new Student2(1, "Alex")));
	}
}

class Student2 {
	private int id;
	private String name;

	public Student2(int id, String name) {
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
	    if (obj == null) return false;
	    if (!(obj instanceof Student2))
	        return false;
	    if (obj == this)
	        return true;
	    return this.getId() == ((Student2) obj).getId();
	}
}
