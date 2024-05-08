package MPP;

//import DSA.DoubleLinkedList;

public class Main {

	public static void main (String[] args) throws Exception{
//		LinkedList linkedList = new LinkedList(1);
//		linkedList.append(2);
//		linkedList.prepend(0);
//		System.out.println(linkedList.pop().data);
//		System.out.println(linkedList.popFirst().data);
//		linkedList.reverse();
//		linkedList.printList();
		
		DoubleLinkedList doubleLinkedList = new DoubleLinkedList(5);
		doubleLinkedList.append(2);
		doubleLinkedList.append(4);
		doubleLinkedList.prepend(1);
//		System.out.println(doubleLinkedList.pop().data);
//		System.out.println(doubleLinkedList.popFirst().data);
//		System.out.println(doubleLinkedList.length);
		System.out.println(doubleLinkedList.get(1).data);
		doubleLinkedList.set(1,10);
		System.out.println(doubleLinkedList.toString());
		doubleLinkedList.reverse();
		System.out.println(doubleLinkedList.toString());
		
		
//	    StackArray stack = new StackArray(5);
//	    stack.push(0);
//	    stack.push(1);
//	    stack.push(2);
//	    stack.push(3);
//	    stack.push(4);
//	    stack.push(5);
//	    System.out.println(stack.pop());
//	    System.out.println(stack.pop());
//	    System.out.println(stack.pop());
//	    System.out.println(stack.pop());
//	    System.out.println(stack.pop());
//	    System.out.println(stack.isEmpty());
//	    System.out.println(stack.peak());
//	    System.out.println(stack.toString());
		
//		Queue queue = new Queue(1);
//		queue.enqueue(2);
//		queue.dequeue();
//		System.out.println(queue.toString());
		
//		StackLL stack = new StackLL(1);
//		stack.push(2);
//		stack.push(3);
//		System.out.println(stack.pop().data);
//		System.out.println(stack.pop().data);
//		System.out.println(stack.toString());
	}
}