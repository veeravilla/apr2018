package com.test.util.examples;

import java.util.HashSet;
import java.util.Set;

public class SetExample2 {

	public static void main(String[] args) {
		
		Set<Employee> empSet = new HashSet<Employee>();//new ArrayList<Employee>();
		
		

		empSet.add(new Employee(101,"Rama",4567));
		empSet.add(new Employee(121,"Jhon",8989));
		empSet.add(new Employee(5,"Tim",12));
		empSet.add(new Employee(141,"Tao",345));
		empSet.add(new Employee(793,"Rama",342));
		empSet.add(new Employee(90,"Steve",2343243));
		empSet.add(new Employee(67,"Ken",56767));
		
		
		empSet.add(new Employee(101,"Rama",4567));
		empSet.add(new Employee(121,"Jhon",8989));
		empSet.add(new Employee(5,"Tim",12));
		empSet.add(new Employee(141,"Tao",345));
		empSet.add(new Employee(793,"Rama",342));
		empSet.add(new Employee(90,"Steve",2343243));
		empSet.add(new Employee(67,"Ken",56767));
		
		System.out.println("Size ... " + empSet.size());
		
		System.out.println("Set Values" + empSet);
		
		
			

	}

}
