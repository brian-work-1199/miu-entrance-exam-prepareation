package MPP;

public class StackArray {
	int size;
	int capacity = 10;
	Object[] array;
	
	StackArray(){this.array = new Object[capacity];}
	
	StackArray(int capacity) {
		this.capacity = capacity;
		this.array = new Object[capacity];
	}
	
	public void push(Object data) {
		if(size >= capacity) grow();
		array[size] = data;
		size++;
	}
	
	public Object pop() throws Exception {
		if(size == 0) throw new Exception("Stack is empty!");
		Object data = array[size-1];
		array[size-1] = null;
		size--;
		if(size  < (int) (capacity/3)) {
			shrink();
		}
		return data;
	}
	
	public Object peak() throws Exception {
		if(size == 0) throw new Exception("Stack is empty!");
		return array[size-1];
	}
	
	public boolean isEmpty() {
		return size == 0;
	}
	
	public boolean isFull() {
		return size == array.length;
	}

	private void shrink() {
		int newCapacity = (int) capacity/2;
		Object[] newArray = new Object[newCapacity];
		for(int i = 0; i < size; i++) {
			newArray[i] = array[i];
		}
		capacity = newCapacity;
		array = newArray;
		
	}

	private void grow() {
		int newCapacity = capacity*2;
		Object[] newArray = new Object[newCapacity];
		for(int i = 0; i < size; i++) {
			newArray[i] = array[i];
		}
		capacity = newCapacity;
		array = newArray;
	}
	
	public String toString() {
		String string = "";
		for(int i = 0; i < capacity; i++) {
			string += array[i] + ", ";
		}
		if(string != "") {
			string =  "[" + string.substring(0, string.length() - 2) + "]";
		}else {
			string = "[]";
		}
		return string;
	}
}
