package javaexercises;

import java.util.Scanner;



 public class checkPassword {
	public static void main(String[] args) {
		
	/*(Check password) Some websites impose certain rules for passwords. Write a 
method that checks whether a string is a valid password. Suppose the password 
rules are as follows:
■■ A password must have at least ten characters.
■■ A password consists of only letters and digits.
■■ A password must contain at least three digits.
Write a program that prompts the user to enter a password and displays Valid 
Password if the rules are followed or Invalid Password otherwise.*/

		System.out.print("enter a password: ");
		Scanner input=new Scanner(System.in);
		String password=input.nextLine();
		
		

	System.out.println((isValid(password) ? "Valid " : "Invalid ") + "Password");
	
	
	}
	
	
	
	
	public static boolean isValid(String password) {
		if(
		checkPassword_1(password)&&
		checkPassword_2(password)&&
		checkPassword_3(password))
	return true;
		 return false;
	
	}
	
	
	
	
	public static boolean checkPassword_1(String password) {
		
		int i=0;
		 int passLength=password.length();
		  
		 while(i<=passLength) {
			i++;
		}
	  
		 if(i>=10) {
		   return true;
		 }else {
			return false;
		 }
	}
		
	
	
	
	 public static boolean checkPassword_2(String password) {
		 
		 for(int i=0;i<=password.length();i++) {
			
			 if(!Character.isLetterOrDigit(password.charAt(i))) {
				 return false;
			 }
		}return true;
	 }
	 
	 
	 
	 
	 
	 public static boolean checkPassword_3(String password) {
		
		 int count=0;
		
		 for(int i=0;i<=password.length();i++) {
			 if( password.charAt(i)>='0' && password.charAt(i)<='9' ) {
				 count++;			 }
		 }
		
		 if(count>=3) {
			 return true;
		 }else {
			return false;
		} 
	}
	
	
	
	
}
