package com.javalive;

import java.util.Vector;

/**
 * @author JavaLive.com
 * @description The Vector class implements a growable array of objects. Vectors
 *              basically fall in legacy classes but now it is fully compatible
 *              with collections.
 * 
 *              1.Vector implements a dynamic array that means it can grow or
 *              shrink as required. Like an array, it contains components that
 *              can be accessed using an integer index.
 *              2.They are very similar to ArrayList but Vector is synchronised and 
 *              have some legacy method which collection framework does not contain. 
 *              3.It extends  AbstractList and implements List interfaces. 
 *              
 *              Constructor:
 *              1. Vector(): Creates a default vector of initial capacity is 10.
 *              Vector(int size): Creates a vector whose initial capacity is
 *              specified by size. 
 *              2. Vector(int size, int incr): Creates a vector whose initial 
 *              capacity is specified by size and increment is
 *              specified by incr. It specifies the number of elements to
 *              allocate each time that a vector is resized upward.
 *              3. Vector(Collection c): Creates a vector that contains the
 *              elements of collection c. Important points regarding Increment
 *              of vector capacity: If increment is specified, Vector will
 *              expand according to it in each allocation cycle but if increment
 *              is not specified then vector’s capacity get doubled in each
 *              allocation cycle. Vector defines three protected data member:
 * 
 *              1. int capacityIncreament: Contains the increment value. 
 *              2. int elementCount: Number of elements currently in vector stored in it. 
 *              3. Object elementData[]: Array that holds the vector is stored in it.
 *
 */
public class VectorDemo {
	public static void main(String[] args) {
		Vector<String> mammals = new Vector<>();

		// Using the add() method
		mammals.add("Dog");
		mammals.add("Horse");

		// Using index number
		mammals.add(2, "Cat");
		System.out.println("Vector: " + mammals);

		// Using addAll()
		Vector<String> animals = new Vector<>();
		animals.add("Crocodile");

		animals.addAll(mammals);
		System.out.println("New Vector: " + animals);
	}
}
