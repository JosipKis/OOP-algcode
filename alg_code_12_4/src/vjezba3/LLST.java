package vjezba3;

/**
 * Interface for a linked list.
 * @author Ante
 * @param <E> the type of elements in this list
 */
public interface LLST<E>{

    /**
     * Returns the number of elements in this list.
     * @return the number of elements in this list
     */
    int size();

    /**
     * Returns true if this list contains no elements.
     * @return true if this list contains no elements
     */
    boolean isEmpty();

    /**
     * Adds the specified element to the end of this list.
     * @param e element to be added to this list
     */
    void addLast(E e);

    /**
     * Adds the specified element to the beginning of this list.
     * @param e element to be added to this list
     */

    void addFirst(E e);

    /**
     * Returns the first element in this list.
     * Null if the list is empty.
     * The element is not removed from the list.
     * @return the first element in this list
     */

    E getFirst();

    /**
     * Returns the last element in this list.
     * Null if the list is empty.
     * The element is not removed from the list.
     * @return the last element in this list
     */

    E getLast();

    /**
     * Removes and returns the first element from this list.
     * Null if the list is empty.
     * The element is removed from the list.
     * @return the first element from this list
     */

    E removeFirst();

    /**
     * Removes and returns the last element from this list.
     * If the list is empty, null is returned.
     * The element is removed from the list.
     * @return the last element from this list
     */
    E removeLast();

    /**
     * Removes all the elements from this list.
     */
    void clear();

    /**
     * Insert the specified element at the specified position in this list.
     * @param index position where to insert the specified element
     *              (index of the first element is 0)
     *              if index is equal to the size of this list, the element is added at the end
     *              if index is greater than the size of this list, an IndexOutOfBoundsException is thrown
     *              if index is negative, an IndexOutOfBoundsException is thrown
     * @param e element to be inserted in this list
     */

    void insert(int index, E e);

    /**
     * Removes the element at the specified position in this list.
     * Returns the element that was removed from the list.
     * Null is returned if the list is empty.
     * @param index the index of the element to be removed
     *              (index of the first element is 0)
     *              if index is equal to the size of this list, the last element is removed
     *              if index is greater than the size of this list, an IndexOutOfBoundsException is thrown
     *              if index is negative, an IndexOutOfBoundsException is thrown
     * @return the element at the specified position
     */
    E remove(int index);

    /**
     * Check if the specified element is in this list.
     * @param e element whose presence in this list is to be tested
     *          if e is null, the method returns false
     *          if e is not null, the method returns true if this list contains at least one element e
     *          (two elements e1 and e2 are considered equal if (e1==null ? e2==null : e1.equals(e2)))
     *          the method returns false otherwise
     *          the method does not modify this list
     *          the method does not modify e
     * @return true if this list contains the specified element
     */

    boolean contains(E e);


}
