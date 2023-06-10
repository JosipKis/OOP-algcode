package vjezba5Zad5;

public class CircularlyQueue<E> implements Int_CircularlyQueue<E>{

	private CircularlyLinkedList<E> cirList;

	public CircularlyQueue() {
		// starting with an empty list
		cirList = new CircularlyLinkedList<>();
	}

	@Override
	public int size() {
		return cirList.size();
	}

	@Override
	public boolean isEmpty() {
		return cirList.isEmpty();
	}

	@Override
	public void enqueue(E el) {
		cirList.addLast(el);
	}

	@Override
	public E first() {
		return cirList.first();
	}

	@Override
	public E dequeue() {
		return cirList.removeFirst();
	}

	@Override
	public void rotate() {
		cirList.rotate();

	}

	public void listAllQueueElements() {
		cirList.listAll();
	}

}