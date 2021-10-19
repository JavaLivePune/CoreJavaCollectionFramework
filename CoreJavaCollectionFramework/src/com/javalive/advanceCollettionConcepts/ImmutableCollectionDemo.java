package com.javalive.advanceCollettionConcepts;

import java.util.ArrayList;
import java.util.List;

import com.google.common.collect.ImmutableList;

/**
 * @author JavaLive.com
 * @description ref: https://www.geeksforgeeks.org/immutable-list-in-java/
 *              Immutable List in Java ImmutableList, as suggested by the name,
 *              is a type of List which is immutable. It means that the content
 *              of the List are fixed or constant after declaration, that is,
 *              they are read-only. If any attempt made to add, delete and
 *              update elements in the List, UnsupportedOperationException is
 *              thrown. An ImmutableList does not allow null element either. If
 *              any attempt made to create an ImmutableList with null element,
 *              NullPointerException is thrown. If any attempt is made to add
 *              null element in List, UnsupportedOperationException is thrown.
 *              Advantages of ImmutableList
 * 
 *              They are thread safe. They are memory efficient. Since they are
 *              immutable, hence they can be passed over to third party
 *              libraries without any problem. Note that it is an immutable
 *              collection, not collection of immutable objects, so the objects
 *              inside it can be modified.
 * 
 *              Class Declaration:
 * 
 * @GwtCompatible(serializable=true, emulated=true) public abstract class
 *                                   ImmutableList extends ImmutableCollection
 *                                   implements List, RandomAccess
 * 
 *                                   Class hierarchy:
 * 
 *                                   java.lang.Object
 *                                   java.util.AbstractCollection
 *                                   com.google.common.collect.ImmutableCollection
 *                                   com.google.common.collect.ImmutableList
 * 
 *                                   Below is a Java program for creating an
 *                                   immutable List using copyOf() and modifying
 *                                   original List.
 */
public class ImmutableCollectionDemo {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("Java");

		// Create ImmutableList from List using copyOf()
		ImmutableList<String> iList = ImmutableList.copyOf(list);

		// We change List and the changes wont reflect in iList.
		list.add("Live");
		list.add(".com");

		System.out.println(iList);

		// When we try to add any element in iList
		// iList.add("Item");
	}
}
