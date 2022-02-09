/**
 * 
 */
package com.lt.business;

import java.util.Scanner;

import com.lt.bean.Customer;

/**
 * @author user208
 *
 */
public class CustomerBusiness {
/*
 * Define Business Methods here 
 * */
	Customer customers[] = new Customer[2];
	Scanner scan =  new Scanner(System.in);
	Scanner scan1 =  new Scanner(System.in);
	
	public void createCustomer(){
		for(int i=0; i<customers.length;i++){
			customers[i] = new Customer();
			System.out.println("Enter CustomerId:  ");
			int customerId = scan.nextInt();
			customers[i].setCustomerId(customerId);
			System.out.println("Enter CustomerName:  ");
			String customerName = scan1.nextLine();
			customers[i].setCustomerName(customerName);
			System.out.println("Enter CustomerAddress:  ");
			String customerAddress = scan1.nextLine();
			customers[i].setCustomerAddress(customerAddress);	
		}
		System.out.println("Records Added Successfully.... ");
		System.out.println("********************************");
	}
	
	public void listCustomer(){
		System.out.println("Records are:- ");
		for(Customer  cust : customers){
	   		System.out.println("List of Customer -->  " +cust.getCustomerId() 
	   		+ " " +cust.getCustomerName()+ " " +cust.getCustomerAddress());
		}	
		System.out.println("********************************");
	}
	
	public void deleteCustomer(){
		boolean found = false;
		System.out.println("Enter CustomerId :- ");
		int customerId = scan.nextInt();
		for(int i=0; i<customers.length;i++){
			if(customers[i].getCustomerId() == customerId){
				customers[i] = customers[i+1];
				found = true;
				break;
			}		
		}
		if(!found){
				System.out.println("Record Not Found");
			}else {
				System.out.println("Record Deleted successfully");
			}
			System.out.println("****************************************");
		}
	
	public void updateCustomer(){
		boolean found = false;
		System.out.println("Enter CustomerId :- ");
		int customerId = scan.nextInt();
		for(int i=0; i<customers.length;i++){
		if(customers[i].getCustomerId() == customerId){
			System.out.println("Enter New CustomerId:  ");
			customerId = scan.nextInt();
			customers[i].setCustomerId(customerId);
			System.out.println("Enter New CustomerName:  ");
			String customerName = scan1.nextLine();
			customers[i].setCustomerName(customerName);
			System.out.println("Enter New CustomerAddress:  ");
			String customerAddress = scan1.nextLine();
			customers[i].setCustomerAddress(customerAddress);
			found = true;
		}if(!found){
			System.out.println("Record Not Found");
		}else {
			System.out.println("Record updated successfully");
		}
		System.out.println("****************************************");
	}	
	}
	
	}
