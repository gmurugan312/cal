package com.balu.cal.test.classes;

import java.util.Scanner;

public class MyMain {

	
	public static void main(String[] args) {
		try {
			MyCalCulator cal=new MyCalCulator();
			int input1=0;
			int input2=0;
			Scanner scan=new Scanner(System.in);
			System.out.println("Welcome to my calculator app. Operations allowed below.");
			System.out.println("1.Addition");
			System.out.println("2.Substraction");
			System.out.println("3.Multiplication");
			System.out.println("Choose the option you want to perform(1-3) and Enter:");
			int userInput=scan.nextInt();
			if(!(userInput == 1 || userInput == 2 || userInput == 3)) {
				System.out.println("Invalid Input");
				System.exit(1);
			}else {
				System.out.println("Enter two numbers to perform the operation you desired.");
				input1=scan.nextInt();
				input2=scan.nextInt();
			}
				
			if(userInput == 1) 
				System.out.println("Addition is:"+cal.addition(input1, input2));
			if(userInput == 2) 
				System.out.println("Substraction is:"+cal.substraction(input1, input2));
			if(userInput == 3) 
				System.out.println("Multiplication is:"+cal.multiplication(input1, input2));
			
			scan.close();
		}catch(Exception exception) {
			System.out.println("Something went wrong...");
		}finally {
			
		}
	}
}
