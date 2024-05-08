package MPP.DSA;

//import DSA.Node;

public class DoubleLinkedList {
	
	Node head;
	Node tail;
	int length;

	DoubleLinkedList (int data){
		Node newNode = new Node(data);
		this.head = newNode;
		this.tail = newNode;
		this.length = 1;
	}
	
	public String toString() {
		String string = "";
		Node temp = this.head;
		while(temp!=null) {
			string += temp.data + ", ";
			temp = temp.next;
		}
		if(string != "") {
			string = "[" + string.substring(0,string.length()-2) + "]";
		}else {
			string = "[]";
		}
		return string;
	}
	
	public boolean append(int data) {
		Node newNode = new Node(data);
		if(this.length == 0) {
			this.head = newNode;
			this.tail = newNode;
		}else {
			this.tail.next = newNode;
			newNode.pre = this.tail;
			this.tail = newNode;
		}
		this.length += 1;
		return true;
	}
	
	public boolean prepend(int data) {
		Node newNode = new Node(data);
		if(this.length == 0) {
			this.head = newNode;
			this.tail = newNode;
		}else {
			newNode.next = this.head;
			this.head.pre = newNode;
			this.head = newNode;
		}
		this.length += 1;
		return true;
	}
	
	public Node pop() {
		if(this.length == 0) return null;
		Node temp = this.tail;
		if(this.length == 1) {
			this.head = null;
			this.tail = null;
		}else {
			this.tail = this.tail.pre;
			this.tail.next = null;
			temp.pre = null;
		}
		this.length -= 1;
		return temp;
	}
	
	public Node popFirst() {
		if(this.length == 0) return null;
		Node temp = this.head;
		if(this.length == 1) {
			this.head = null;
			this.tail = null;
		}else {
			this.head = this.head.next;
			this.head.pre = null;
			temp.next = null;
		}
		this.length -= 1;
		return temp;
	}
	
	public Node get(int index) {
		if(index < 0 || index >= this.length) return null;
		Node temp = this.head;
		if(index < this.length/2) {
			for(int i = 0; i < index; i++) {
				temp = temp.next;
			}
		}else {
			temp = this.tail;
			for(int i = this.length - 1; i > index; i--) {
				temp = temp.pre;
			}
		}
		return temp;
	}
	
	public boolean set(int index, int data) {
		if(index < 0 || index >= this.length) return false;
		Node temp = get(index);
		if(temp!=null) {
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
		Node before = get(index-1);
		Node after = before.next;
		
		newNode.pre = before;
		newNode.next = after;
		before.next = newNode;
		after.pre = newNode;
		this.length += 1;
		return true;
	}
	
	public Node remove(int index) {
		if(index < 0 || index >= this.length) return null;
		if(index == 0) return this.popFirst();
		if(index == this.length - 1) return this.pop();
		
		Node temp = get(index);
		
		temp.next.pre = temp.pre;
		temp.pre.next = temp.next;
		temp.next = null;
		temp.pre = null;
		this.length -= 1;
		return temp;
	}
	
	public void reverse() {
        Node current_node = this.head;
        while (current_node != null) {
            Node temp_next = current_node.next;
            current_node.next = current_node.pre;
            current_node.pre = temp_next;
            current_node = temp_next;
        }
        Node temp = this.head;
        this.head = this.tail;
        this.tail = temp;
	}
}
