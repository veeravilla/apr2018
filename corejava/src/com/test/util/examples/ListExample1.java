package com.test.util.examples;

import java.util.ArrayList;
import java.util.List;

import com.test.abstractdemo.Audi;

public class ListExample1 {

	public static void main(String[] args) {
		
		List listRef = new ArrayList();
		
		listRef.add(10);
		listRef.add("Rama");
		listRef.add("Tim");
		listRef.add("Jhon");
		listRef.add(new Audi());
		
		for(Object obj:listRef) {
			if(obj instanceof Integer) {
				Integer val = (Integer) obj;
				
				System.out.println(" Increment " + (val+1));
			}
			
			if(obj instanceof String) {
				String data = (String) obj;
				
				System.out.println(data.toUpperCase());
			}
			
			if(obj instanceof Audi) {
				Audi carRef = (Audi) obj;
				carRef.start();
			}
		}
			

	}

}
