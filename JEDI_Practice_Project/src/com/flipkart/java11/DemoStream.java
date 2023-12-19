/**
 * 
 */
package com.flipkart.java11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 
 */
public class DemoStream {

	/**
	 * @param args
	 */
	static List<Integer> intList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		beforeJava8();
		fromJava8();

	}
	private static void beforeJava8() {
		List<Integer> evenList = new ArrayList<>();
		for (int i : intList) {
			if (i % 2 == 0) {
				evenList.add(i);
			}
		}
		System.out.println("beforeJava8 evenList : " + evenList);
	}

	private static void fromJava8() {
		System.out.println(
				"fromJava8 evenList : " + intList.stream().filter(i -> i % 2 == 0).collect(Collectors.toList()));
	}

}
