
public class HashMap<K, V> {

	private Node<K, V>[] table;
	private int capacity = 16;
	private int size = 0;
	
    @SuppressWarnings("unchecked")
	public HashMap() {
    	table = new Node[capacity];
    }
	
	private static class Node<K, V>{
		K key;
		V value;
		Node<K, V> next;
		Node(K key, V value){
			this.key = key;
			this.value = value;
		}
	}
	
	@SuppressWarnings("unused")
	private int hash(K key) {
		return Math.abs(key.hashCode() & 0x7fffffff)%capacity;
	}
	
	public void put(K key, V value) {
		int index = hash(key);
		
		if (key == null) {
			throw new IllegalArgumentException("Null keys are not supported");
		}
		
		Node<K, V> head = table[index];
		
		while(head != null) {
			if(head.key.equals(key)) {
				head.value = value;
				return;
			}
			head = head.next;
		}
		
		Node<K, V> newNode = new Node<>(key, value); 
		newNode.next = table[index];
		table[index] = newNode;
		size++;
	}
	
	public V get(K key) {
		
		if (key == null) {
		    throw new IllegalArgumentException("Null keys are not supported");
		}
		
		int index = hash(key);
		
		Node<K, V> curr = table[index];
		
		while (curr != null) {
			if(curr.key.equals(key)) {
				return curr.value;
			}
			curr = curr.next;
		}
		return null;
	}
	
	public V remove(K key) {
       
		if (key == null) {
		    throw new IllegalArgumentException("Null keys are not supported");
		}
		
		int index = hash(key);
		
		Node<K, V> current = table[index];
		Node<K, V> prev = null;
		
		while (current != null) {
			if(current.key.equals(key)) {
				if (prev == null) {
					table[index] = current.next;
				}else {
					prev.next = current.next;
				}
				size--;
				return current.value;
			}
			prev = current;
			current = current.next;
		}
 		return null;
	}
	
	public boolean containsKey(K key) {
		
		if (key == null) {
		    throw new IllegalArgumentException("Null keys are not supported");
		}
		
		int index = hash(key);
		
		Node<K, V> current = table[index];
		
		while (current != null) {
			if(current.key.equals(key)) {
				return true;
			}
		}
		return false;
	}

	public int size() {
	    return size;
	}

	public boolean isEmpty() {
	    return size == 0;
	}

	@Override
	public String toString() {
	  StringBuilder stringBuilder = new StringBuilder("{");
	  boolean first = true;
	  
	  for (int i = 0; i < capacity; i++) {
		Node<K, V> current = table[i];
		while (current != null) {
			if(!first) {
				stringBuilder.append(", ");
			}
			stringBuilder.append(current.key).append("=").append(current.value);
			first = false;
			current = current.next;
		}
	}
	  
	  stringBuilder.append("}");
	  return stringBuilder.toString();
	  
	}
	
	
	
	
}

