package com.test.interfacedemo;

public class BMW  implements Car,SportsCar{
	
	public void start() {
		System.out.println(" <<<<<  BMW Start >>>>>");
	}
	
	public void stop() {
		System.out.println(" <<<<<  BMW Stop >>>>>");
	}
	
	public void move() {
		System.out.println(" <<<<<  BMW Move >>>>>");
	}

}
