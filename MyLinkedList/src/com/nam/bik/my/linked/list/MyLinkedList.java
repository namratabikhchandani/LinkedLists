package com.nam.bik.my.linked.list;

/**
 * This class defines a LinkedList using the following members:
 * 1. head of linked list
 * 2. tail of linked list
 * 3. size of linked list at any point
 * It supports various operation on the LinkedList
 * @author namrata.bikhchandani
 *
 */
public class MyLinkedList<T extends Comparable<T>> {
	private LinkedListNode<T> head;
	private LinkedListNode<T> tail;
	private int size;
	
	public MyLinkedList(){
		this.head=null;
		this.tail=null;
		this.size=0;
	}

	public LinkedListNode<T> getHead() {
		return head;
	}

	public void setHead(LinkedListNode<T> head) {
		this.head = head;
	}

	public LinkedListNode<T> getTail() {
		return tail;
	}

	public void setTail(LinkedListNode<T> tail) {
		this.tail = tail;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}
	
	public boolean insertFront(T data){
		if(data==null){
			System.out.println("Node data cannot be null");
			return false;
		}
		if(this.head == null){
			head = new LinkedListNode<T>(data);
			tail = head;
		}
		else{
			LinkedListNode<T> newNode = new LinkedListNode<T>(data);
			newNode.setNext(head);
			head=newNode;
		}
		return true;
	}
	
	public boolean insertEnd(T data){
		if(data == null){
			System.out.println("Node data cannot be null");
			return false;
		}
		if(head==null){
			head = new LinkedListNode<T>(data);
			tail = head;
			return true;
		}
		LinkedListNode<T> newNode = new LinkedListNode<T>(data);
		tail.setNext(newNode);
		if(head==tail){
			tail=newNode;
			head.setNext(tail);
		}
		return true;
	}
	
	//This function inserts a new node with data=data after the node specified.
	// returns false if node is not found within LL
	public boolean insertMid(T data, T nodeData){
		if(data==null)
			return false;
		LinkedListNode<T> node = getNode(nodeData);
		if (node != null){
			LinkedListNode<T> nodeNext = node.getNext();
			LinkedListNode<T> newNode = new LinkedListNode<T>(data);
			node.setNext(newNode);
			newNode.setNext(nodeNext);
			//update tail if node was last node in LL
			if(tail==node){
				tail=newNode;
			}
			return true;
		}	
		return false;
	}
	
	public void removeFront(){
		if(head != null){
			
		}
	}
	
	public void removeEnd() {	
	}
	
	public boolean removeNode(LinkedListNode<T> node){
		return true;
	}
	
	public void print(){
		if(head!=null){
			System.out.print(head.getData());
			LinkedListNode<T> current = head.getNext();
			while(current!=null){
				System.out.print("->" + current.getData());
				current=current.getNext();
			}
			System.out.println();
		}
	}
	
	private boolean find(T nodeData){
		if(head != null){
			LinkedListNode<T> current = head;
			while (current!=null) {
				if(current.getData().compareTo(nodeData)==0){
					return true;
				}
				current=current.getNext();
			}
		}
		return false;
	}
	
	private LinkedListNode<T> getNode(T nodeData){
		if(head != null){
			LinkedListNode<T> current = head;
			while (current!=null) {
				if(current.getData().compareTo(nodeData)==0){
					return current;
				}
				current=current.getNext();
			}
		}
		return null;
	}
}
