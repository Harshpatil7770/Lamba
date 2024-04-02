package com.java.lambawithcoll;

public class Employee {

	private long empId;
	
	private String empName;
	
	private int age;
	
	public Employee(long empId,String empName,int age) {
		this.empId=empId;
		this.empName=empName;
		this.age=age;
	}
	
	public long getEmpId() {
		return empId;
	}
	
	public String getEmpName() {
		return empName;
	}
	
	public long getAge() {
		return age;
	}
	
	@Override
	public String toString() {
		return "Employee [ id : "+empId+" , name "+empName+" , age "+age+" ]";
	}
}
