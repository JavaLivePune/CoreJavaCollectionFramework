package com.javalive;

import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;

/**
 * @author JavaLive.com
 * @description The java.util.Deque interface is a subtype of the
 *              java.util.Queue interface. The Deque is related to the
 *              double-ended queue that supports addition or removal of elements
 *              from either end of the data structure, it can be used as a queue
 *              (first-in-first-out/FIFO) or as a stack
 *              (last-in-first-out/LIFO). These are faster than Stack and
 *              LinkedList.
 * 
 *              Few important features of Deque are:
 * 
 *              It provides the support of resizable array and helps in
 *              restriction-free capacity, so to grow the array according to the
 *              usage. Array deques prohibit the use of Null elements and do not
 *              accept any such elements. Any concurrent access by multiple
 *              threads is not supported. In the absence of external
 *              synchronization, Deque is not thread-safe.
 *
 */
public class DequeDemo {
	public static void main(String[] args) {
		Deque<String> deque = new LinkedList<String>();

		// We can add elements to the queue in various ways
		deque.add("Element 1 (Tail)"); // add to tail
		deque.addFirst("Element 2 (Head)");
		deque.addLast("Element 3 (Tail)");
		deque.push("Element 4 (Head)"); // add to head
		deque.offer("Element 5 (Tail)");
		deque.offerFirst("Element 6 (Head)");
		deque.offerLast("Element 7 (Tail)");

		System.out.println(deque + "\n");

		// Iterate through the queue elements.
		System.out.println("Standard Iterator");
		Iterator iterator = deque.iterator();
		while (iterator.hasNext())
			System.out.println("\t" + iterator.next());

		// Reverse order iterator
		Iterator reverse = deque.descendingIterator();
		System.out.println("Reverse Iterator");
		while (reverse.hasNext())
			System.out.println("\t" + reverse.next());

		// Peek returns the head, without deleting
		// it from the deque
		System.out.println("Peek " + deque.peek());
		System.out.println("After peek: " + deque);

		// Pop returns the head, and removes it from
		// the deque
		System.out.println("Pop " + deque.pop());
		System.out.println("After pop: " + deque);

		// We can check if a specific element exists
		// in the deque
		System.out.println("Contains element 3: " + deque.contains("Element 3 (Tail)"));

		// We can remove the first / last element.
		deque.removeFirst();
		deque.removeLast();
		System.out.println("Deque after removing " + "first and last: " + deque);

	}
}
