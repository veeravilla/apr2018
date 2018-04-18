package com.test.interfacedemo;

public class Audi implements Car,LuxCar,SportsCar{
	
	public void start() {
		System.out.println(" <<<<<  Audi Start >>>>>");
	}
	
	public void stop() {
		System.out.println(" <<<<<  Audi Stop >>>>>");
	}
	
	public void move() {
		System.out.println(" <<<<<  Audi Move >>>>>");
	}

}
