package javaexercises;


import java.util.Random;

public class countOcccurencesLetter {

	public static void main(String[] args) {
		
	
		char [] chars=createArray();
		
		System.out.println("the lowercase letters are: ");
		displayArray(chars);
		
		
		int[] counts=countLetters(chars);
		System.out.println();
		System.out.println("the occurences of each letter are:");
		displayCounts(counts);
 		
	}
	
	
	public static char[] createArray(){
		char[] chars=new char[100];
		
		for(int i=0;i<chars.length;i++)
			chars[i] =getRandomLowerCaseLetter('a','z');
		    
		return chars;
	}
	
	
	public static char getRandomLowerCaseLetter(char ch1,char ch2) {
		 return (char)(ch1 + Math.random() * (ch2-ch1+1));
	}
	
	
	public static void displayArray(char[] array) {
		for(int i=0;i< array.length;i++) {
			if((i+1) % 20 == 0)
				System.out.println(array[i]);
			else {
				System.out.print(array[i] + " ");
			}
			
		}
	}
	
	
	public static int[] countLetters(char[] chars) {
		int[] count=new int[26];
		
		for(int i=0;i<chars.length;i++) {
			count[chars[i] - 'a']++;	
		
		}return count;
		
	}
	
	
	public static void displayCounts(int[] counts) {
		for(int i=0;i<counts.length;i++) {
			if((i+1) % 10 ==0 ) {
				System.out.println(counts[i] + " " +(char)(i + 'a') );
			}else {
				System.out.print(counts[i] + " " +(char)(i + 'a')+ " " );
			}
		}
	}
	
	

}
