package com.test.interfacedemo;

public class CarApp {

	public static void main(String[] args) throws Exception {
		
		Car c =null;
		Object obj =null;
		
		if(args.length == 1) {
			String carClassName = args[0];
			Class classObj = Class.forName(carClassName);
			obj = classObj.newInstance();
		}else
			System.exit(8787);
		
		
		c = (Car)obj;
		
		/*if( args[0].equals("Audi"))
			c = new Audi();
		else if(args[0].equals("BMW"))
			c = new BMW();
		else
			c= new Honda();*/
		
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
