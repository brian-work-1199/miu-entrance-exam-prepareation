package MPP.SampleTest.Nov2023.prob1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RecurQuestion {

	/**
	 * Recursively moves elements from list1 to list2 until 
	 * list2 has the same size as list1, or has size that is just
	 * one bigger than size of list1. Initially, list2 is empty
	 * and list1 has one or more elements.
	 * @param list1
	 * @param list2
	 * @return
	 */
	public static List[] move(List<String> list1, List<String> list2) {
		//implement
		return null;
	}
	
	public static void printArray(List[] lists) {
		if(lists==null || lists.length == 0) {
			return;
		}
		for(List list:lists) {
			System.out.println(list);
		}
	}
	
	//expected output:
	//        [steam, telephone, kitchen]
	//        [apple, bucket, elephant, tree]
	public static void main(String[] args) {
		List<String> list1 = new ArrayList<>(Arrays.asList("apple", 
				"bucket", "elephant", "tree", "steam","telephone", "kitchen"));
		List<String> list2 = new ArrayList<>();
		printArray(move(list1,list2));
	}

}
