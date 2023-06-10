package vjezba5Zad5;

public interface Int_SLL<E> {
	/**
	 * Return the number of elements in the list
	 * @return number of elements in the list
	 */
	public int size();
	/**
	 * Returns true if list is empty, and otherwise false
	 * @return boolean for question if the list is empty
	 */
	public boolean isEmpty();
	/**
	 * Return but not remove the first element in the list
	 * @return the first element without removing it
	 */
	public E first();
	/**
	 * Return but not remove the last element in the list
	 * @return the last element without removing it
	 */
	public E last();
	/**
	 * Add the new element to the front of the list
	 * @param el Any legal Object type
	 */
	public void addFirst(E el);
	/**
	 * Add the new element at the end of the list
	 * @param el Any legal Object type
	 */
	public void addLast(E el);
	/**
	 * Adding the new element into the desired position of the list
	 * after the some desired node denoted as partNode
	 * If desired node is not in list add into the last position
	 * @param partNode any legal Object type - same type as param el  
	 * @param el Any legal Object type
	 */
	public void addElement(E partNode, E el);
	/**
	 * Remove and returns the first element of the list
	 * Returns null if the list is empty
	 * @return the first element and removes it from the list; null if empty
	 */
	public E removeFirst();
	/**
	 * Remove and returns the last element of the list
	 * Returns null if the list is empty
	 * @return the last element and removes it from the list; null if empty
	 */
	public E removeLast();
	/**
	 * Returns true if element is in the list, false otherwise
	 * @param el Any legal Object type
	 * @return boolean value for query if the element is in the list
	 */
	public boolean containsElement(E el);
}