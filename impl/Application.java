package com.nam.bik.linked.list.impl;

public class Application {

	public static void main(String[] args) {
		MyLinkedList<Integer> llist = new MyLinkedList<>();
		llist.insertFront(1);
		llist.insertEnd(2);
		llist.insertFront(0);
		llist.print();
		
		llist.insertMid(4, 1);
		System.out.println("After insert mid (4) after (1)");
		llist.print();
		
		llist.removeFront();
		System.out.println("After Deleting front");
		llist.print();
		
		llist.removeEnd();
		System.out.println("After deleting end");
		llist.print();
		
		
		llist.removeNode(new LinkedListNode<Integer>(4));
		System.out.println("After deleting Node 4");
		llist.print();
	}

}