package vjezba5Zad5;

public interface Int_Queue<E> {

	// FIFO mechanism on the work :-)

	/**
	 * Gives number of the elements in the queue
	 * @return the size of the queue
	 */
	public int size();

	/**
	 * Status for the queue on the question is it empty or not
	 * @return true if queue is empty, otherwise false
	 */
	public boolean isEmpty();

	/**
	 * Dealing with the new elements of the queue
	 * Inserts that element into the tail/end of queue
	 * @param el
	 */
	public void enqueue(E el);

	/**
	 * Give a look into the first element without removing it
	 * return null if empty
	 * @return the first element but not remove it
	 */
	public E first();

	/**
	 * Get and remove the first element of the queue
	 * return null if empty
	 * @return first element and removes it from the queue
	 */
	public E dequeue();

}