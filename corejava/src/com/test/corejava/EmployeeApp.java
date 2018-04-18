package com.test.corejava;

public class EmployeeApp {

	public static void main(String[] args) {
		Employee emp = new Employee(101);
		emp.setEname("Rajesh");
		emp.setSalary(56756);
		
		
		emp.printDetails();
		
		Employee emp1 = new Employee(102,"Krishna",6700);
		
		//Audit Logic
		//emp1.ename = "Ananth";
		
		emp1.printDetails();

	}

}
