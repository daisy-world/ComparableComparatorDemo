package com.app.ComparableComparatorDemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
	
	@GetMapping("/employees")
	
	public List<Employee> showUsers() {
		
		List<Employee> list = getEmployeeList();	
		//Collections.sort(list);
		//Collections.sort(list , new SalaryComparator());
	
		//Collections.sort(list, (Employee e1, Employee e2) -> e1.getName().compareTo(e2.getName()));
		list.sort(Comparator.comparing(Employee::getAge));
		return list;
		
		
	}
	
	
	public List<Employee> getEmployeeList(){
		
		List<Employee> list = new ArrayList<Employee>();
		Employee emp1 = new Employee("A","BBSR",25,50000);
		Employee emp2 = new Employee("B","DELHI",28,30000);
		Employee emp3 = new Employee("C","MUMBAI",30,40000);
		Employee emp4 = new Employee("D","BENGALURU",45,60000);
		Employee emp5 = new Employee("E","KOLKATA",50,70000);
		list.add(emp1);
		list.add(emp2);
		list.add(emp3);
		list.add(emp4);
		list.add(emp5);
		return list;
		
		
		
	}

}
