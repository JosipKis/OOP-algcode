package vjezba5Zad5;

public class Node<E> {

			private E element;
			private Node<E> next;

			public Node(E el, Node<E> next){
				element = el;
				this.next = next;
			}

			public E getElement() {return element;}
			public Node<E> getNext() {return next;}
			public void setNext(Node<E> nd) {
				next = nd;
			}
}