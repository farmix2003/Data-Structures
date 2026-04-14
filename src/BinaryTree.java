import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree<T> {

   private static class Node<T>{
      T data;
      Node<T> leftNode;
      Node<T> rightNode;
      
      public Node(T data) {
		// TODO Auto-generated constructor stub
    	  this.data = data;
	}
   }
   
   private Node<T> root;
   private int size;
   
   public void insert(T data) {
	if(data == null) {
		throw new IllegalArgumentException("Null values are not allowed");
	}
	Node<T> newNode = new Node<>(data);
	if(root == null) {
		root = newNode;
		size++;
		return;
	}
	Queue<Node<T>> queue = new LinkedList<>();
	queue.add(root);
	
	while (!queue.isEmpty()) {
		Node<T> current = queue.poll();
		
		if(current.leftNode == null) {
			current.leftNode = newNode;
			size++;
			return;
		}else {
			queue.add(current.leftNode);
		}
		
		if (current.rightNode == null) {
			current.rightNode = newNode;
			size++;
			return;
		}else {
			queue.add(current.rightNode);
		}
	   }
      }
   
    public boolean contains(T data) {
		if (data == null) {
			throw new IllegalArgumentException("Null values are not allowed"); 
		}
		
		if(root == null) return false;
		
		Queue<Node<T>> queue = new LinkedList<>();
		queue.add(root);
		
		while (!queue.isEmpty()) {
			Node<T> current = queue.poll();
			
			if(current.data.equals(data)) {
				return true;
			}
			
			if(current.leftNode == null) queue.add(current.leftNode);
			if(current.rightNode == null) queue.add(current.rightNode);
		}
		return false;
	}
    
    public void inOrder() {
		inOrder(root);
		System.out.println();
	}

	private void inOrder(Node<T> node) {
		if(node == null) return;
		inOrder(node.leftNode);
		System.out.println(node.data + " ");
		inOrder(node.rightNode);
	}
   
	public void preOrder() {
		preOrder(root);
		System.out.println();
	}

	private void preOrder(BinaryTree.Node<T> node) {
		// TODO Auto-generated method stub
		if(node == null) return;
		System.out.println(node.data + " ");
		preOrder(node.leftNode);
		preOrder(node.rightNode);
	}
	public void postOrder() {
		postOrder(root);
		System.out.println();
	}

	private void postOrder(BinaryTree.Node<T> node) {
		// TODO Auto-generated method stub
		if(node == null) return;
		
		postOrder(node.leftNode);
		postOrder(node.rightNode);
		System.out.println(node.data + " ");
	}
}
