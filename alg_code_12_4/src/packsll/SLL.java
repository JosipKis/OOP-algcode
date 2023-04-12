package packsll;

public interface SLL <E>{
	
	/*
	 * return the size of the list
	 * that is number of actual elements in
	 * the list
	 * @return size of the list
	 */

	int size();
	//kad smo u 'interface' sve je zadano kao public!
	
	/*
	 * return if list is empty
	 * true if empty and false if not
	 * @return empty or not
	 */
	
	boolean isEmpty();
	
	/*
	 * add new element at the beginning of the list
	 */
	
	void addFirst(E element);
	
	/*
	 * add new element at the end of the list
	 */
	
	void addLast(E element);
	
	/*
	 * removing first element from the list
	 * list size is decremented for one
	 * @return element from first position, null if there is nothing to remove
	 */
	
	E removeFirst();
	
	/*
	 * removing last element from the list
	 * list size is decremented for one
	 * @return element from last position, null if there is nothing to remove
	 */
	
	E removeLast();
	
	/*
	 * Returns true if contains elements, and 
	 * false if it doesn't
	 * @return true if contains
	 */

	boolean containsElement(E element);
	
	/*
	 * Inserts element at desired position
	 * @throws IndexOutOfBoundsException if position out of bounds
	 */
	
	void insertAtPosition(E element, int position);
	
}
