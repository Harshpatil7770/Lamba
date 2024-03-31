package com.java.noparameterized;

public class Test {

	//no parameterized lambda expression , here we don't need to right
	//any argument inside the agrument block.
	public static void main(String[] args) {

		Speed speed = () -> {
			System.out.println("20Km per hr");
		};
		speed.setDesc();		
	
	}
	
}
