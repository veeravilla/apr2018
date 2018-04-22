package com.test.util.examples;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;

import com.test.abstractdemo.Audi;
import com.test.oopsdemo.Car;

public class SetExample {

	public static void main(String[] args) {
		
		Set<String> strSet = new HashSet<String>();
		
		strSet.add("Rama");
		strSet.add("Tim");
		strSet.add("Jhon");
		
		strSet.add("Rama");
		strSet.add("Tim");
		strSet.add("Jhon");
		
		
		strSet.add("Rama");
		strSet.add("Tim");
		strSet.add("Jhon");

	
		System.out.println( " Data   " + strSet);	

	}

}
