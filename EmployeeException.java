package com.cg.eis.exception;

import java.util.Scanner;

	class EmployeeException extends Exception {
		 
		 public EmployeeException(String str) {
		  System.out.println(str);
		 }

		  public static void main(String[] args) {
		  Scanner s = new Scanner(System.in);
		  System.out.print("Enter ur salary :: ");
		 double salary = s.nextInt();
		  
		  try {
		   if(salary < 3000) 
		    throw new EmployeeException("Low salary!");
		   else
		    System.out.println("High salary!");
		  }
		  catch (EmployeeException a) {
		   System.out.println(a);
		  }
		 }
}
