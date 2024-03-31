package com.java.twoparameterized;

public class Test {

	public static void main(String[] args) {
		
		Speed speed = (speedLimtNoGears, speedLimtWithGears) -> {
			System.out.println("Max SpeedLimit of NoGears biked = " + speedLimtNoGears
					+ " and Max SpeedLimit of Gears biked = " + speedLimtWithGears);
		};
		speed.setSpeed(90,120);
	}
}
