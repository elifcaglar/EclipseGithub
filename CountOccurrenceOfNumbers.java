package javaexercises;

import java.util.Scanner;

public class CountOccurrenceOfNumbers {

	public static void main(String[] args) {
		/*(Count occurrence of numbers) Write a program that reads the integers between 
1 and 50 and counts the occurrences of each. Assume the input ends with 0.*/
		 Scanner inputScanner=new Scanner(System.in);
		 
		 
		 int values[]=new int[50];
		 int input=-1;
		 int count=0;
		 System.out.print("enter the integers between 0-50:");

		 while(input!=0) {
			 input=inputScanner.nextInt();
			 values[count]=input;
			 count++;
		 }
		 
		 countOccurrences(values,count);
		 
	}
			
	public static void countOccurrences(int values[],int count) {
		for(int i=0;i<count;i++) {
			int flag=1;
			for(int j=i+1;j<=count;j++) {
			if(values[i] == values[j]) {
				flag++;
			}
			
			}
	
			System.out.printf("%d occurs %d %s\n",values[i],flag,flag>1 ? "times":"time");
		
		
		}
	

	}
}
