package com.java.noparameterized;

public class Bike implements Speed{
	
	@Override
	public void setDesc() {
		System.out.println("Pulsur 150");
	}

	public static void main(String[] args) {
		Speed speed=new Bike(); 
		speed.setDesc();
	}
}
