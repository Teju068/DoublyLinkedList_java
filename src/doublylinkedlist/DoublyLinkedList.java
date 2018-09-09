package doublylinkedlist;

import static doublylinkedlist.Utils.println;
import static doublylinkedlist.Utils.printrn;

public class DoublyLinkedList {

	int data;
	Node headNode;
	Node tailNode;
	int size = 0;

	/**
	 * constructor
	 */
	public DoublyLinkedList() {

	}

	/**
	 * 
	 * @param data insert data at the end of list
	 */
	public void insertAtEnd(int data) {
		Node node = new Node(data,null,null);
		Node ptr;
		if(headNode == null && tailNode == null) {
			headNode = node;
			tailNode = node;
		}else
		{
			ptr = headNode;
			while(ptr.getNext() != null) {
				ptr = ptr.getNext();
			}
			ptr.setNext(node);
			node.setPrev(ptr);
			tailNode = ptr;
		}
	}

	/**
	 * 
	 * @param data insert data at the beginning of the list
	 */
	public void insertAtFirst(int data) {
		Node node = new Node(data,null,null);
		if(headNode == null && tailNode == null) {
			headNode = node;
			tailNode = node;
		}else {
			headNode.setPrev(node);
			node.setNext(headNode);
			headNode = node;
		}
	}

	/**
	 * 
	 * @param data to be inserted
	 * @param position position at which, it has to be inserted
	 */
	public void insertAtPosition(int data, int position) {
		int nCounter = 0;
		Node ptr;
		Node node = new Node(data,null,null);
		if(headNode.getNext() == null && tailNode.getNext() == null)
		{
			headNode = node;
			tailNode = node;
		}else {
			ptr = headNode;
			while(ptr != null) {
				nCounter++;
				if(nCounter == position-1) {
					node.setNext(ptr.getNext());
					node.setPrev(ptr);
					ptr.setNext(node);
					break;
				}
				ptr = ptr.getNext();
			}
		}
	}

	/**
	 *  remote data from end
	 */
	public void removeFromEnd() {
		//TODO:
	}

	/**
	 * remove data from beginning
	 */
	public void removeFromFirst() {
		//TODO:
	}

	/**
	 * 
	 * @param data remove specific data from the list
	 */
	public void removeData(int data) {
		Node ptr;
		ptr = headNode;
		while(ptr != null) {
			if(ptr.getData() == data) {
				if(ptr.getPrev() != null) {
					ptr.getPrev().setNext(ptr.getNext());
					ptr.getNext().setPrev(ptr.getPrev());
				}else {
					ptr = ptr.getNext();
					headNode = ptr;
				}
			}
			ptr = ptr.getNext();
		}
	}
	
	/**
	 * print the list
	 */
	public void traverse() {
		Node ptr;
		ptr = headNode;
		println("****************************************************************");
		printrn("| ");
		while(ptr != null) {
			printrn(ptr.getData()+" ");
			ptr = ptr.getNext();
			printrn("| ");
		}
		println("");
		println("****************************************************************");
	}
	
	/**
	 * 
	 * @return length of the list
	 */
	public int length() {
		return size;
	}
}
