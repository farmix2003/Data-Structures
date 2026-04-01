import java.util.Iterator;
import java.util.NoSuchElementException;

public class DynamicQueue<T> implements Iterable<T> {
	
	private Node<T> head;
	private Node<T> tail;
	private int size;
	
	private static class Node<T>{
	
		T dataT;
		Node<T> nexNode;
		
		public Node(T dataT) {
			// TODO Auto-generated constructor stub
			this.dataT = dataT;
		}	
	}
	
	public void offer(T data) {
		Node<T> newNode = new Node<T>(data);
		
		if (isEmpty()) {
			head = tail = newNode;
		} else {
			tail.nexNode = newNode;
			tail = newNode;
		}
		size++;
	}

	public T pool() {
		if (isEmpty()) {
			throw new NoSuchElementException("Queue is empty");
		}
		T valueT = head.dataT;
		head = head.nexNode;
		size--;
		if (head == null) {
			tail = null;
		}
		return valueT;
	}
	
	public T peek() {
		if (isEmpty()) {
			throw new NoSuchElementException("Queue is empty");
		}
		return head.dataT;
	}
	
	public int size() {
		return size;
	}
	
	@Override
	public Iterator<T> iterator(){
		return new Iterator<T>() {
			private Node<T> curr = head;
			
			@Override 
			public boolean hasNext() {
				return curr != null;
			}
			
			@Override
			public T next() {
				if (!hasNext()) {
					throw new NoSuchElementException();
				}
				
				T valueT = curr.dataT;
				curr = curr.nexNode;
				return valueT;
			}
		};
	}
	
	private boolean isEmpty() {
	  return head == null;
	}
	
	@Override
    public String toString() {
        if (isEmpty()) {
            return "[]";
        }

        StringBuilder sb = new StringBuilder("[");
        Node<T> current = head;

        while (current != null) {
            sb.append(current.dataT);
            if (current.nexNode != null) {
                sb.append(", ");
            }
            current = current.nexNode;
        }

        sb.append("]");
        return sb.toString();
    }
 
}
