import java.util.Iterator;
import java.util.NoSuchElementException;

public class DynamicDeque<T> implements Iterable<T> {

	private Node<T> head;
	private Node<T> tail;
	private int size;
	
	private static class Node<T>{
		Node<T> nextNode;
		Node<T> prevNode;
		T data;
		
		public Node(T data) {
			this.data = data;
		}
		
	}
	
	public void addFirst(T data) {
		Node<T> newNode = new Node<>(data);
		if(isEmpty()) {
			head = tail = newNode;
		} else {
			newNode.nextNode = head;
			head.prevNode = newNode;
			head = newNode;
		}
		size++;
	}
	
	public void addLast(T data) {
		Node<T> newNode = new Node<>(data);
		
		if (isEmpty()) {
			head = tail = newNode;
		}else {
			tail.nextNode = newNode;
			newNode.prevNode = tail;
			tail = newNode;
		}
		size++;
	}
	
	public T removeFirst() {
		if(isEmpty()) {
			throw new NoSuchElementException("Deque is empty");
		}
		T value = head.data;
		head = head.nextNode;
		
		if (head == null) {
			tail = null;
		}else {
			head.prevNode = null;
		}
		size--;
		return value;
	}
	
	public T removeLast() {
		if (isEmpty()) {
			throw new NoSuchElementException("Deque is empty");
		}
		T value = tail.data;
		tail = tail.prevNode;
		
		if (tail == null) {
			head = null;
		}else {
			tail.nextNode = null;
		}
		size--;
		return value;
	}
	
	public T peekFirst() {
		if (isEmpty()) {
			throw new NoSuchElementException("Deque is empty");
		}
		return head.data;
	}
	
	public T peekLast() {
		if (isEmpty()) {
			throw new NoSuchElementException("Deque is empty");
		}
		return tail.data;
	}
	
	public int size() {
		return size;
	}

	public boolean isEmpty() {
		return size == 0;
	}
	
	@Override
	public Iterator<T> iterator(){
		return new Iterator<T>() {
			private Node<T> currNode = head;
			
			@Override
			public boolean hasNext() {
				return currNode != null;
			}
			
			@Override
			public T next() {
				if (!hasNext()) {
					throw new NoSuchElementException("Deque is empty");
				}
				T value = currNode.data;
				currNode = currNode.nextNode;
				return value;
			}
		};
	}
	 @Override
	    public String toString() {
	        if (isEmpty()) {
	            return "[]";
	        }

	        StringBuilder sb = new StringBuilder("[");
	        Node<T> current = head;

	        while (current != null) {
	            sb.append(current.data);
	            if (current.nextNode != null) {
	                sb.append(", ");
	            }
	            current = current.nextNode;
	        }

	        sb.append("]");
	        return sb.toString();
	    }

	
}
