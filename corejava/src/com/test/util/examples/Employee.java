package com.test.util.examples;

public class Employee implements Comparable<Employee>{

	private int eno;
	private String ename;
	private double salary;

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
		this.ename = ename;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((ename == null) ? 0 : ename.hashCode());
		result = prime * result + eno;
		long temp;
		temp = Double.doubleToLongBits(salary);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		System.out.println(" HAsh Code " + result);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		return false;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public Employee(int eno) {
		super();
		this.eno = eno;
	}

	public Employee(int eno, String ename, double salary) {
		super();
		this.eno = eno;
		this.ename = ename;
		this.salary = salary;
	}

	public Employee() {
		super();
	}
	
	@Override
	public String toString() {
		return "Employee [eno=" + eno + ", ename=" + ename + ", salary=" + salary + "]";
	}

	@Override
	public int compareTo(Employee obj) {
		if(this.eno > obj.getEno())
			return 1;
		else if(this.eno == obj.getEno())
			return 0;
		else
			return -1;
	}

}
