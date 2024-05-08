package MPP.SampleTest.Nov2022.prob1;

import java.util.LinkedList;

/**
 * Recursively merges two sorted linked lists
 *
 */
public class Merge {
	public LinkedList<Integer> merge(LinkedList<Integer> list1, LinkedList<Integer> list2) {
		LinkedList<Integer> mergedList = new LinkedList<>();
		mergeRecursive(list1, list2, mergedList);
		return mergedList;
	}

	private void mergeRecursive(LinkedList<Integer> list1, LinkedList<Integer> list2, LinkedList<Integer> mergedList) {
		// Base cases: if one of the lists is empty, append the remaining elements of the other list and return
		if (list1.isEmpty()) {
			mergedList.addAll(list2);
			return;
		}
		if (list2.isEmpty()) {
			mergedList.addAll(list1);
			return;
		}

		// Compare the first elements of both lists
		Integer elem1 = list1.getFirst();
		Integer elem2 = list2.getFirst();
		if (elem1 <= elem2) {
			mergedList.add(elem1);
			list1.removeFirst(); // Remove the first element from list1
			mergeRecursive(list1, list2, mergedList);
		} else {
			mergedList.add(elem2);
			list2.removeFirst(); // Remove the first element from list2
			mergeRecursive(list1, list2, mergedList);
		}
	}
	//test your code
	//Expected output:  [2, 4, 5, 9, 17, 21, 25]
	public static void main(String[] args) {
		LinkedList<Integer> list1 = new LinkedList<>();
		LinkedList<Integer> list2 = new LinkedList<>();
		list1.add(4);list1.add(5);list1.add(21);list1.add(25);
		list2.add(2);list2.add(9);list2.add(17);
		Merge m = new Merge();
		LinkedList<Integer> list3 = m.merge(list1, list2);
		if(list3 != null) System.out.println(list3);
		
	}
}
