package MPP.SampleTest.Feb2024.prob1;
import java.util.*;
public class Frequency {
	/**
	 * Returns a frequencyTable for the input list. Implementation must 
	 * be based on recursion.
	 */
	public HashMap<Integer, Integer> recurFreqTable(LinkedList<Integer> list) {
		//implement
		HashMap<Integer, Integer> frequencyTable = new HashMap<>();
		if (list.isEmpty()) {
			return frequencyTable; // Return an empty frequency table if the list is empty
		} else {
			// Process the first element in the list
			int firstElement = list.removeFirst();
			System.out.println("first element: " + firstElement);
			// Recursively process the rest of the list
			frequencyTable = recurFreqTable(list);
			System.out.println("frequency table: " + frequencyTable);
			// Update the frequency table
			System.out.println("update frequency table: " +frequencyTable.put(firstElement, frequencyTable.getOrDefault(firstElement, 0) + 1));

		}
		return frequencyTable;
	}
	
	//expected output:
	//{3=3, 4=1, 8=4, 9=1}
	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<>();
		list.add(8);
		list.add(4);
		list.add(3);
		list.add(8);
		list.add(3);
		list.add(9);
		list.add(3);
		list.add(8);
		list.add(8);
		Frequency m = new Frequency();
		HashMap<Integer, Integer> h = m.recurFreqTable(list);
		System.out.println(h);
		

	}

}
