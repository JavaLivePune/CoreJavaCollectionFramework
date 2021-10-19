package com.javalive;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * @author JavaLive.com
 * @description The HashSet class implements the Set interface, backed by a hash table which is actually a 
 * HashMap instance. No guarantee is made as to the iteration order of the set which means that the class 
 * does not guarantee the constant order of elements over time. This class permits the null element. 
 * The class also offers constant time performance for the basic operations like add, remove, contains and 
 * size assuming the hash function disperses the elements properly among the buckets, which we shall see 
 * further in the article.
Few important features of HashSet are:

Implements Set Interface.
Underlying data structure for HashSet is hashtable.
As it implements the Set Interface, duplicate values are not allowed.
Objects that you insert in HashSet are not guaranteed to be inserted in same order. Objects are inserted 
based on their hash code.
NULL elements are allowed in HashSet.
HashSet also implements Searlizable and Cloneable interfaces.
HashSet

Now for the maintenance of constant time performance, iterating over HashSet requires time proportional to 
the sum of the HashSet instance’s size (the number of elements) plus the “capacity” of the backing HashMap 
instance (the number of buckets). Thus, it’s very important not to set the initial capacity too high (or the 
load factor too low) if iteration performance is important.

Initial Capacity: The initial capacity means the number of buckets when hashtable (HashSet internally uses 
hashtable data structure) is created. The number of buckets will be automatically increased if the current 
size gets full.
Load Factor: The load factor is a measure of how full the HashSet is allowed to get before its capacity 
is automatically increased. When the number of entries in the hash table exceeds the product of the load 
factor and the current capacity, the hash table is rehashed (that is, internal data structures are rebuilt) 
so that the hash table has approximately twice the number of buckets.

                  Number of stored elements in the table
   load factor = -----------------------------------------
                        Size of the hash table 
Example: If internal capacity is 16 and load factor is 0.75 then, number of buckets will automatically get 
increased when the table has 12 elements in it.

Effect on performance:
Load factor and initial capacity are two main factors that affect the performance of HashSet operations. 
Load factor of 0.75 provides very effective performance as respect to time and space complexity. 
If we increase the load factor value more than that then memory overhead will be reduced (because it will 
decrease internal rebuilding operation) but, it will affect the add and search operation in hashtable. 
To reduce the rehashing operation we should choose initial capacity wisely. If initial capacity is greater 
than the maximum number of entries divided by the load factor, no rehash operation will ever occur.

NOTE: The implementation in a HashSet is not synchronized, in the sense that if multiple threads access a 
hash set concurrently, and at least one of the threads modifies the set, it must be synchronized externally. 
This is typically accomplished by synchronizing on some object that naturally encapsulates the set. If no such
object exists, the set should be “wrapped” using the Collections.synchronizedSet method. This is best done at
creation time, to prevent accidental unsynchronized access to the set as shown below:

Set s = Collections.synchronizedSet(new HashSet(...));
Constructors in HashSet:

HashSet h = new HashSet();
Default initial capacity is 16 and default load factor is 0.75.
HashSet h = new HashSet(int initialCapacity);
default loadFactor of 0.75
HashSet h = new HashSet(int initialCapacity, float loadFactor);
HashSet h = new HashSet(Collection C);
Below program illustrates few basic operations of HashSet:
 */
public class HashSetDemo {
	public static void main(String[]args) 
    { 
        Set<String> h = new HashSet<String>(); 
  
        // Adding elements into HashSet usind add() 
        h.add("India"); 
        h.add("Australia"); 
        h.add("South Africa"); 
        h.add("India");// adding duplicate elements 
  
        // Displaying the HashSet 
        System.out.println(h); 
        System.out.println("List contains India or not:" + 
                           h.contains("India")); 
  
        // Removing items from HashSet using remove() 
        h.remove("Australia"); 
        System.out.println("List after removing Australia:"+h); 
  
        // Iterating over hash set items 
        System.out.println("Iterating over list:"); 
        Iterator<String> i = h.iterator(); 
        while (i.hasNext()) 
            System.out.println(i.next()); 
    } 
}
