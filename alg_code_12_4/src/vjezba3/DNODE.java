package vjezba3;

public class DNODE <E> {

    private E element;
    private DNODE<E> next;
    private DNODE<E> prev;

    public DNODE(E e, DNODE<E> n, DNODE<E> p) {
        element = e;
        next = n;
        prev = p;
    }

    public E getElement() {
        return element;
    }

    public DNODE<E> getNext() {
        return next;
    }

    public DNODE<E> getPrev() {
        return prev;
    }

    public void setElement(E e) {
        element = e;
    }

    public void setNext(DNODE<E> n) {
        next = n;
    }

    public void setPrev(DNODE<E> p) {
        prev = p;
    }

    @Override
    public String toString() {
        String rep = null;
        if (prev == null){
            rep = null + " <<- DNODE[ " + element + " ] -> " + next;
        } else {
            rep = " <<- DNODE[ " + element + " ] -> " + next;
        }
        return rep;
    }
}
