package com.javalive.advanceCollettionConcepts;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;



/**
 * @author JavaLive.com
 * @description Java 11 Collections API Changes
				A new default method toArray(IntFunction<T[]> generator) added in the Collection interface. 
				This method returns an array containing all of the elements in this collection, using the 
				provided generator function to allocate the returned array.
 */
public class Java11CollectionAPIAdditions {
	public static void main(String[] args) {

		/*
		 * JDK 11 New Method in Collection interface 
		 * default <T> T[] toArray(IntFunction<T[]> generator) {
		 * return toArray(generator.apply(0)); }
		 */

		List<String> strList = new ArrayList<>();
		strList.add("Java");
		strList.add("Python");
		strList.add("Android");

		String[] strArray = strList.toArray(size -> new String[size]);
		System.out.println(Arrays.toString(strArray));

		strArray = strList.toArray(size -> new String[size + 5]);
		System.out.println(Arrays.toString(strArray));

		strArray = strList.toArray(size -> new String[size * 3]);
		System.out.println(Arrays.toString(strArray));
	}
}
