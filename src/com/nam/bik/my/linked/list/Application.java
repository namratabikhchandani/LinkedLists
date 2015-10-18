package com.nam.bik.my.linked.list;

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
	}

}
