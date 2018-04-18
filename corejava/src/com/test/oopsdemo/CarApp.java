package com.test.oopsdemo;

public class CarApp {

	public static void main(String[] args) {
		
		Car c = new Audi();
		execute(c);
		
		Car honda = new Honda();
		execute(honda);

	}
	
	public static  void execute(Car carRef) {
		carRef.start();
		carRef.move();
		carRef.stop();
		if(carRef instanceof Honda) {
			Honda hondaRef = (Honda) carRef;
			hondaRef.bkCm();
		}
	}
	
	/*public static  void executeHonda(Honda c) {
		c.start();
		c.move();
		c.stop();
	}
	
	public static  void executeAudi(Audi c) {
		c.start();
		c.move();
		c.stop();
	}
	
	public static  void executeBMW(BMW c) {
		c.start();
		c.move();
		c.stop();
	}*/
	
	

}
