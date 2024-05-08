package MPP;

//import DSA.Node;

public class Queue {
	Node first;
	Node last;
	int length;
	
	Queue(int data){
		Node newNode = new Node(data);
		this.first = newNode;
		this.last = newNode;
		this.length = 1;
	}
	
	public void enqueue(int data) {
		Node newNode = new Node(data);
		if(this.length == 0) {
			this.first = newNode;
			this.last = newNode;
		}else {
			this.last.next = newNode;
			this.last = newNode;
		}
		this.length += 1;
	}
	
	public Node dequeue() {
		if(this.length == 0) return null;
		Node temp = this.first;
		if(this.length == 1) {
			this.first = null;
			this.last = null;
		}else {
			this.first = temp.next;
			temp.next = null;
		}
		this.length -= 1;
		return temp;
	}
	
	public String toString() {
		String string = "";
		Node temp = this.first;
		while(temp != null) {
			string += " " + temp.data;
			temp = temp.next;
		}
		return string;
	}
}
