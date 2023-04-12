package packsll;


public class SLL_Concrete<E> implements SLL<E> {

    private  Node<E> head;
    private Node<E> tail;
    private int size;

    public SLL_Concrete(){
        this.head = null;
        this.tail = null;
        this.size =0;
    }

    @Override
    public int size() {
        return this.size;
    }

    @Override
    public boolean isEmpty() {
        return this.size==0;
    }

    @Override
    public void addFirst(E element) {
        Node<E> newNode = new Node<>(element,head);
        this.head = newNode;
        if (this.isEmpty()){
            this.tail = this.head;
        }
        this.size++;
    }

    @Override
    public void addLast(E element) {
        if (isEmpty()){
            addFirst(element);
        }else {
            Node newNode = new Node<>(element,null);
            tail.setNext(newNode);
            tail = newNode;
        }
        this.size++;
    }

    @Override
    public String toString() {
        return "SLL_Concrete{" +
                "head=" + head +
                ", tail=" + tail +
                ", size=" + size +
                '}';
    }

    @Override
    public E removeFirst(){
        E element = null;
        if (isEmpty()){
            System.out.println("The list is empty - nothing to remove...");
        }else if(size==1){
            element = this.head.getElement();
            this.head = null;
            this.tail = null;
            this.size--;
        }
        else {
            element = this.head.getElement();
            this.head = this.head.getNext();
            this.size--;
        }
        return element;
    }

    @Override
    public E removeLast(){
        E element = null;
        if (isEmpty()){
            System.out.println("The list is empty, nothing to remove!");
        }else if(size==1){
            element = this.tail.getElement();
            this.tail = null;
            this.head = this.tail;
            this.size--;
        }else {
            element = this.tail.getElement();
            Node<E> temp = this.head;
            for (int k = 0; k< size-2; k++){
                temp = temp.getNext();
            }
            temp.setNext(null);
            this.tail = temp;
            this.size--;
        }
        return element;
    }

	@Override
	public boolean containsElement(E element) {
		boolean contains = false;
		if (isEmpty()) {
			System.out.println("The list is empty - no elements to search!");
		}else {
			Node<E> temp = this.head;
			while(!contains) {
				if (element.equals(temp.getElement())) {
					contains = true;
				}
				temp = temp.getNext();
//				if (temp == null) {
//					break;
				/*
				 * napravi način za izlaz iz petlje kući
				 */
				}
			}

		return contains;
	}

	@Override
	public void insertAtPosition(E element, int position) {
		if (position < 0 || position > size+1) {
			System.out.println("Index out of bounds!");
			throw new IndexOutOfBoundsException();
		}else if (size == 0 && position == size+1){
			addFirst(element);
			System.out.println("Added new element at first position!");
			size++;
		}else if (position == size) {
			addLast(element);
			System.out.println("Assed new elemetn at last position!");
			size++;
		}else {
			Node<E> newNode = new Node<>(element, null);
			Node<E> temp = head;
			for (int k = 0; k < position - 1; k++) {
				temp = temp.getNext();
			}
			newNode.setNext(temp.getNext());
			temp.setNext(newNode);
			size++;
			System.out.println("Added new element at position "+ position);
		}
		
	}
}


	
	
