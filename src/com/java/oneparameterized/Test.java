package com.java.oneparameterized;

public class Test {

	public static void main(String[] args) {
		Speed speed=(bikeSpeed) -> {
				System.out.println("bikeSpeed >> "+bikeSpeed);
		};
		
		speed.setSpeed(1);
	}
}
