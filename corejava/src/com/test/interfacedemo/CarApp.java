package com.test.interfacedemo;

public class CarApp {

	public static void main(String[] args) {
		
		Car c = new Audi();
		c.start();
		c.stop();
		c.move();
		
		if(c instanceof LuxCar) {
			System.out.println("<<<<<<<<<< Lux Car >>>>>>>>>>>");
		}
		
		if(c instanceof SportsCar) {
			System.out.println("<<<<<<<<<< Sports Car >>>>>>>>>>>");
		}

	}
	
	
	

}
