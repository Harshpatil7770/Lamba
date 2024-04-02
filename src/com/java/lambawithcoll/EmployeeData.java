package com.java.lambawithcoll;
import java.util.*;
public class EmployeeData {

	public static void main(String args[]) {
		
		List<Employee> empLists=new ArrayList<>();
		empLists.add(new Employee(1,"Harsh",21));
		empLists.add(new Employee(6,"Patil",24));
		empLists.add(new Employee(2,"Jack",21));
		empLists.add(new Employee(4,"Maven",25));
		empLists.add(new Employee(9,"Robin",21));
		
		System.out.println("Available Employee Lists ");
		System.out.println("Lamba is getting used in collection to iterate the list of Employee ");
		empLists.forEach((e) -> {
			System.out.println(e);
		});
	}
}
