package com.java.withreturntype;

public class Test {

	public static void main(String[] args) {
		Addition addition=(a,b)-> a+b;
		
		System.out.println("Here is the result "+addition.getResult(0, 0));
	}
}
