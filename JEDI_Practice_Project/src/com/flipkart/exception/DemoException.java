/**
 * 
 */
package com.flipkart.exception;

/**
 * 
 */
public class DemoException {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		try {
			int a, b, c;
			a = 10;
			b = 0;
			
			c = a / b;
			System.out.println("Output of c: " + c);
		} catch (Exception ex) {
			System.out.println("Exception raised because of invalid operation." + ex.getMessage());
		}
	}

}
