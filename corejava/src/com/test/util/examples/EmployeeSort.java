package com.test.util.examples;

import java.util.Comparator;

public class EmployeeSort implements Comparator<Employee> {

	@Override
	public int compare(Employee obj1, Employee obj2) {
		if(obj1.getEno() > obj2.getEno() && obj1.getEname().compareTo(obj2.getEname()) ==1)
			return 1;
		else if (obj1.getEno() == obj2.getEno() && obj1.getEname().equals(obj2.getEname()))
			return obj1.getEname().compareTo(obj2.getEname());
		else
			return -1;
		
	}

}
