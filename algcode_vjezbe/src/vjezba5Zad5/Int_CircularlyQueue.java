package vjezba5Zad5;

public interface Int_CircularlyQueue<E> extends Int_Queue<E>{

	/**
	 * Methods that rotates first element on the back of the queue
	 * If queue is empty does nothing
	 */
	public void rotate();
}