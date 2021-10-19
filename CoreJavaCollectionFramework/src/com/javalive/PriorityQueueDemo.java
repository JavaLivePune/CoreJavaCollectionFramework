package com.javalive;

import java.util.Iterator;
import java.util.PriorityQueue;

/**
 * @author JavaLive.com
 * @description A PriorityQueue is used when the objects are supposed to be
 *              processed based on the priority. It is known that a queue
 *              follows First-In-First-Out algorithm, but sometimes the elements
 *              of the queue are needed to be processed according to the
 *              priority, that’s when the PriorityQueue comes into play. The
 *              PriorityQueue is based on the priority heap. The elements of the
 *              priority queue are ordered according to the natural ordering, or
 *              by a Comparator provided at queue construction time, depending
 *              on which constructor is used.
 * 
 *              In the below priority queue, element with maximum ASCII value
 *              will have the highest priority.
 * 
 *              Few important points on Priority Queue are as follows:
 * 
 *              PriorityQueue doesn’t permit null. We can’t create PriorityQueue
 *              of Objects that are non-comparable PriorityQueue are unbound
 *              queues. The head of this queue is the least element with respect
 *              to the specified ordering. If multiple elements are tied for
 *              least value, the head is one of those elements — ties are broken
 *              arbitrarily. The queue retrieval operations poll, remove, peek,
 *              and element access the element at the head of the queue. It
 *              inherits methods from AbstractQueue, AbstractCollection,
 *              Collection and Object class. Constructors of PriorityQueue class
 * 
 *              PriorityQueue(): Creates a PriorityQueue with the default
 *              initial capacity (11) that orders its elements according to
 *              their natural ordering. PriorityQueue(Collection<E> c): Creates
 *              a PriorityQueue containing the elements in the specified
 *              collection. PriorityQueue(int initialCapacity): Creates a
 *              PriorityQueue with the specified initial capacity that orders
 *              its elements according to their natural ordering.
 *              PriorityQueue(int initialCapacity, Comparator<E> comparator):
 *              Creates a PriorityQueue with the specified initial capacity that
 *              orders its elements according to the specified comparator.
 *              PriorityQueue(PriorityQueue<E> c): Creates a PriorityQueue
 *              containing the elements in the specified priority queue.
 *              PriorityQueue(SortedSet<E> c): Creates a PriorityQueue
 *              containing the elements in the specified sorted set. Basic
 *              Operations on PriorityQueue:
 * 
 *              boolean add(E element): This method inserts the specified
 *              element into this priority queue. public peek(): This method
 *              retrieves, but does not remove, the head of this queue, or
 *              returns null if this queue is empty. public poll(): This method
 *              retrieves and removes the head of this queue, or returns null if
 *              this queue is empty.
 * 
 *              Below program illustrates the basic operations of PriorityQueue:
 *
 */
public class PriorityQueueDemo {
	public static void main(String args[]) {
		// Creating empty priority queue
		PriorityQueue<String> pQueue = new PriorityQueue<String>();

		// Adding items to the pQueue using add()
		pQueue.add("C");
		pQueue.add("C++");
		pQueue.add("Java");
		pQueue.add("Python");

		// Printing the most priority element
		System.out.println("Head value using peek function:" + pQueue.peek());

		// Printing all elements
		System.out.println("The queue elements:");
		Iterator itr = pQueue.iterator();
		while (itr.hasNext())
			System.out.println(itr.next());

		// Removing the top priority element (or head) and
		// printing the modified pQueue using poll()
		pQueue.poll();
		System.out.println("After removing an element" + "with poll function:");
		Iterator<String> itr2 = pQueue.iterator();
		while (itr2.hasNext())
			System.out.println(itr2.next());

		// Removing Java using remove()
		pQueue.remove("Java");
		System.out.println("after removing Java with" + " remove function:");
		Iterator<String> itr3 = pQueue.iterator();
		while (itr3.hasNext())
			System.out.println(itr3.next());

		// Check if an element is present using contains()
		boolean b = pQueue.contains("C");
		System.out.println("Priority queue contains C " + "or not?: " + b);

		// Getting objects from the queue using toArray()
		// in an array and print the array
		Object[] arr = pQueue.toArray();
		System.out.println("Value in array: ");
		for (int i = 0; i < arr.length; i++)
			System.out.println("Value: " + arr[i].toString());
	}
}
