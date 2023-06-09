package vjezba3;

public class CLLIST<E> implements LLST<E> {

    private Node<E> tail;
    private int size;

    public CLLIST() {
        tail = null;
        size = 0;
        System.out.println("Created empty CLLIST");
    }

    public Node<E> getTail() throws NullPointerException{
        if(tail==null){
            System.out.println("Tail is null");
            throw new NullPointerException("Tail is null!");
        } else {
            System.out.println("Tail is not null");
            System.out.println("Tail: " + tail.getElement());
        }
        return tail;
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
    public void addLast(E e) {
        if (isEmpty()) {
            tail = new Node<>(e, null);
            tail.setNext(tail);
            size++;
        } else {
            addFirst(e);
            tail = tail.getNext();
        }

    }

    public void addLastBeforeTail(E e) {
        if (isEmpty()) {
            tail = new Node<>(e, null);
            tail.setNext(tail);
            size++;
        } else {
            Node<E> newNode = new Node<>(e, null);
            Node<E> temp = tail.getNext();
            while (temp.getNext() != tail) {
                temp = temp.getNext();
            }
            temp.setNext(newNode);
            newNode.setNext(tail);
            tail = newNode;
            size++;
        }
    }

    @Override
    public void addFirst(E e) {
        if(isEmpty()) {
            tail = new Node<>(e, null);
            tail.setNext(tail);
        } else {
            Node<E> newNode = new Node<>(e, tail.getNext());
            tail.setNext(newNode);
        }
        size++;

    }

    @Override
    public E getFirst() {
        E element = null;
        if(isEmpty()){
            System.out.println("List is empty - returning null!");
        } else {
            element = tail.getNext().getElement();
        }
        return element;
    }

    @Override
    public E getLast() {
        E element = null;
        if (isEmpty()) {
            System.out.println("List is empty - returning null!");
        } else {
            element = tail.getElement();
        }
        return element;
    }

    @Override
    public E removeFirst() {
        E element = null;
        if(isEmpty()) {
            System.out.println("List is empty - returning null!");
        } else if (size == 1) {
            element = tail.getElement();
            tail = null;
            size--;
        } else {
            element = tail.getNext().getElement();
            tail.setNext(tail.getNext().getNext());
            size--;
        }
        return element;
    }

    @Override
    public E removeLast() {
        E element = null;
        if(isEmpty()) {
            System.out.println("List is empty - returning null!");
        } else if (size == 1) {
            element = tail.getElement();
            tail = null;
            size--;
        } else {
            Node<E> current = tail;
            while(current.getNext() != tail) {
                current = current.getNext();
            }
            element = tail.getElement();
            current.setNext(tail.getNext());
            tail = current;
            size--;
        }
        return element;
    }

    @Override
    public void clear() {
        tail = null;
        size = 0;
        System.out.println("List is cleared!");

    }

    @Override
    public void insert(int index, E e) {
        if (index < 0 || index > size) {
            System.out.println("Index out of bounds!");
        } else if (index == 0) {
            addFirst(e);
        } else if (index == size) {
            addLast(e);
        } else {
            Node<E> current = tail;
            for (int i = 0; i < index - 1; i++) {
                current = current.getNext();
            }
            Node<E> newNode = new Node<>(e, current.getNext());
            current.setNext(newNode);
            size++;
        }
    }

    @Override
    public E remove(int index) {
        return null;
    }

    @Override
    public boolean contains(E e) {
        boolean inList = false;
        if(isEmpty()) {
            System.out.println("List is empty - returning false!");
        } else {
            Node<E> current = tail;
            do {
                current = current.getNext();
                E element = current.getElement();
                if(element.equals(e)) {
                    inList = true;
                    current = tail;
                }
            } while (current != tail);
        }
        return inList;
    }

    public void rotate(){
        if(tail != null){
            tail = tail.getNext();
            System.out.println("List is rotated!");
        } else {
            System.out.println("List is empty - nothing to rotate!");
        }
    }
    public Node<E> getTailNode(){
        return tail;
    }

    @Override
    public String toString() {
        String rep;
        if(isEmpty()) {
            rep = "List is empty!";
        } else if (size == 1){
            String list = " ->> TAIL[" + tail.getElement() + "] ->";
            rep = "Size: " + size + "\n" + list;
        } else {
            Node<E> current = tail;
            String list = "";
            current = current.getNext();
            while(current != tail) {
                list += "[ " +  current.getElement() + " ] ->";
                //System.out.println("Fetching element: " + current.getElement());
                current = current.getNext();
            }
            list += " ->> TAIL[ " + tail.getElement() + " ] -> ";
            rep = "Size: " + size + "\n" + list;
        }
        return rep;
    }

}
