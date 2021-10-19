package com.javalive;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

/**
 * @author JavaLive.com
 * @description ArrayDeque in Java provides a way to apply resizable-array in
 *              addition to the implementation of the Deque interface. It is
 *              also known as Array Double Ended Queue or Array Deck. This is a
 *              special kind of array that grows and allows users to add or
 *              remove an element from both the sides of the queue. Few
 *              important features of ArrayDeque are as follows:
 * 
 *              Array deques have no capacity restrictions and they grow as
 *              necessary to support usage. They are not thread-safe which means
 *              that in the absence of external synchronization, ArrayDeque does
 *              not support concurrent access by multiple threads. Null elements
 *              are prohibited in the ArrayDeque. ArrayDeque class is likely to
 *              be faster than Stack when used as a stack. ArrayDeque class is
 *              likely to be faster than LinkedList when used as a queue.
 *              Declaration:
 * 
 *              public class ArrayDeque Element extends AbstractCollection
 *              implements DequeElement, Cloneable, Serializable Here, Element
 *              refers to the element which can refer to any class, such as
 *              Integer or String class.
 * 
 *              Constructors in ArrayDeque: ArrayDeque(): Used to create an
 *              empty ArrayDeque and by default holds an initial capacity to
 *              hold 16 elements.
 * 
 *              ArrayDeque(Collection c): Used to create an ArrayDeque
 *              containing all the elements same as that of the specified
 *              collection.
 * 
 *              ArrayDeque(int numofElements): Used to create an empty
 *              ArrayDeque and holds the capacity to contain a specified number
 *              of elements.
 * 
 *              Example:
 */
public class ArrayDequeDemo {
	public static void main(String[] args) {
		// Intializing an deque
		Deque<Integer> de_que = new ArrayDeque<Integer>(10);

		// add() method to insert
		de_que.add(10);
		de_que.add(20);
		de_que.add(30);
		de_que.add(40);
		de_que.add(50);
		for (Integer element : de_que) {
			System.out.println("Element : " + element);
		}

		System.out.println("Using clear() ");

		// clear() method
		de_que.clear();

		// addFirst() method to insert at start
		de_que.addFirst(564);
		de_que.addFirst(291);

		// addLast() method to insert at end
		de_que.addLast(24);
		de_que.addLast(14);

		System.out.println("Above elements are removed now");

		// Iterator() :
		System.out.println("Elements of deque using Iterator :");
		for (Iterator itr = de_que.iterator(); itr.hasNext();) {
			System.out.println(itr.next());
		}

		// descendingIterator() : to reverse the deque order
		System.out.println("Elements of deque in reverse order :");
		for (Iterator dItr = de_que.descendingIterator(); dItr.hasNext();) {
			System.out.println(dItr.next());
		}

		// element() method : to get Head element
		System.out.println("\nHead Element using element(): " + de_que.element());

		// getFirst() method : to get Head element
		System.out.println("Head Element using getFirst(): " + de_que.getFirst());

		// getLast() method : to get last element
		System.out.println("Last Element using getLast(): " + de_que.getLast());

		// toArray() method :
		Object[] arr = de_que.toArray();
		System.out.println("\nArray Size : " + arr.length);

		System.out.print("Array elements : ");
		for (int i = 0; i < arr.length; i++)
			System.out.print(" " + arr[i]);

		// peek() method : to get head
		System.out.println("\nHead element : " + de_que.peek());

		// poll() method : to get head
		System.out.println("Head element poll : " + de_que.poll());

		// push() method :
		de_que.push(265);
		de_que.push(984);
		de_que.push(2365);

		// remove() method : to get head
		System.out.println("Head element remove : " + de_que.remove());

		System.out.println("The final array is: " + de_que);
	}
}
