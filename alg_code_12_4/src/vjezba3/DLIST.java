package vjezba3;

public class DLIST <E> implements LLST<E> {

    private DNODE<E> head;
    private DNODE<E> tail;

    private int size;

    public DLIST() {
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
        if(isEmpty()){
            head = new DNODE<>(e, null, null);
            tail = head;
        } else {
            DNODE<E> newNode = new DNODE<>(e, null, tail);
            tail.setNext(newNode);
            tail = newNode;
        }
        size++;

    }

    @Override
    public void addFirst(E e) {
        if(isEmpty()){
            head = new DNODE<>(e, null, null);
            tail = head;
        } else {
            DNODE<E> newNode = new DNODE<>(e, head, null);
            head.setPrev(newNode);
            head = newNode;
        }
        size++;
    }

    @Override
    public E getFirst() {
        E element = null;
        if(isEmpty()){
            System.out.println("List is empty - nothing to get!");
        } else {
            element =  head.getElement();
        }
        return element;
    }

    @Override
    public E getLast() {
        E element = null;
        if(isEmpty()){
            System.out.println("List is empty - nothing to get!");
        } else {
            element =  tail.getElement();
        }
        return element;
    }

    @Override
    public E removeFirst() {
        E element = null;
        if(isEmpty()){
            System.out.println("List is empty - nothing to remove!");
        } else if (size == 1){
            element = head.getElement();
            head = null;
            tail = null;
            size--;
            System.out.println("List is empty now!");
        } else {
            element = head.getElement();
            head = head.getNext();
            head.setPrev(null);
            size--;
        }

        return element;
    }

    @Override
    public E removeLast() {
        E element = null;
        if(isEmpty()){
            System.out.println("List is empty - nothing to remove!");
        } else if (size == 1){
            element = head.getElement();
            head = null;
            tail = null;
            size--;
            System.out.println("List is empty now!");
        } else {
            element = tail.getElement();
            tail = tail.getPrev();
            tail.setNext(null);
            size--;
        }
        return element;
    }

    @Override
    public void clear() {
        head = null;
        tail = null;
        size = 0;
        System.out.println("All elements removed - list is empty now!");
    }

    @Override
    public void insert(int index, E e) {
        if(index < 0 || index > size){
            System.out.println("Index out of bounds!");
            throw new IndexOutOfBoundsException();
        } else if(index == 0){
            addFirst(e);
        } else if(index == size){
            addLast(e);
        } else {
            DNODE<E> newNode = new DNODE<>(e, null, null);
            DNODE<E> temp = head;
            for(int k = 0; k < index; k++){
                temp = temp.getNext();
            }
            newNode.setNext(temp);
            newNode.setPrev(temp.getPrev());
            temp.getPrev().setNext(newNode);
            temp.setPrev(newNode);
            size++;
        }

    }

    /**
     * another way to insert an element at a given index position
     * using divide and conquer approach
     * middle index position is an anchor point to decide which direction to go
     * head or tail
     * @param indPos index position to insert the element
     * @param element element to be inserted
     *                if index position is out of bounds, nothing happens and
     *                throws IndexOutOfBoundsException
     *                if index position is 0, element is added at the beginning
     *                if index position is size, element is added at the end
     *                if index position is in between, element is added at the
     *                given index position
     *
     * @throws IndexOutOfBoundsException exception thrown if index position is out of bounds
     */
    public void insertAt(int indPos, E element){

        if(indPos < 0 || indPos > size){
            System.out.println("Index out of bounds!");
            throw new IndexOutOfBoundsException("Not allowed indexation!");
        } else if(indPos == 0){
            addFirst(element);
            System.out.println("Element added at index position " + indPos + ": " + element);
        } else if (indPos == size){
            addLast(element);
            System.out.println("Element added at index position " + indPos + ": " + element);
        } else{
            DNODE<E> newNode = new DNODE<>(element, null, null);
            DNODE<E> temp = null;
            int middleIndex = size / 2;
            if(indPos <= middleIndex){
                temp = head;
                for(int k = 0; k < indPos; k++){
                    temp = temp.getNext();
                }
            } else {
                temp = tail;
                for(int k = size - 1; k > indPos; k--){
                    temp = temp.getPrev();
                }
            }
            newNode.setNext(temp);
            newNode.setPrev(temp.getPrev());
            temp.getPrev().setNext(newNode);
            temp.setPrev(newNode);
            System.out.println("Element added at index position " + indPos + ": " + element);
        }

    }

    @Override
    public E remove(int index) {
        E element = null;
        if(isEmpty()){
            System.out.println("List is empty - nothing to remove!");
        } else if(index < 0 || index >= size){
            System.out.println("Index out of bounds!");
            throw new IndexOutOfBoundsException();
        } else if(index == 0){
            element = removeFirst();
            System.out.println("Element removed: " + element);
        } else if(index == size - 1){
            element = removeLast();
            System.out.println("Element removed: " + element);
        } else {
            DNODE<E> temp = head;
            for(int k = 0; k < index; k++){
                temp = temp.getNext();
            }
            element = temp.getElement();
            System.out.println("Element removed: " + element);
            temp.getPrev().setNext(temp.getNext());
            temp.getNext().setPrev(temp.getPrev());
            size--;
        }
        return element;
    }

    @Override
    public boolean contains(E e) {
        boolean contains = false;
        if(isEmpty()){
            System.out.println("List is empty - nothing to search!");
        } else {
            DNODE<E> temp = head;
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
        if (this.size == 0) {
            return "List is empty!";
        } else {
            String head = "Head: " + this.head.getElement();
            String tail = "Tail: " + this.tail.getElement();
            String list = "List: \n" + this.head;
            return size +"\n" + head + "\n" + tail + "\n" + list + "\n";
        }
    }
}
