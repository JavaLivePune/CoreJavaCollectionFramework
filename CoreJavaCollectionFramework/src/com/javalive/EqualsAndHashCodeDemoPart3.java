package com.javalive;

import java.util.HashSet;

public class EqualsAndHashCodeDemoPart3 {
	public static void main(String[] args) {
		Student3 alex1 = new Student3(1, "Alex");
        Student3 alex2 = new Student3(1, "Alex");
        
		HashSet <Student3> students = new HashSet <Student3> ();
        students.add(alex1);
        students.add(alex2);
        System.out.println("HashSet size = " + students.size());
        System.out.println("HashSet contains Alex = " + students.contains(new Student3(1, "Alex")));
	}
}

class Student3 {
	private int id;
	private String name;

	public Student3(int id, String name) {
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
	    if (!(obj instanceof Student3))
	        return false;
	    if (obj == this)
	        return true;
	    return this.getId() == ((Student3) obj).getId();
	}
}
