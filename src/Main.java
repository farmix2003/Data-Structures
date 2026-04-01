public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     DynamicStack<Integer> stack = new DynamicStack<>();
     
     stack.push(2);
     stack.push(3);
     
//     System.out.println(stack.peek());
     
     
//     for (Integer integer : stack) {
//		System.out.println(integer);
//	}
     
     
     StaticStack<String> staticStack = new StaticStack<>(3);
     staticStack.push("Name");
     staticStack.push("Email");
     staticStack.push("Phone");
     
//     System.out.println(staticStack);
     
     
     //Queue
     DynamicQueue<Character> queue = new DynamicQueue<>();
     
     queue.offer('f');
     queue.offer('s');
     queue.offer('t');
     
     System.out.println(queue.peek());
     System.out.println(queue.pool());
     System.out.println(queue);
     
     StaticQueue<Integer> staticQueue = new StaticQueue<>(3);
     staticQueue.offer(1);
     staticQueue.offer(2);
     staticQueue.offer(3);
     
//     System.out.println(staticQueue);
     
//     System.out.println(staticQueue.peek());
     
     staticQueue.poll();
     
//     System.out.println(staticQueue);
     
     //Deque
     DynamicDeque<String> dynamicQueue = new DynamicDeque<>();
     dynamicQueue.addFirst("Hello");
     dynamicQueue.addFirst("World");
     dynamicQueue.addFirst("Never");
     dynamicQueue.addFirst("Java");
     dynamicQueue.addLast("Me");
     dynamicQueue.removeFirst();
     dynamicQueue.removeLast();
//     System.out.println(dynamicQueue.peekFirst());
//     System.out.println(dynamicQueue.peekLast());
//     System.out.println(dynamicQueue);
     
     HashMap<Integer, Integer> hashMap = new HashMap<>();
     hashMap.put(1, 2);
     hashMap.put(3, 4);
     System.out.println(hashMap);
     
	}

}
