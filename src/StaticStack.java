
public class StaticStack<T> {
   
	private Object[] elements;
	private int top;
	private int capacity;
	
	public StaticStack(int capacity){
		this.capacity = capacity;
		this.elements = new Object[capacity];
		this.top = -1;
	}
	
	public void push(T element) {
		if(isFull()) {
			throw new StackOverflowError();
		}
		elements[++top] = element;
	}
	
	@SuppressWarnings("unchecked")
	public T pop() {
		if(isEmpty()) {
			throw new IllegalStateException("Stack is empty");
		}
		T item = (T) elements[top];
		elements[top--] = null;
		return item;
	}
	
	@SuppressWarnings("unchecked")
	public T peek() {
		if(isEmpty()) {
			throw new IllegalStateException("Stack is empty");
		}
		return (T) elements[top];
	}

	private boolean isEmpty() {
		return top == -1;
	}

	private boolean isFull() {
		return top == capacity-1;
	}
	public int size() {
		return top+1;
	}

	@Override
	public String toString() {
		if (isEmpty()) {
			return "[]";
		}
		StringBuilder stringBuilder = new StringBuilder("[");
		for(int i = 0; i<=top; i++) {
			stringBuilder.append(elements[i]);
			if(i<top) stringBuilder.append(", ");
		}
		return stringBuilder.append("]").toString();
	}
	
	
	
}
