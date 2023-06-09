package vjezba3;

public class SLIST <E> implements LLST<E> {
    private Node<E> head;
    private Node<E> tail;
    private int size;

    public SLIST() {
        head = null;
        tail = null;
        size = 0;
    }
    @Override
    public int size() {
                        return this.size;
    }

    @Override
    public boolean isEmpty() {
        return this.size == 0;
    }

    @Override
    public void addLast(E e) {
        Node<E> newNode = new Node<>(e, null);
        if (isEmpty()) {
            head = newNode;
        } else {
            tail.setNext(newNode);
        }
        tail = newNode;
        size++;

    }

    @Override
    public void addFirst(E e) {
        Node<E> newNode = new Node<>(e, head);
        if (isEmpty()) {
            tail = newNode;
        }
        head = newNode;
        size++;

    }

    @Override
    public E getFirst() {
        E element = null;
        if (!isEmpty()) {
            element = head.getElement();
        }
        return element;
    }

    @Override
    public E getLast() {
        E element = null;
        if(!isEmpty()){
            element = tail.getElement();
        }
        return element;
    }

    @Override
    public E removeFirst() {
        E element = null;
        if(isEmpty()){
            System.out.println("List is empty - nothing to remove!");
        } else if (size == 1) {
            element = head.getElement();
            head = null;
            tail = null;
            size--;
            System.out.println("Removed last element from the list so list is empty!!!");
        } else {
            element = head.getElement();
            head = head.getNext();
            size--;
            System.out.println("Removed element: " + element);
        }
        return element;
    }

    @Override
    public E removeLast() {
        E element = null;
        if(isEmpty()){
            System.out.println("List is empty - nothing to remove!");
        } else if (size == 1) {
            element = head.getElement();
            head = null;
            tail = null;
            size--;
            System.out.println("Removed last element from te list so list is empty!!!");
        } else {
            Node<E> temp = head;
            for (int k = 0; k < size - 2; k++) {
                temp = temp.getNext();
            }
            element = tail.getElement();
            tail = temp;
            tail.setNext(null);
            size--;
            System.out.println("Removed element: " + element);
        }
        return element;
    }

    @Override
    public void clear() {
        head = null;
        tail = null;
        size = 0;

    }

    @Override
    public void insert(int index, E e) {
        if(index < 0 || index > size){
            System.out.println("Index out of bounds!!!");
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        } else if(index == 0){
            addFirst(e);
        } else if(index == size){
            addLast(e);
        } else {
            Node<E> newNode = new Node<>(e, null);
            Node<E> temp = head;
            for (int k = 0; k < index - 1; k++) {
                temp = temp.getNext();
            }
            newNode.setNext(temp.getNext());
            temp.setNext(newNode);
            size++;
        }

    }

    @Override
    public E remove(int index) {
        E element = null;
        if(index < 0 || index >= size){
            System.out.println("Index out of bounds!!!");
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        } else if(index == 0){
            System.out.println("Removing first element...");
            element = removeFirst();
        } else if(index == size - 1){
            System.out.println("Removing last element...");
            element = removeLast();
        } else {
            Node<E> temp = head;
            for (int k = 0; k < index - 1; k++) {
                temp = temp.getNext();
            }
            element = temp.getNext().getElement();
            temp.setNext(temp.getNext().getNext());
            size--;
        }
        return element;
    }


    @Override
    public boolean contains(E e) {
        boolean contains = false;

        if(isEmpty()){
            System.out.println("List is empty!!!");
            System.out.println("So, element " + e + " can not be found!!!");
        } else {
            Node<E> temp = head;
            while(temp != null){
                if(temp.getElement().equals(e)){
                    contains = true;
                    break;
                }
                temp = temp.getNext();
            }
        }
        return contains;
    }

    @Override
    public String toString() {
        String size = "Size: " + this.size;
        String head = "Head: " + this.head;
        String tail = "Tail: " + this.tail;
        String list = "List: \n" + this.head;
        return size +"\n" + head + "\n" + tail + "\n" + list + "\n";
    }
}
