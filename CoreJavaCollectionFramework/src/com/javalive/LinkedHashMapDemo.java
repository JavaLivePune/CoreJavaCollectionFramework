package com.javalive;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @author JavaLive.com
 * @description LinkedHashMap is just like HashMap with an additional feature of maintaining an order of elements
 *  inserted into it. HashMap provided the advantage of quick insertion, search and deletion but it never 
 *  maintained the track and order of insertion which the LinkedHashMap provides where the elements can be 
 *  accessed in their insertion order. Few important features of LinkedHashMap are as follows:

A LinkedHashMap contains values based on the key. It implements the Map interface and extends HashMap class.
It contains only unique elements (See this for details)..
It may have one null key and multiple null values (See this for details).
It is same as HashMap with additional feature that it maintains insertion order. For example, when we ran the 
code with HashMap, we got different order of elements (See this).

Declaration:

LinkedHashMap<Integer, String> lhm = new LinkedHashMap<Integer, String>();
Constructors in LinkedHashMap:
The LinkedHashMap accepts five types of constructors:
1. LinkedHashMap(): This is used to construct a default LinkedHashMap constuctor.
2. LinkedHashMap(int capacity): It is used to initialize a particular LinkedHashMap with a specified capacity.
3. LinkedHashMap(Map m_a_p): It is used to initialize a particular LinkedHashMap with the elements of the specified map.
4. LinkedHashMap(int capacity, float fillRatio): It is used to initialize both the capacity and fill ratio for a LinkedHashMap.
5. LinkedHashMap(int capacity, float fillRatio, boolean Order): This constructor is also used to initialize both the capacity 
   and fill ratio for a LinkedHashMap along with whether to follow the insertion order or not.
True is passed for last access order.
False is passed for insertion order.
Basic Operations of LinkedHashMap class:
 */
public class LinkedHashMapDemo {
	 public static void main(String a[]) 
	    { 
	        Map<String, String> lhm = 
	                       new LinkedHashMap<String, String>(); 
	        lhm.put("one", "practice.javalive.com"); 
	        lhm.put("two", "code.javalive.com"); 
	        lhm.put("four", "quiz.javalive.com"); 
	  
	        // It prints the elements in same order  
	        // as they were inserted     
	        System.out.println(lhm); 
	  
	        System.out.println("Getting value for key 'one': " 
	                                       + lhm.get("one")); 
	        System.out.println("Size of the map: " + lhm.size()); 
	        System.out.println("Is map empty? " + lhm.isEmpty()); 
	        System.out.println("Contains key 'two'? "+  
	                                  lhm.containsKey("two")); 
	        System.out.println("Contains value 'practice."
	        +"javalive.com'? "+ lhm.containsValue("practice"+ 
	        ".javalive.com")); 
	        System.out.println("delete element 'one': " +  
	                           lhm.remove("one")); 
	        System.out.println(lhm); 
	    } 
}
