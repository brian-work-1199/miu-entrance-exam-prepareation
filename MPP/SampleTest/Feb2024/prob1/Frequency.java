package MPP.SampleTest.Feb2024.prob1;
import java.util.*;
public class Frequency {
	/**
	 * Returns a frequencyTable for the input list. Implementation must 
	 * be based on recursion.
	 */
	public HashMap<Integer, Integer> recurFreqTable(LinkedList<Integer> list) {
		//implement
		return null;
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
