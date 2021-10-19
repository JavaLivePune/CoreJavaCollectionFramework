package com.javalive;

import java.util.Set;
import java.util.TreeSet;

/**
 * @author JavaLive.com
 * @description TreeSet is one of the most important implementations of the SortedSet interface in Java that 
 * uses a Tree for storage. The ordering of the elements is maintained by a set using their natural ordering 
 * whether or not an explicit comparator is provided. This must be consistent with equals if it is to correctly
 * implement the Set interface. It can also be ordered by a Comparator provided at set creation time, depending
 *  on which constructor is used. The TreeSet implements a NavigableSet interface by inheriting AbstractSet 
 *  class.
Few important features of TreeSet are as follows:

TreeSet implements the SortedSet interface so duplicate values are not allowed.
Objects in a TreeSet are stored in a sorted and ascending order.
TreeSet does not preserve the insertion order of elements but elements are sorted by keys.
TreeSet does not allow to insert Heterogeneous objects. It will throw classCastException at Runtime if trying 
to add hetrogeneous objects.
TreeSet serves as an excellent choice for storing large amounts of sorted information which are supposed to be 
accessed quickly because of its faster access and retrieval time.
TreeSet is basically implementation of a self-balancing binary search tree like Red-Black Tree. Therefore 
operations like add, remove and search take O(Log n) time. And operations like printing n elements in sorted 
order takes O(n) time.
Constructors of TreeSet class:

TreeSet t = new TreeSet();
This will create empty TreeSet object in which elements will get stored in default natural sorting order.
TreeSet t = new TreeSet(Comparator comp);
This constructor is used when external specification of sorting order of elements is needed.
TreeSet t = new TreeSet(Collection col);
This constructor is used when any conversion is needed from any Collection object to TreeSet object.
TreeSet t = new TreeSet(SortedSet s);
This constructor is used to convert SortedSet object to TreeSet Object.
Synchronized TreeSet:
The implementation in a TreeSet is not synchronized in a sense that if multiple threads access a tree set 
concurrently, and at least one of the threads modifies the set, it must be synchronized externally. This is 
typically accomplished by synchronizing on some object that naturally encapsulates the set. If no such object 
exists, the set should be “wrapped” using the Collections.synchronizedSortedSet method. This is best done at 
creation time, to prevent accidental unsynchronized access to the set:



TreeSet ts = new TreeSet();
Set syncSet = Collections.synchronziedSet(ts); 



Two things must be kept in mind while creating and adding elements into a TreeSet:

Firstly, insertion of null into a TreeSet throws NullPointerException because while insertion of null, it 
gets
compared to the existing elements and null cannot be compared to any value.
Secondly, if we are depending on default natural sorting order, compulsory the object should be homogeneous 
and comparable otherwise we will get RuntimeException:ClassCastException
NOTE:
An object is said to be comparable if and only if the corresponding class implements Comparable interface.
String class and all Wrapper classes already implements Comparable interface but StringBuffer class doesn’t 
implements Comparable interface.Hence we got ClassCastException in the above example.
For an empty tree-set, when trying to insert null as first value, one will get NPE from JDK 7.From 1.7 
onwards 
null is not at all accepted by TreeSet. However upto JDK 6, null will be accepted as first value, but any 
if insertion of any more values in the TreeSet, will also throw NullPointerException.
Hence it was considered as bug and thus removed in JDK 7.

Below program illustrates the basic opearation of a TreeSet:
 */
public class TreeSetDemo {
	public static void main(String[] args) 
    { 
        Set<String> ts1 = new TreeSet<String>(); 
  
        // Elements are added using add() method 
        ts1.add("A"); 
        ts1.add("B"); 
        ts1.add("C"); 
  
        // Duplicates will not get insert 
        ts1.add("C"); 
  
        // Elements get stored in default natural 
        // Sorting Order(Ascending) 
        System.out.println(ts1); 
    } 
}
