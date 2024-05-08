package MPP.SampleTest.Nov2022.prob2;

/**
 * Implement the add, remove, and toString methods of this class 
 *
 */
public class MyArrayList {
	//DO NOT MODIFY THIS LINE OF CODE
	private String[] arr = new String[8];
	int size = 0;
	
	
	//Adds String s to the end of the list
	public void add(String s) {
		//implement
		if (size == arr.length) {
			resize(); // Resize the array if it's full
		}
		arr[size++] = s; // Add the string to the end of the array and increment size
	}
	
	//Removes and returns the String that is in position k in the list
	public String remove(int k) {
		//implement
		if (k < 0 || k >= size) {
			throw new IndexOutOfBoundsException("Index " + k + " out of bounds for length " + size);
		}
		String removed = arr[k]; // Store the string to be removed
		for (int i = k; i < size - 1; i++) {
			arr[i] = arr[i + 1]; // Shift elements to the left to fill the gap
		}
		arr[--size] = null; // Decrement size and set the last element to null
		return removed;
	}
	
	//Returns a string representation of this list
	//
	//Example: After you add Strings 
	//    Bob
	//    Steve
	//    John
	//to an initially empty list, the output of the toString() method
	//should be:
	//   [Bob, Steve, John]
	//
	//Example: If your list has no remaining elements, output of
	//to String() should be:
	//    [ ]
	public String toString() {
		//implement
		return null;
	}
	
	//DO NOT MODIFY
	public String get(int i) throws Exception {
		try {
			return arr[i];
		} catch(NullPointerException e1) {
			throw new Exception("NullPointerException");
			
		} catch(ArrayIndexOutOfBoundsException e2) {
			throw new Exception("ArrayIndexOutOfBoundsException");
		}
	}
	
	//Test your code using this main method 
	public static void main(String[] args) {
		testZeroElements();
		testAdd();
		testRemoveFromEnd();
		testRemoveFromFront();
		testRemoveFromMiddle();
		testResize();
	}
	
	//expected output:  []
	public static void testZeroElements() {
		MyArrayList list = new MyArrayList();
		System.out.println(list);
	}
	
	//expected output: [Joe, Bob, Steve]
	public static void testAdd() {
		MyArrayList list = new MyArrayList();
		list.add("Joe");
		list.add("Bob");
		list.add("Steve");
		System.out.println(list);
	}
	//expected output [Joe, Bob]
	public static void testRemoveFromEnd() {
		MyArrayList list = new MyArrayList();
		list.add("Joe");
		list.add("Bob");
		list.add("Steve");
		list.remove(2);
		System.out.println(list);
	}
	//expected output: [Bob, Steve]
	public static void testRemoveFromFront() {
		MyArrayList list = new MyArrayList();
		list.add("Joe");
		list.add("Bob");
		list.add("Steve");
		list.remove(0);
		System.out.println(list);
	}
	//expected output:  [Joe, Steve]
	public static void testRemoveFromMiddle() {
		MyArrayList list = new MyArrayList();
		list.add("Joe");
		list.add("Bob");
		list.add("Steve");
		list.remove(1);
		System.out.println(list);
	}
	
	//expected: no exception is thrown
	public static void testResize() {
		MyArrayList list = new MyArrayList();
		try {
			list.add("Joe");
			list.add("Bob");
			list.add("Steve");
			list.add("Joey");
			list.add("Bobby");
			list.add("Stevie");
			list.add("Tony");
			list.add("Tom");
			list.add("Tania");
			list.add("Dave");
			list.add("Dick");
			list.add("Rich");
			System.out.println(list);
		} catch(Exception e) {
			System.out.println("Exception trying to add 12 Strings to the list: " 
					+ e.getClass().getSimpleName());
		}	
	}
}
