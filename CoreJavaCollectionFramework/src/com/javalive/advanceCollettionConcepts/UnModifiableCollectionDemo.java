package com.javalive.advanceCollettionConcepts;

import java.util.*;

/**
 * @author JavaLive.com
 * @description Collections.unmodifiableList creates a wrapper around the same
 *              existing List such that the wrapper cannot be used to modify it.
 *              However we can still change original List.
 *
 *              Java program to demonstrate that a List created using
 *              Collections.unmodifiableList() can be modified indirectly.
 */

public class UnModifiableCollectionDemo {
	public static void main(String[] args) {
		List<String> baseList = new ArrayList<>();
		baseList.add("Java");

		// Create ImmutableList from List
		List<String> unmodifiableList = Collections.unmodifiableList(baseList);

		// When we try to change unmodifiableList it leads to java.lang.UnsupportedOperationException
		unmodifiableList.add("Add");
		
		// We change List and the changes reflect in unmodifiableList object.
		baseList.add("Live");
		baseList.add(".com");

		System.out.println(unmodifiableList);
	}
}
