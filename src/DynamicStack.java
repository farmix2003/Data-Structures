import java.util.Iterator;


public class DynamicStack<T> implements Iterable<T> {
    
	private Node<T> top;
	private int size;
	
	private static class Node<T>{
		T data;
		Node<T> nextNode;
		
		public Node(T data) {
			this.data = data;
		}	
	}
		
	@Override
	public Iterator<T> iterator(){
		return new Iterator<T>() {
			private Node<T> current = top;
			
			@Override
			public boolean hasNext() {
				return current != null;
			}
			
			@Override
			public T next () {
				T data = current.data;
				current = current.nextNode;
				return data;
			}
			
		};
	}
	
	public void push(T data) {
		Node<T> newNode = new DynamicStack.Node<>(data);
		newNode.nextNode = top;
		top = newNode;
		size++;
	}
	
	public T pop() {
		if(isEmpty()) {
			throw new IllegalStateException("Stack is empty");
		}
		T valueT = top.data;
		top = top.nextNode;
		size--;
		return valueT;	
	}
	
	public T peek() {
		if(isEmpty()) {
			throw new IllegalStateException("Stack is empty");
		}
		return top.data;
	}
	
	private boolean isEmpty() {
		return top == null;
	}
	
	public int size() {
		return size;
	}
	
}
