package com.nam.bik.linked.list.impl;

public class LinkedListNode<T extends Comparable<T>> 
			implements Comparable<LinkedListNode<T>> {
	
	private T data;
	private LinkedListNode<T> next;
	
	//disabling default constructor. 
	public LinkedListNode(T data) {
		this.data = data;
		this.next = null;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	public LinkedListNode<T> getNext() {
		return next;
	}

	public void setNext(LinkedListNode<T> next) {
		this.next = next;
	}

	@Override
	public int compareTo(LinkedListNode<T> o) {
		if(o == null)
			throw new NullPointerException("Cannot compare with Null");
		if(o==this || this.data.compareTo((T) o.data)==0)
			return 0;
		if(this.data.compareTo((T) o.data)>1)
			return 1;
		return -1;
	}
	
}
