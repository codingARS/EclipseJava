package deque;


public class MyDeque<E> { //making our own list using deque
	
	Node<E> head, tail;
	
	 public void addToHead(E data) {
		 Node<E> toAdd = new Node<>(data);
		  
		 if(head == null) {  //If list was already empty
			 head = tail = toAdd;
			 return;
		 }
		 head.next=toAdd;  //If list already has some data
		 toAdd.prev=head;
		 head=toAdd;
	 }
	 
	 public void addToLast(E data) {
		 Node<E> toAdd = new Node<>(data);
		 
		 if(head==null) { //if list was already empty
			 head = tail = toAdd;
			 return;
		 }  
		 tail.prev = toAdd; //if list already has some data
		 toAdd.next = tail;
		 tail = toAdd;
	 }
	 
	 
	 public E removeFirst() {
		 if(head==null) {  //if list was already empty
			 return null;
		 }
		 Node<E> toRemove=head;  //if list already has some data
		 head = head.prev;
		 head.next = null;
		 
		 if(tail==null) {  //if list had only one element
			 head=null; 
		 }
		 return toRemove.data;
	 }
	 
	 public E removeLast() {
		 if(head==null) {  //if list was already empty
			 return null;
		 }
		 Node<E> toRemove=tail; //If list already has some data
		 tail = tail.next;
		 tail.prev = null;
		 
		 if(tail==null) {  //If list had only one element(that's deleted now)
			 head = null;
		 }
		 
		 return toRemove.data;
	 }
	
	public static class Node<E> { //doubly ended node, has reference of both next & previous
		E data;
		Node<E> next, prev;
		
		public Node(E data) {
			this.data = data;
			this.next = this.prev = null;
		}	
	}
}
