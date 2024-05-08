package MPP;

//import DSA.Node;

public class StackLL {
	
	Node top;
	int height;
	
	StackLL(int data){
		Node newNode = new Node(data);
		this.top = newNode;
		this.height = 1;
	}
	
	public String toString() {
		String string = "";
		Node temp = this.top;
		while(temp!=null) {
			string += " " + temp.data;
			temp = temp.next;
		}
		return string;
	}

	public void push(int data) {
		Node newNode = new Node(data);
		if(this.height == 0) {
			this.top = newNode;
		}else {
			newNode.next = this.top;
			this.top = newNode;
		}
		this.height += 1;
	}
	
	public Node pop() {
		if(this.height == 0) return null;
		Node temp = this.top;
		if(this.height == 1) {
			this.top = null;
		}else {
			this.top = this.top.next;
			temp.next = null;
		}
		this.height -= 1;
		return temp;
	}
	
	public Node peak() {
		return this.top;
	}
	
	public boolean isEmpty() {
		return height == 0;
	}
	
//	public boolean isFull() {
//		return height == array.length;
//	}
}
