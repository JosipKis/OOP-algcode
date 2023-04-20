package pckg_cll;

import packsll.Node;
import packsll.SLL;

public class CLL<E> implements SLL<E> {

	private Node<E> tail;
	private int size;
	
	public CLL() {
		this.tail = null;
		this.size = 0;
		System.out.println("Created an empty list!");
	}
	@Override
	public int size() {
		return size;
	}
	@Override
	public boolean isEmpty() {
		return size == 0;
	}
	@Override
	public void addFirst(E element) {
		if (isEmpty()) {
			System.out.println("Adding at first position in clist!");
			tail = new Node<>(element, null);
			tail.setNext(tail);
		}else {
			Node node1 = new Node<E>(element, tail.getNext());
			tail.setNext(node1);
		}
		size++;
	}
	@Override
	public void addLast(E element) {
		if (isEmpty()) {
			System.out.println("Adding at last position in clist");
			tail = new Node<>(element, null);
			tail.setNext(tail);
			size++;
		}else {
			addFirst(element);
			System.out.println("Adding at first position in clist!");
			System.out.println("Using addFirst to implement addLast!");
			tail = tail.getNext();
		}
	}
	@Override
	public E removeFirst() {
		E element = null;
		if (isEmpty()) {
			System.out.println("List is empty!");
		}else {
			Node<E> fst = tail.getNext();
			tail.setNext(fst.getNext());
			fst.setNext(null);
			element = fst.getElement();
			System.out.println("Removing the first element!");
			size--;
		}
		return element;
	}
	@Override
	public E removeLast() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public boolean containsElement(E element) {
		boolean inClist = false;
		/*
		 * Probaj bez for petlje...
		 */
		if (isEmpty()) {
			System.out.println("List is empty - nothing to search for!");
		}else {
			for (int k = 0; k < size; k++) {
				if (tail.getElement().equals(element)) {
					System.out.println("Element is in the list!");
					inClist = true;
					break;
				}else {
					rotate();
				}
			}
		}
		return inClist;
	}
	@Override
	public void insertAtPosition(E element, int position) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public String toString() {
		return "CLL [tail=" + tail.getElement() + ", size=" + size + "]";
	}
	/*
	 *  Method that rotates tail in one direction
	 */
	public void rotate() {
		if (isEmpty()) {
			System.out.println("List is empty!");
		}else {
			tail = tail.getNext();
			System.out.println("Rotating for one step!");
		}
	}
	
	

}
