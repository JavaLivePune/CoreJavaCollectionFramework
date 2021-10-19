package com.javalive;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author JavaLive.com
 * @description ArrayList is a part of collection framework and is present in
 *              java.util package. It provides us dynamic arrays in Java.
 *              Though, it may be slower than standard arrays but can be helpful
 *              in programs where lots of manipulation in the array is needed.
 * 
 *              ArrayList inherits AbstractList class and implements List
 *              interface. ArrayList is initialized by a size, however the size
 *              can increase if collection grows or shrunk if objects are
 *              removed from the collection. Java ArrayList allows us to
 *              randomly access the list. ArrayList can not be used for
 *              primitive types, like int, char, etc. We need a wrapper class
 *              for such cases (see this for details). ArrayList in Java can be
 *              seen as similar to vector in C++.
 * 
 *              Now primarily the Java ArrayList can constitute of both
 *              Constructors and Methods. Below mentioned is a list of few
 *              constructors and methods along with there use and functions.
 * 
 * 
 * 
 *              Constructors in Java ArrayList:
 * 
 *              ArrayList(): This constructor is used to build an empty array
 *              list ArrayList(Collection c): This constructor is used to build
 *              an array list initialized with the elements from collection c
 *              ArrayList(int capacity): This constructor is used to build an
 *              array list with initial capacity being specified
 * 
 *              Let us look at the code to create generic ArrayList-
 * 
 *              // Creating generic integer ArrayList ArrayList<Integer> arrli =
 *              new ArrayList<Integer>();
 */
public class ArrayListDemo {
	public static void main(String[] args) throws IOException {
		// size of ArrayList
		int n = 5;

		// declaring ArrayList with initial size n
		List<Integer> arrli = new ArrayList<Integer>(n);

		// Appending the new element at the end of the list
		for (int i = 1; i <= n; i++)
			arrli.add(i);

		// Printing elements
		System.out.println(arrli);

		// Remove element at index 3
		arrli.remove(3);

		// Displaying ArrayList after deletion
		System.out.println(arrli);

		// Printing elements one by one
		for (int i = 0; i < arrli.size(); i++)
			System.out.print(arrli.get(i) + " ");
	}
}
