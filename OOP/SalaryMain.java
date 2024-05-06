package OOP;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

public class SalaryMain {

    public static void main (String [] args) {
        List<Employee> employeeList = new ArrayList<>();
        Employee employee = new Employee();
        employee.setAge(20);
        employee.setName("nhat");
        employee.setSalary(30000d);
        employeeList.add(employee);

        Employee employee1 = new Employee();
        employee1.setAge(30);
        employee1.setName("Thinh");
        employee1.setSalary(40000d);
        employeeList.add(employee1);

        List<Manager> managerList = new ArrayList<>();
        Manager manager = new Manager();
        manager.setAge(20);
        manager.setName("nhat");
        manager.setSalary(30000d);
        manager.setSex("Male");
        managerList.add(manager);

        List<Employee> combineList = new ArrayList<>();
        combineList.addAll(employeeList);
        combineList.addAll(managerList);

        Double sumOfSalary = 0d;
        for (Employee e : combineList) {
            sumOfSalary += e.getSalary();
        }

        System.out.println("salary = " + sumOfSalary);


    }
}
