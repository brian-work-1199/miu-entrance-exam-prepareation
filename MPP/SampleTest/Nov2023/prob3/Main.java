package MPP.SampleTest.Nov2023.prob3;

import java.util.*;
public class Main {

	/* Combines the lists that are populated here into a single list
	 * and pass to computeSumOfSalaries
	 * 
	 * Expected output: 1035500.0
	 */
	public static void main(String[] args) {
		List<Employee> emps = new ArrayList<>();
		emps.add(new Employee("John", 110000));
		emps.add(new Employee("Tom", 110000));
		emps.add(new Employee("Edward", 120000));
		emps.add(new Employee("Rich",90000));
		emps.add(new Employee("Kevin", 100000));

		List<Manager> managers = new ArrayList<>();
		managers.add(new Manager("Andrew", 110000, 10000));
		managers.add(new Manager("Rabelais", 130000, 5500));
		managers.add(new Manager("Phil", 135000, 12000));
		managers.add(new Manager("Tony",95000, 8000));
		
		
		double salarySum = 0.0;
		//implement by combining the lists above into a single list and passing to 
		//computeSumOfSalaries below
		List<Object> lists = new ArrayList<>();
		lists.addAll(emps);
		lists.addAll(managers);
		//double salarySum = Statistics.computeSumOfSalaries(/*implement */);
		System.out.println(salarySum);
		
	}


}
