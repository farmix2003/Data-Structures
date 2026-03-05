import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> nLinkedList = new java.util.LinkedList<>();
		
		
		LinkedList srLinkedList = new LinkedList();
		srLinkedList.add(2);
		srLinkedList.add(3);
		srLinkedList.add(7);
	
		
		srLinkedList.addFirst(6);
		
		srLinkedList.add(2, 4);
		
		srLinkedList.remove(7);
		
		srLinkedList.print();
		
		srLinkedList.reverse();
		
		srLinkedList.print();
		System.out.println(srLinkedList.get(3));
		System.out.println(srLinkedList.size());

	}

}
