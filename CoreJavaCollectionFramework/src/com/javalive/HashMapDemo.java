package com.javalive;

import java.util.HashMap;
import java.util.Map;

/**
 * @author JavaLive.com
 * @description HashMap is a part of Java?s collection since Java 1.2. It provides the basic implementation of 
 * the Map interface of Java. It stores the data in (Key, Value) pairs. To access a value one must know its key. 
 * HashMap is known as HashMap because it uses a technique called Hashing. Hashing is a technique of converting 
 * a large String to small String that represents the same String. A shorter value helps in indexing and faster 
 * searches. HashSet also uses HashMap internally. It internally uses a link list to store key-value pairs already 
 * explained in HashSet in detail and further articles.
Few important features of HashMap are:

HashMap is a part of java.util package.
HashMap extends an abstract class AbstractMap which also provides an incomplete implementation of Map interface.
It also implements Cloneable and Serializable interface. K and V in the above definition represent Key and Value 
respectively.
HashMap doesn?t allow duplicate keys but allows duplicate values. That means A single key can?t contain more 
than 1 value but more than 1 key can contain a single value.
HashMap allows null key also but only once and multiple null values.
This class makes no guarantees as to the order of the map; in particular, it does not guarantee that the order 
will remain constant over time. It is roughly similar to HashTable but is unsynchronized.
Internal Structure of HashMap

Internally HashMap contains an array of Node and a node is represented as a class which contains 4 fields:



int hash
K key
V value
Node next
It can be seen that node is containing a reference of its own object. So it?s a linked list.
HashMap:
array

Node:
node_hash_map

Performance of HashMap

Performance of HashMap depends on 2 parameters:

Initial Capacity
Load Factor
As already said, Capacity is simply the number of buckets whereas the Initial Capacity is the capacity of 
HashMap instance when it is created. The Load Factor is a measure that when rehashing should be done. 
Rehashing is a process of increasing the capacity. In HashMap capacity is multiplied by 2. 
Load Factor is also a measure that what fraction of the HashMap is allowed to fill before rehashing. 
When the number of entries in HashMap increases the product of current capacity and load factor the 
capacity is increased that is rehashing is done. If the initial capacity is kept higher then rehashing 
will never be done. But by keeping it higher it increases the time complexity of iteration. So it should 
be chosen very cleverly to increase performance. The expected number of values should be taken into account 
to set initial capacity. Most generally preferred load factor value is 0.75 which provides a good deal between 
time and space costs. Load factor?s value varies between 0 and 1.

Synchronized HashMap

As it is told that HashMap is unsynchronized i.e. multiple threads can access it simultaneously. 
If multiple threads access this class simultaneously and at least one thread manipulates it structurally 
then it is necessary to make it synchronized externally. It is done by synchronizing some object which 
encapsulates the map. If No such object exists then it can be wrapped around Collections.synchronizedMap() 
to make HashMap synchronized and avoid accidental unsynchronized access. As in the following example:

Map m = Collections.synchronizedMap(new HashMap(...));
Now the Map m is synchronized.

Iterators of this class are fail-fast if any structure modification is done after the creation of iterator, 
in any way except through the iterator?s remove method. In a failure of iterator, it will 
throw ConcurrentModificationException.

Constructors in HashMap



HashMap provides 4 constructors and access modifier of each is public:

HashMap(): It is the default constructor which creates an instance of HashMap with initial capacity 16 and load factor 0.75.
HashMap(int initial capacity): It creates a HashMap instance with specified initial capacity and load factor 0.75.
HashMap(int initial capacity, float loadFactor): It creates a HashMap instance with specified initial capacity and specified load factor.
HashMap(Map map): It creates instance of HashMap with same mappings as specified map.

Time complexity of HashMap

HashMap provides constant time complexity for basic operations, get and put if the hash function is properly 
written and it disperses the elements properly among the buckets. Iteration over HashMap depends on the 
capacity of HashMap and a number of key-value pairs. Basically, it is directly proportional to 
the capacity + size. Capacity is the number of buckets in HashMap. So it is not a good idea to keep a
high number of buckets in HashMap initially.
 *
 */
public class HashMapDemo {
	public static void main(String[] args) 
    { 
  
        Map<String, Integer> map 
            = new HashMap<>();
        
        
        System.out.println(map.toString());
        map.put("vishal", 10); 
        map.put("sachin", 30); 
        map.put("vaibhav", 20); 
  
        System.out.println("Size of map is:- "
                           + map.size()); 
  
        System.out.println(map.toString());
        if (map.containsKey("vishal")) { 
            Integer a = map.get("vishal"); 
            System.out.println("value for key"
                               + " \"vishal\" is:- "
                               + a); 
        } 
  
        map.clear(); 
        System.out.println(map.toString()); 
    } 
  
    public static void print(Map<String, Integer> map) 
    { 
        if (map.isEmpty()) { 
            System.out.println("map is empty"); 
        } 
  
        else { 
            System.out.println(map); 
        } 
    } 
}
