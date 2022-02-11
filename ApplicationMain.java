package com.srs.lt.application;

import java.util.Scanner;

public class ApplicationMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int option = 0;
		do{
			System.out.println("**********************************************");
			System.out.println("Welcome to the menu of CRS Application Portal");	
			System.out.println("Enter 1 for Student");
			System.out.println("Enter 2 for Professor");
			System.out.println("Enter 3 for Admin");
			option = scan.nextInt();
			switch(option){
			case 1:
				System.out.println("**********************************************");
				System.out.println("Student Dashboard");
			    break;
			case 2: 
				System.out.println("**********************************************");
				System.out.println("Professor Dashboard");	
			    break;
			case 3:
				System.out.println("**********************************************");
				System.out.println("Admin Dashboard");
				break;
			}	
		}while(option !=0);
		

	}

}
