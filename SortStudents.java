package javaexercises;


import java.util.Scanner;


/*********************************************************************************
* (Sort students) Write a program that prompts the user to enter the number of  *
* students, the students’ names, and their scores, and prints student names in  *
* decreasing order of their scores.                                             *
*********************************************************************************/


public class SortStudents {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);

		 System.out.println("enter the number of students: ");
		
		 String[] names=new String[input.nextInt()];
		 int[] scores=new int[names.length];
		 
		 System.out.println("enter the each student name and score");
		
		 for(int i=0;i<names.length;i++) {
			 System.out.print(i+1 +". student name: ");
			 names[i]=input.next();
			
			 
			
			 System.out.print(i+1 +". student score: ");
			 scores[i]=input.nextInt();
			 System.out.println();
		 
		 }
		 
		
		 sortDecreasing(names,scores);
		 
		 
		 for(String s:names) {
			 System.out.println(s);
		 }
	}

	
		public static void sortDecreasing(String[] names,int[] scores) {
			for(int i=0;i<scores.length-1;i++) {
				int max=scores[i];
				int maxIndex=i;
				String temp;
				
				
				for(int j=i+1;j<scores.length;j++) {
					if(scores[j]>max)
						max=scores[j];
						maxIndex=j;
						
				}
				
				if(maxIndex != i) {
					//swap string array
					temp=names[i];
					names[i]=names[maxIndex];
					names[maxIndex]=temp;
					
					//swap int array
					scores[maxIndex]=scores[i];
					scores[i]=max;
				}
			
			
			
			
			
			
			}
		
		}
		
}
