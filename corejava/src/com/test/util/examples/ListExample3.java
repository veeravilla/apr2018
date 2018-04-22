package com.test.util.examples;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class ListExample3 {

	public static void main(String[] args) {
		
		List<Employee> empList = new LinkedList<>();//new ArrayList<Employee>();
		
		
		Employee e1 = new Employee(101,"Rama",4567);
		Employee e2 = new Employee(101,"Rama",4567);
		
		if(e1.equals(e2)) 
			System.out.println("Both are Equal");
		else
			System.out.println("Not Equal");
		
		System.out.println(e1);
		
		empList.add(new Employee(101,"Rama",4567));
		empList.add(new Employee(121,"Jhon",8989));
		empList.add(new Employee(5,"Tim",12));
		empList.add(new Employee(141,"Tao",345));
		empList.add(new Employee(793,"Rama",342));
		empList.add(new Employee(90,"Steve",2343243));
		empList.add(new Employee(67,"Ken",56767));
		
		System.out.println(" Before Sort" + empList);
		
		Collections.sort(empList,new EmployeeSort());

		System.out.println(" After Sort" + empList);
		
		if(empList.contains(e1)) {
			System.out.println("Element Found !!!!! ");
		}
		
			

	}

}
