package com.test.corejava;

public class Employee {
	
	int eno;
	private String ename;
	private double salary;
	
	public Employee(int eno) {
		this.eno = eno;
	}
	
	public int getEno() {
		return eno;
	}

	public void setEno(int eno) {
		this.eno = eno;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		//Audit Logic
		this.ename = ename;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public Employee() {
		//no
	}
	
	public Employee(int eno, String ename, double salary) {
		this.eno = eno;
		this.ename = ename;
		this.salary = salary;
	}


	public void printDetails() {
		System.out.println(" Eno : " + eno + " Ename " + ename +" Salary :" + salary);
	}

}
