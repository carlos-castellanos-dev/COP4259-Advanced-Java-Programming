package util;

public class SinglyLinkedList<E> {
    public Node<E> head;
    //constructor #1
    public SinglyLinkedList() {
	this.head = null;//creates an empty linked list!
    }
    //constructor #2
    public SinglyLinkedList(Node<E> head) {
	this.head = head;//creates a linked list with a given head!
    }
    @Override
    public String toString() {
	if (head == null)// base case
	    return "";
	String result = head + "";
	if (head.next != null)
	    result += " -> ";
	SinglyLinkedList<E> rest = new SinglyLinkedList<E>(head.next);

	return result + rest.toString();
    }
    // size method
    public int size(){

    	  return getCount(this.head);
    	} 
    // getCount method
    public int getCount(Node<E> head){
    	  if(head == null){
    	     return  0;
    	  }

    	  return 1 + getCount(head.next);
    	}

}

