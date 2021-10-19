package com.javalive;

import java.util.LinkedHashSet;

/**
 * @author JavaLive.com
 * @description A LinkedHashSet is an ordered version of HashSet that maintains
 *              a doubly-linked List across all elements. When the iteration
 *              order is needed to be maintained this class is used. When
 *              iterating through a HashSet the order is unpredictable, while a
 *              LinkedHashSet lets us iterate through the elements in the order
 *              in which they were inserted. When cycling through LinkedHashSet
 *              using an iterator, the elements will be returned in the order in
 *              which they were inserted.
 * 
 *              Syntax:
 * 
 *              LinkedHashSet<String> hs = new LinkedHashSet<String>(); Contains
 *              unique elements only like HashSet. It extends HashSet class and
 *              implements Set interface. Maintains insertion order. Given below
 *              are the list of constructors supported by the LinkedHashSet:
 * 
 *              LinkedHashSet(): This constructor is used to create a default
 *              HashSet. LinkedHashSet(Collection C): Used in initializing the
 *              HashSet with the eleements of the collection C LinkedHashSet(int
 *              size): Used to initialize the size of the LinkedHashSet with the
 *              integer mentioned in the parameter. LinkedHashSet(int capacity,
 *              float fillRatio): Can be used to initialize both the capacity
 *              and the fill ratio, also called the load capacity of the
 *              LinkedHashSet with the arguments mentioned in the parameter.
 *              When the number of elements exceeds the capacity of the hash set
 *              is multiplied with the fill ratio thus expanding the capacity of
 *              the LinkedHashSet Methods in LinkedHashSet:
 * 
 *              spliterator?(): This method creates a late-binding and fail-fast
 *              Spliterator over the elements in this set. clear?(): This method
 *              removes all of the elements from this set. contains?(Object o):
 *              This method returns true if this set contains the specified
 *              element.
 * 
 *              Below program explains the basic add and traversal operation of
 *              LinkedHashSet:
 *
 */
public class LinkedHashSetDemo {
	public static void main(String[] args) {
		LinkedHashSet<String> linkedset = new LinkedHashSet<String>();

		// Adding element to LinkedHashSet
		linkedset.add("A");
		linkedset.add("B");
		linkedset.add("C");
		linkedset.add("D");

		// This will not add new element as A already exists
		linkedset.add("A");
		linkedset.add("E");

		System.out.println("Size of LinkedHashSet = " + linkedset.size());
		System.out.println("Original LinkedHashSet:" + linkedset);
		System.out.println("Removing D from LinkedHashSet: " + linkedset.remove("D"));
		System.out.println("Trying to Remove Z which is not " + "present: " + linkedset.remove("Z"));
		System.out.println("Checking if A is present=" + linkedset.contains("A"));
		System.out.println("Updated LinkedHashSet: " + linkedset);
	}
}
