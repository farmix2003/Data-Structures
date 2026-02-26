class Node{
	int data;
	Node next;
	
	public Node(int data) {
		this.data =data;
		next = null;
	}
}


public class LinkedList {
   Node headNode = null;
	
  
  public void add(int data) {
	  Node newNode = new Node(data);
	  
	  if(headNode == null) {
		  headNode = newNode;
	  }else {
		  Node currentNode = headNode;
		  while (currentNode.next != null) {
              currentNode = currentNode.next;			
		}
		  currentNode.next = newNode;
	  }
  }
	
  public void addFirst(int data) {
	  Node newNode = new Node(data);
	  newNode.next = headNode;
	  headNode = newNode;
	  
	  
  }
  
  
	public void print() {
		Node current = headNode;
		
		while (current != null) {
			System.out.print(current.data+" ");
			current = current.next;
		}
		System.out.println();
	}
	
}
