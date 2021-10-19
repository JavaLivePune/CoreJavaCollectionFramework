package com.javalive.advanceCollettionConcepts;

import java.util.HashMap;
import java.util.Scanner;

/**
 * @author JavaLive.com
 * @description Find The First Non Repeated Character In A String : Technical
 *              Interview Question In written exams or in technical interview of
 *              Amazon , you can easily find this question . So in order to help
 *              you for the preparation of interview , we are answering this
 *              question.
 * 
 *              First we need to understand the question , we need to write an
 *              algorithm for the first non repeated character in a string , for
 *              example :
 * 
 *              If the word "stress" is input then it should print 't' as output
 *              .
 * 
 *              If the word "teeter" is input then it should print 'r' as output
 *              .
 * 
 *              Now , we should understand the pseudo algorithm or logic to
 *              achieve this task , code is given in the end of this post .
 * 
 *              Logic
 * 
 *              As we know a non repeated character occurs only once in the
 *              string , so if we store the number of times each alphabet
 *              appears in the string , it would help us identifying which
 *              characters are non repeated characters in the string .So we need
 *              to scan the whole string and determine the final counts of each
 *              character . Now scan the final values of each character in the
 *              string , the first character in the string with final count 1 is
 *              the first non repeated character in the string.
 * 
 *              Pseudo Algorithm
 * 
 *              1. First create the character count hash table .
 * 
 *              For each character If there is no value stored in the character
 *              set it to 1 . else increment the value of the character by 1 .
 * 
 *              2. Scan the string For each character return character if the
 *              count in hash table is 1 . If no character have count 1 , return
 *              null
 *
 */
public class FirstNonRepeated {
	public static void main(String[] args) {
		System.out.println(" Please enter the input string :");
		Scanner in = new Scanner(System.in);
		String s = in.nextLine();
		char c = firstNonRepeatedCharacter(s);
		System.out.println("The first non repeated character is :  " + c);
	}

	public static Character firstNonRepeatedCharacter(String str) {
		HashMap<Character, Integer> characterhashtable = new HashMap<Character, Integer>();
		int i, length;
		Character c;
		length = str.length(); // Scan string and build hash table
		for (i = 0; i < length; i++) {
			c = str.charAt(i);
			if (characterhashtable.containsKey(c)) {
				// increment count corresponding to c
				characterhashtable.put(c, characterhashtable.get(c) + 1);
			} else {
				characterhashtable.put(c, 1);
			}
		}
		// Search characterhashtable in in order of string str

		for (i = 0; i < length; i++) {
			c = str.charAt(i);
			if (characterhashtable.get(c) == 1)
				return c;
		}
		return null;
	}
}
