package com.javalive.advanceCollettionConcepts;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author JavaLive.com
 * @description In this program we will study SynchronizedList. The
 *              synchronizedList() method of java.util.Collections class is used
 *              to return a synchronized (thread-safe) list backed by the
 *              specified list. In order to guarantee serial access, it is
 *              critical that all access to the backing list is accomplished
 *              through the returned list. Syntax:
 * 
 *              public static <T> List<T> synchronizedList(List<T> list)
 *              Parameters: This method takes the list as a parameter to be
 *              “wrapped” in a synchronized list.
 * 
 *              Return Value: This method returns a synchronized view of the
 *              specified list.
 * 
 *              For other collection types the methods are as below: 
 *              public static Collection synchronizedCollection(Collection c); 
 *              public static Set synchronizedSet(Set s); 
 *              public static ListsynchronizedList(List list); 
 *              public static <K,V> Map<K,V> synchronizedMap(Map<K,V> m); 
 *              public static SortedSet synchronizedSortedSet(SortedSet s); 
 *              public static <K,V> SortedMap<K,V> synchronizedSortedMap(SortedMap<K,V> m);
 * 
 *              Below are the examples to illustrate the synchronizedList()
 *              method
 *
 */
public class SynchronizedCollectionDemo {
	public static void main(String[] argv) throws Exception {
		try {

			// creating object of List<String>
			List<String> list = new ArrayList<String>();

			// populate the list
			list.add("A");
			list.add("B");
			list.add("C");
			list.add("D");
			list.add("E");

			// printing the Collection
			System.out.println("List : " + list);

			// create a synchronized list
			List<String> synlist = Collections.synchronizedList(list);

			// printing the Collection
			System.out.println("Synchronized list is : " + synlist);
		}

		catch (IllegalArgumentException e) {
			System.out.println("Exception thrown : " + e);
		}
	}
}
