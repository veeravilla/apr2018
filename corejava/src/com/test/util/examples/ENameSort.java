package com.test.util.examples;

import java.util.Comparator;

public class ENameSort implements Comparator<Employee> {

	@Override
	public int compare(Employee obj1, Employee obj2) {
		return obj1.getEname().compareTo(obj2.getEname());
	}

}
