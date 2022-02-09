/**
 * 
 */
package com.lt.Array;

/**
 * @author user208
 *
 */
public class DemoArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int arrayOfInt[] = new int[] {2, 3, 5};
	       for (int i = 0; i < arrayOfInt.length; i++) {
	        System.out.println("The " + i + " element has value  : " + arrayOfInt[i]);
	       }
	       
	       String names[] = new String[] {"Shakir", "Priyanka", "Sumeet"};
	       
	       for (int i = 0; i < names.length; i++) {
	         System.out.println("The " + i + " name is : " + names[i]);
	       }
		

	}

}
