package com.test.interfacedemo;

public class Honda implements Car {
	
	public void move() {
		System.out.println(" <<<<<  Honda Move >>>>>");
	}
	
	public void bkCm() {
		System.out.println(" <<<<<<<<< Honda Backup Camera >>>>>>>>>>>>");
	}

	@Override
	public void start() {
		System.out.println(" <<<<<<<<< Honda Start () ... >>>>>>>>>>>>");
		
	}

	@Override
	public void stop() {
		System.out.println(" <<<<<<<<< Honda Stop () ... >>>>>>>>>>>>");
		
	}

}
