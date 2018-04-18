package com.test.corejava;

public class CarApp {

	public static void main(String[] args) {
		
		Car c = new Car();
		c.start();
		c.move();
		c.stop();
		
		LuxCar l = new LuxCar();
		l.start();
		l.audio();
		l.backCam();
		l.stop();
		
		
		SportsCar s = new SportsCar();
		s.start();
		s.controlSpeed();
		s.stop();

	}

}
