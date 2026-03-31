import javax.management.RuntimeErrorException;

public class DynamicStack<T> {
    
	private Node<T> top;
	private int size;
	
	private static class Node<T>{
		T data;
		Node<T> nextNode;
		
		public Node(T data) {
			this.data = data;
		}
		
	}
	
	public void push(T data) {
		Node<T> newNode = new DynamicStack.Node<>(data);
		newNode.nextNode = top;
		top = newNode;
		size++;
	}
	
	public T pop() {
		if(isEmpty()) {
			throw new RuntimeErrorException(null, "Stack is empty");
		}
		T valueT = top.data;
		top = top.nextNode;
		size--;
		return valueT;	
	}
	
	public T peek() {
		if(isEmpty()) {
			throw new RuntimeErrorException(null, "Stack is empty");
		}
		return top.data;
	}

	private boolean isEmpty() {
		return top == null;
	}
	
}
