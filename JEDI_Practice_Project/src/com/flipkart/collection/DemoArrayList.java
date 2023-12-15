
package com.flipkart.collection;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Dell
 *
 */
public class DemoArrayList {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub

				// Craete the Collection Object here 
		List<String> list=new ArrayList<String>();
 		// add the record 
 		System.out.println("size of collection-->" +list.size());
		list.add("AMit");
		list.add("priti");
		list.add("vinay");
		list.add("vinay");
		//list.add(101);
 		System.out.println("size of collection-->" +list.size());
		//list.add(102);
 		// remove   // by index // value 
 		list.remove("priti");
 		System.out.println("size of collection-->" +list.size());
 		// Iteration of colection  list of cooletion 
 		for(String str : list) {
 			System.out.println("data-->" +str);
		}
		 	}

		}