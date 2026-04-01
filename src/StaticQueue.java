
public class StaticQueue<T> {

	private Object[] elementsObjects;
	private int front;
	private int rear;
	private int capacity;
	private int size;
	
	public StaticQueue(int capacity) {
		if (capacity < 0) {
			throw new IllegalArgumentException("Capacity must be greater than 0");
		}
		this.capacity = capacity;
		this.elementsObjects = new Object[capacity];
		this.front = 0;
		this.rear = 0;
		this.size = 0;
	}
	
	public void offer(T data) {
		if(isFull()) {
			throw new IllegalStateException("Queue is full");
		}
		elementsObjects[rear] = data;
		rear = (rear+1) % capacity;
		size++;
	}
	
	@SuppressWarnings("unchecked")
	public T poll() {
		if(isEmpty()) {
			throw new IllegalStateException("Queue is empty");
		}
		T value = (T) elementsObjects[front];
		elementsObjects[front] = null;
		front = (front+1) % capacity;
		size--;
		return value;
	}
	
	@SuppressWarnings("unchecked")
	public T peek() {
		if(isEmpty()) {
			throw new IllegalStateException("Queue is empty");
		}
		return (T) elementsObjects[front];
	}

	private boolean isEmpty() {
		return size == 0;
	}

	private boolean isFull() {
		return size == capacity;
	}
	
	public int size() {
		return size;
	}

    @Override
    public String toString() {
        if (isEmpty()) {
            return "[]";
        }

        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < size; i++) {
            int index = (front + i) % capacity;
            sb.append(elementsObjects[index]);
            if (i < size - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
