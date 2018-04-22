package com.test.util.examples;

import java.util.Comparator;

public class SalarySort implements Comparator<Employee> {

	@Override
	public int compare(Employee obj1, Employee obj2) {
		if(obj1.getSalary() > obj2.getSalary())
			return 1;
		else if (obj1.getSalary() == obj2.getSalary())
			return 0;
		else
			return -1;
	}

}
