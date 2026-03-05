
 class Node {
	int data;
	Node next;
	public Node(int data) {
		this.data = data;
		this.next = null;
	}
}


public class LinkedList{

	private Node head = null;
	private int size;
	
	public void add(int data) {
		// TODO Auto-generated method stub
		Node newNode = new Node(data);
		if(head == null) {			
			head = newNode;
		}else {
			Node current = head;
			while (current.next != null) {
				current = current.next;
			}
			current.next = newNode;
		}
    size++;
	}
	
	public void addFirst(int data) {
		
		Node newNode = new Node(data);
		newNode.next = head;
		head = newNode;
		size++;
	}
	

	public void add(int index, int data) {
		if(index<0 || index>size) throw new IndexOutOfBoundsException();
		
		if(index == 0) {add(data); return;}
		
		Node newNode = new Node(data);
		Node currentNode = head;
		for (int i = 0; i < index-1; i++) {
			currentNode = currentNode.next;
		}
		newNode.next = currentNode.next;
		currentNode.next = newNode;
		size++;
		
	}

	public void print() {
		// TODO Auto-generated method stub
		Node current = head;
		if(head == null) return;
		
		while (current != null) {
			System.out.print(current.data + " ");
			current = current.next;
		}
		System.out.println();
	}

	public int size() {
		// TODO Auto-generated method stub
		return size;
	}

	public void remove(int data) {
		if(head == null) return;
		
		Node currentNode = head;
		  if (head.data == data) {
	            head = head.next;
	            size--;
	            return;
	        }
		while (currentNode.next != null && currentNode.next.data != data) {
			currentNode = currentNode.next;
		}
		if(currentNode.next != null) {
			currentNode.next = currentNode.next.next;
		}
		size--;
		
	}

	public int get(int index) {
		if(index<0 || index>size) throw new IndexOutOfBoundsException();
		Node currentNode = head;
		
		for (int i = 0; i < index; i++) {
			currentNode = currentNode.next;
		}
		
		return currentNode.data;
	}
	
	public Node getNode(int index) {
	    if(index < 0 || index >= size) throw new IndexOutOfBoundsException();
	    Node current = head;
	    for(int i = 0; i < index; i++) {
	        current = current.next;
	    }
	    return current;
	}

	public void reverse() {
		// TODO Auto-generated method stub
		Node prevNode = null;
		Node currentNode = head;
		Node nextNode = null;
		
		while (currentNode != null) {
			nextNode = currentNode.next;
			currentNode.next = prevNode;
			prevNode = currentNode;
			currentNode = nextNode;
		}
		head = prevNode;
	}


	
}