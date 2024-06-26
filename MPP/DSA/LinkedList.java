package MPP.DSA;

//import DSA.Node;

public class LinkedList {
	
	Node head;
	Node tail;
	int length;
	
	LinkedList(int data){
		Node newNode = new Node(data);
		this.head = newNode;
		this.tail = newNode;
		this.length = 1;
	}
	
	public void printList() {
		Node temp = this.head;
		String string = "";
		while(temp != null) {
			string += temp.data + ", ";
			temp = temp.next;
		}
		if(string != "") {
			System.out.println("[" + string.substring(0,string.length()-2) + "]");
		}else {
			System.out.println("[]");
		}
	}
	
	public boolean append(int data) {
		Node newNode = new Node(data);
		if(this.length == 0) {
			this.head = newNode;
			this.tail = newNode;
		}else {
			this.tail.next = newNode;
			this.tail = newNode;
		}
		this.length += 1;
		return true;
	}
	
	public boolean prepend(int data) {
		Node newNode = new Node(data);
		Node temp = this.head;
		if(this.length == 0) {
			this.head = newNode;
			this.tail = newNode;
		}else {
			this.head = newNode;
			this.head.next = temp;
		}
		this.length += 1;
		return true;
	}
	
	public Node pop() {
		if(this.length == 0) return null;
		Node temp = this.head;
		Node pre = this.head;
		while(temp.next != null) {
			pre = temp;
			temp = temp.next;
		}
		pre.next = null;
		this.tail = pre;
		this.length -= 1;
		if(this.length == 0) {
			this.head = null;
			this.tail = null;
		}
		return temp;
	}
	
	public Node popFirst() {
		if(this.length == 0) return null;
		Node temp = this.head;
		this.head = temp.next;
		temp.next = null;
		this.length -= 1;
		if(this.length == 0) {
			this.head = null;
			this.tail = null;
		}
		return temp;
	}
	
	public Node get(int index) {
		if(index < 0 || index >= this.length) return null;
		Node temp = this.head;
		for(int i = 0; i < index; i++) {
			temp = temp.next;
		}
		return temp;
	}
	
	public boolean set(int index, int data) {
		Node temp = get(index);
		if(temp != null) {
			temp.data = data;
			return true;
		}
		return false;
	}
	
	public boolean insert(int index, int data) {
		if(index < 0 || index >= this.length) return false;
		if(index == 0) return this.prepend(data);
		if(index == this.length) return this.append(data);
		Node newNode = new Node(data);
		Node pre = get(index-1);
		newNode.next = pre.next;
		pre.next = newNode;
		this.length += 1;
		return true;
	}
	
	public Node remove(int index) {
		if(index < 0 || index > this.length) return null;
		if(index ==0) return this.popFirst();
		if(index == this.length) return this.pop();
		Node cur = get(index);
		Node pre = get(index - 1);
		pre.next = cur.next;
		pre.next = null;
		this.length -= 1;
		return cur;
	}
	
	public void reverse() {
		Node temp = this.head;
		this.head = this.tail;
		this.tail = temp;
		Node after = temp.next;
		Node before = null;
		for(int i = 0; i < this.length; i++) {
			after = temp.next;
			temp.next = before;
			before = temp;
			temp = after;
		}
	}
}
