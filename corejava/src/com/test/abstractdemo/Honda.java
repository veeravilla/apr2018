package com.test.abstractdemo;

public class Honda extends Car {
	
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

}
