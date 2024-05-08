package MPP.SampleTest.Feb2024.prob2;

import java.util.*;

public class Lists {
	/**
	 * Returns, in sorted order, the union of those lists L in the input list of lists 
	 * for which the following requirements are satisfied:
	 * (1) in L there are num1 or more occurrences of the String word1
	 * (2) in L there are fewer than num2 occurrences of the String word2
	 */
	public static List<String> extractList(List<List<String>> lists, String word1, int num1, String word2, int num2) {
		return null;
	}
	
	public static void main(String[] args) {
		example1();
		example2();
		
	}
	//expected output:
	//[cat, cat, dog, mouse]
	static void example1() {
		String[][] strings = {{"cat", "dog", "mouse", "cat"},{"cat","cat", "horse", "cat", "bug"},
				{"caterpillar", "horse","dog", "fly"},{"gorilla", "tiger", "cat","bug","cat"}};
		List<List<String>> input = new ArrayList<>(4);
		for(int i = 0; i<strings.length; ++i) {
			input.add(Arrays.asList(strings[i]));
		}
		List<String> output = extractList(input, "cat", 2, "bug", 1);
		System.out.println(output);
	}
	
	//expected output:
	//[caterpillar, dog, dog, dog, fly, horse, horse, tree]
	static void example2() {
		String[][] strings = {{"cat", "dog", "mouse", "cat"},{"cat","cat", "horse", "cat", "bug"},
				{"caterpillar", "horse","dog", "fly"},{"gorilla", "tiger", "cat","bug","cat"},
				{"dog", "dog", "tree", "horse"}};
		List<List<String>> input = new ArrayList<>(4);
		for(int i = 0; i<strings.length; ++i) {
			input.add(Arrays.asList(strings[i]));
		}
		List<String> output = extractList(input, "dog", 1, "cat", 2);
		System.out.println(output);
	}
}
