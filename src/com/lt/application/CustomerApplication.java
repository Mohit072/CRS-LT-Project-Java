/**
 * 
 */
package com.lt.application;

import java.util.Scanner;

import com.lt.business.CustomerBusiness;

/**
 * @author user208
 *
 */
public class CustomerApplication {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CustomerBusiness cb = new CustomerBusiness();
		Scanner scan =  new Scanner(System.in);
		int option = 0;
		do{
			System.out.println("1. Create Customer");
			System.out.println("2. List Customer");
			System.out.println("3. Update Customer");
			System.out.println("4. Delete Customer");
			System.out.println("Enter user input :-- ");
			option = scan.nextInt();
			switch(option){
			case 1:
				cb.createCustomer();
			    break;
			case 2: 
				cb.listCustomer();	
			    break;
			case 3:
				cb.updateCustomer();
			    break;
			case 4:
				cb.deleteCustomer();
				break;
			}	
		}while(option !=0);
		
	}

}
