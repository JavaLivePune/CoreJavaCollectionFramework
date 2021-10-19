package com.javalive;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * @author JavaLive.com
 * @description CopyOnWriteArrayList: CopyOnWriteArrayList class is introduced
 *              in JDK 1.5, which implements List interface. It is enhanced
 *              version of ArrayList in which all modifications (add, set,
 *              remove, etc) are implemented by making a fresh copy. Here are
 *              few points about CopyOnWriteArrayList:
 * 
 * 
 * 
 *              As the name indicates, CopyOnWriteArrayList creates a Cloned
 *              copy of underlying ArrayList, for every update operation at
 *              certain point both will be synchronized automatically ,which is
 *              taken care by JVM. Therefore there is no effect for threads
 *              which are performing read operation. It is costly to use because
 *              for every update operation a cloned copy will be created. Hence
 *              CopyOnWriteArrayList is the best choice if our frequent
 *              operation is read operation. It extends object and implements
 *              Serializable, Cloneable, Iterable<E>, Collection<E>, List<E> and
 *              RandomAccess The underlined data structure is grow-able array.
 *              It is thread-safe version of ArrayList. Insertion is preserved,
 *              duplicates are allowed and heterogeneous Objects are allowed.
 *              The main important point about CopyOnWriteArrayList is Iterator
 *              of CopyOnWriteArrayList can not perform remove operation
 *              otherwise we get Run-time exception saying
 *              UnsupportedOperationException. Constructors Summary:
 * 
 *              CopyOnWriteArrayList c = new CopyOnWriteArrayList(); :Creates an
 *              empty list. CopyOnWriteArrayList c = new
 *              CopyOnWriteArrayList(Collection obj);:Creates a list containing
 *              the elements of the specified collection, in the order they are
 *              returned by the collection’s iterator. CopyOnWriteArrayList c =
 *              new CopyOnWriteArrayList(Object[] obj);:Creates a list holding a
 *              copy of the given array.
 *
 */
public class CopyOnWriteArrayListDemo extends Thread{
	static CopyOnWriteArrayList l = new CopyOnWriteArrayList(); 
	  
    public void run() 
    { 
        // Child thread trying to 
        // add new element in the 
        // Collection object 
        l.add("D"); 
    } 
  
    public static void main(String[] args) 
        throws InterruptedException 
    { 
        l.add("A"); 
        l.add("B"); 
        l.add("c"); 
  
        // We create a child thread 
        // that is going to modify 
        // ArrayList l. 
        CopyOnWriteArrayListDemo t = new CopyOnWriteArrayListDemo(); 
        t.run(); 
  
        Thread.sleep(1000); 
  
        // Now we iterate through 
        // the ArrayList and get 
        // exception. 
        Iterator itr = l.iterator(); 
        while (itr.hasNext()) { 
            String s = (String)itr.next(); 
            System.out.println(s); 
            Thread.sleep(1000); 
        } 
        System.out.println(l); 
    } 
}
