package vjezba5Zad5;

public class CircularlyLinkedList<E> implements Int_SLL<E>{

	private Node<E> tail = null;
	private int size = 0;

	public  CircularlyLinkedList() {
		System.out.println("Created empty circularly linked list....");
	}

	@Override
	public int size() {
		return size;
	}

	@Override
	public boolean isEmpty() {
		if(size == 0) {
			return true;
		} else {
			return false;
		}

	}

	@Override
	public E first() {
		if(isEmpty()) {
			return null;
		} else {
			return tail.getNext().getElement();
		}

	}

	@Override
	public E last() {
		if(isEmpty()) {
			return null;
		} else {
			return tail.getElement();
		}
	}

	@Override
	public void addFirst(E el) {
		if (isEmpty()) {
			tail = new Node<E>(el, null);
			tail.setNext(tail);
			size++;
		} else {
			Node<E> newNode = new Node<E>(el, tail.getNext());
			tail.setNext(newNode);
			size++;
		}

	}

	@Override
	public void addLast(E el) {
		addFirst(el);
		tail = tail.getNext();
	}

	public void addLastLonger(E el) {
		if(isEmpty()) {
			tail = new Node<E>(el, null);
			tail.setNext(tail);
		} else {
			Node<E> newNode = new Node<E>(el, tail.getNext());
			tail.setNext(newNode);
			tail = newNode;

		}
		size++;
	}

	public void rotate() {
		// rotate the first element to the back of the list
		if(isEmpty()) {
			tail = null;
		} else {
			tail = tail.getNext(); // old head becomes new tail
		}
	}

	@Override
	public void addElement(E partNode, E el) {
		// Samostalno realizirati za vježbu
	}

	@Override
	public E removeFirst() {
		if(isEmpty()) {
			return null;
		} else if (size == 1){
			// tail == head
			E element = tail.getElement();
			tail = null;
			size--;
			return element;
		} else {
			E element = tail.getNext().getElement();
			tail.setNext(tail.getNext().getNext());
			size--;
			return element;

		}
	}

	@Override
	public E removeLast() {
		if(isEmpty()) {
			return null;
		} else if(size == 1) {
			// tail == head
			E element = tail.getElement();
			tail = null;
			size--;
			return element;
		} else {
			E element = tail.getElement();
			tail = tail.getNext();
			size--;
			return element;
		}

	}

	@Override
	public boolean containsElement(E el) {
		boolean status = false;
		Node<E> fstTail = tail;
		Node<E> aux = tail.getNext();
		System.out.println(aux.equals(fstTail));
		while(!aux.equals(fstTail)) {
			if(el.equals(tail.getNext().getElement())) {
				System.out.println("Always TRUE!!!!");
				status = true;
				return status;
			} else {
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				rotate();
				aux = tail.getNext();
				if(aux.equals(fstTail)) {
					if(el.equals(aux.getElement())) {
						status = true;
					} else {
						status = false;
					}
				}
			}
		}

		return status;
	}

	public void listAll() {
		System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<< All from Circularly Linked List >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		System.out.println("Tail element -> " + tail.getElement());
		System.out.println("First element -> " + tail.getNext().getElement());
		System.out.println("Size -> " + size());
		System.out.println("************************************************************************************************");
		int cnt = 0;
		while(cnt < size()) {
			System.out.println(tail.getElement());
			rotate();
			cnt++;

		}
	}

}
