package com.javalive;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

/**
 * @author JavaLive.com
 * @description You can iterate a Java List in several different ways. The three
 *              most common ways are:
 * 
 *              1.Using an Iterator 
 *              2.Using a for-each loop 
 *              3.Using a for loop 
 *              4.Using the Java Stream API 
 *              We will explain each of these methods of
 *              iterating a Java List in the following program.
 *
 */
public class ListIteratorDemo {
public static void main(String[] args) {
	
	//Using an Iterator 
	
	System.out.println("List iteration using an Iterator");
	List<String> list = new ArrayList<>();

	list.add("First");
	list.add("Second");
	list.add("Third");

	Iterator<String> iterator = list.iterator();
	while(iterator.hasNext()) {
	    System.out.println(iterator.next());
	}
	System.out.println("==========================================");
	//Using a for-each loop 
	System.out.println("List iteration using a for-each loop");
	List<String> list1 = new ArrayList<String>();

	list1.add("first");
	list1.add("second");
	list1.add("third");

	for(String element : list1) {
	    System.out.println(element);
	}
	
	System.out.println("==========================================");
	//Using a for loop. This is possible but not preferable way.
	System.out.println("List iteration using a for loop");
	List<String> list2 = new ArrayList<String>();

	list2.add("One");
	list2.add("Two");
	list2.add("Three");
	    
	for(int i=0; i < list2.size(); i++) {
		System.out.println(list2.get(i));
	}
	System.out.println("==========================================");
	//Using the Java Stream API
	System.out.println("List iteration using the Java Stream API");
	List<String> stringList = new ArrayList<String>();

	stringList.add("one");
	stringList.add("two");
	stringList.add("three");

	Stream<String> stream = stringList.stream();
	stream
	    .forEach( element -> { System.out.println(element); });
}
}
