package com.javalive;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

/**
 * @author JavaLive.com
 * @description The TreeMap in Java is used to implement Map interface and
 *              NavigableMap along with the Abstract Class. The map is sorted
 *              according to the natural ordering of its keys, or by a
 *              Comparator provided at map creation time, depending on which
 *              constructor is used. This proves to be an efficient way of
 *              sorting and storing the key-value pairs. The storing order
 *              maintained by the treemap must be consistent with equals just
 *              like any other sorted map, irrespective of the explicit
 *              comparators. The treemap implementation is not synchronized in
 *              the sense that if a map is accessed by multiple threads,
 *              concurrently and at least one of the threads modifies the map
 *              structurally, it must be synchronized externally. Some important
 *              features of the treemap are:
 * 
 *              This class is a member of Java Collections Framework. The class
 *              implements Map interfaces including NavigableMap, SortedMap and
 *              extends AbstractMap TreeMap in Java does not allow null keys
 *              (like Map) and thus a NullPointerException is thrown. However,
 *              multiple null values can be associated with different keys. All
 *              Map.Entry pairs returned by methods in this class and its views
 *              represent snapshots of mappings at the time they were produced.
 *              They do not support the Entry.setValue method.
 * 
 *              Performance factors: TreeMap is not synchronized and thus is not
 *              thread-safe. For multithreaded environments, accidental
 *              unsynchronized access to the map is prevented by:
 * 
 *              SortedMap m = Collections.synchronizedSortedMap(new
 *              TreeMap(...)); Internal structure: The methods in TreeMap while
 *              getting keyset and values, return Iterator that are fail-fast in
 *              nature, thus any concurrent modification will throw
 *              ConcurrentModificationException.
 * 
 * 
 * 
 *              TreeMap is based upon tree data structure. Each node in the tree
 *              has,
 * 
 *              3 Variables (K key=Key, V value=Value, boolean color=Color) 3
 *              References (Entry left = Left, Entry right = Right, Entry parent
 *              = Parent)
 * 
 *              Time Complexity: The algorithmic implementation is adapted from
 *              those of Red-Black Tree in Introduction to Algorithms (Eastern
 *              Economy Edition)
 * 
 *              This provides guaranteed log(n) time cost for the containsKey,
 *              get, put and remove operations.
 * 
 */

// A class to represent a student.
class Student {
	int rollno;
	String name, address;

	// Constructor
	public Student(int rollno, String name, String address) {
		this.rollno = rollno;
		this.name = name;
		this.address = address;
	}

	// Used to print student details in main()
	public String toString() {
		return this.rollno + " " + this.name + " " + this.address;
	}
}

// Comparator implementattion
class Sortbyroll implements Comparator<Student> {

	// Used for sorting in ascending order of
	// roll number
	public int compare(Student a, Student b) {
		return a.rollno - b.rollno;
	}
}

public class TreeMapDemo {
	static void Example2ndConstructor() {
		// Creating an empty TreeMap
		Map<Student, Integer> tree_map = new TreeMap<Student, Integer>(new Sortbyroll());

		// Mapping string values to int keys
		tree_map.put(new Student(111, "bbbb", "london"), 2);
		tree_map.put(new Student(131, "aaaa", "nyc"), 3);
		tree_map.put(new Student(121, "cccc", "jaipur"), 1);

		// Displaying the TreeMap
		System.out.println("TreeMap: " + tree_map);
	}

	public static void main(String[] args) {

		System.out.println("TreeMap using " + "TreeMap(Comparator)" + " constructor:\n");
		Example2ndConstructor();
	}
}
