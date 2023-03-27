package util;

public class Node<E> {
	public E data;
	public Node<E> next;

	@Override
	public String toString() {
	    return data + "";
	}
	public Node(E data, Node<E> next) {
	    this.data = data;
	    this.next = next;
	}
	public Node(E data) {
	    this.data = data;
	    this.next = null;
	}
}


