package com.test.util.examples;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import com.test.abstractdemo.Audi;
import com.test.oopsdemo.Car;

public class ListExample2 {

	public static void main(String[] args) {
		
		List<String> strList = new ArrayList<String>();
		
		List<String> removeList = new ArrayList<String>();
		
		strList.add("Rama");
		strList.add("Tim");
		strList.add("Jhon");
		
		strList.add("Rama");
		strList.add("Tim");
		strList.add("Jhon");
		
		
		strList.add("Rama");
		strList.add("Tim");
		strList.add("Jhon");

		
		if(strList.contains("Jhon")) {
			System.out.println(" Element Found !!!!");
		}
	/*	for(int i=0;i<5; i++) {
			System.out.println(strList.get(i).toUpperCase());
			//Add New
			//strList.add("Krishna");
		} */
		
		for(String str:strList) {
			System.out.println(str.toUpperCase());
			if(str.equals("Rama")) {
				removeList.add(str);
			}
			//Delete , Add not allowed
		}
		
		strList.removeAll(removeList);
		
		/*Iterator<String> itrObj = strList.iterator();
		
		while(itrObj.hasNext()) {
			String str = itrObj.next();
			if(str.equals("Rama")) {
				itrObj.remove();	
			}
		}

		
		ListIterator<String> listIterator = strList.listIterator();
		while(listIterator.hasNext()) {
			String str = listIterator.next();
			if(str.equals("Jhon")) {
				listIterator.add("FJhon");	
			}
		}*/
		
		
		System.out.println( " Before Sort  " + strList);
		
		Collections.sort(strList);

		System.out.println( " After Sort  " + strList);	

	}

}
