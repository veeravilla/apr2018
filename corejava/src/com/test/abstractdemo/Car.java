package com.test.abstractdemo;

public abstract class Car {
	
	public abstract void start();
	
	public void stop() {
		System.out.println(" <<<<<  Stop >>>>>");
	}
	
	public void move() {
		System.out.println(" <<<<<  Move >>>>>");
	}
	
	public void execute() {
		start();
		move();
		stop();
	}

}
