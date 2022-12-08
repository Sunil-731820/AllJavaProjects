package com.java.jsf.CollectionsInJava.List.LinkedList;

public class LinkedListDefinition {
	
	/**
	 * Java LinkedList class uses a doubly linked list to store the elements. 
	 * It provides a linked-list data structure. It inherits the AbstractList class and 
	 * implements List and Deque interfaces.
	 * 
	 * The important points about Java LinkedList are:

		Java LinkedList class can contain duplicate elements.
		Java LinkedList class maintains insertion order.
		Java LinkedList class is non synchronized.
		In Java LinkedList class, manipulation is fast because no shifting needs to occur.
		Java LinkedList class can be used as a list, stack or queue.
		
		
		Doubly Linked List
			In the case of a doubly linked list, we can add or remove elements from both sides
			
			
			Points to Remember
The following are some important points to remember regarding an ArrayList and LinkedList.

When the rate of addition or removal rate is more than the read scenarios, then go for the LinkedList. On the other hand, when the frequency of the read scenarios is more than the addition or removal rate, then ArrayList takes precedence over LinkedList.
Since the elements of an ArrayList are stored more compact as compared to a LinkedList; therefore, the ArrayList is more cache-friendly as compared to the LinkedList. Thus, chances for the cache miss are less in an ArrayList as compared to a LinkedList. Generally, it is considered that a LinkedList is poor in cache-locality.
Memory overhead in the LinkedList is more as compared to the ArrayList. It is because, in a LinkedList, we have two extra links (next and previous) as it is required to store the address of the previous and the next nodes, and these links consume extra space. Such links are not present in an ArrayList.
	 */

}
