package javaexercises;

import java.util.Random;
import java.util.Scanner;

import javax.print.DocFlavor.INPUT_STREAM;
import javax.swing.plaf.basic.BasicInternalFrameTitlePane.IconifyAction;

public class hangman {
	
	// if someone can see the mistake in my code ,i will be glad your feedback 
	
	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		String[] words= {"superman" ,"apple","double","angle","tree","telephone","account"};
		String word= words[(int) Math.random() * words.length];
		String target="";
		
		
		System.out.println("-------------------HANGMAN------------------");
		System.out.println("guess letters in word ,you have 6 change to guess, good luck :)");	
		
		asterisk(word,target);
		
		
		
		}
	
	
	public static void asterisk(String word ,String target) {
		target=new String(new char[word.length()]) .replace('\0','*');
		System.out.print("enter a letter in word: ");
		System.out.println(target);
		
		hang(word ,target);
		
	}
	
	
	public static void hang(String word,String target) {
		Scanner input= new Scanner(System.in);
		String newAsterisk ="";
		int guess=0;
		char letter= input.next().charAt(0);
		for(int i = 0; i < word.length(); i++) {
			if(letter == word.charAt(i) && guess < 6) {
				newAsterisk += letter;
			}else if(word.charAt(i) != '*') {
					newAsterisk += word.charAt(i);		
			}else {
				newAsterisk += '*';
			}
			
		}
		
		if(guess < 6 && newAsterisk.contains("*")) {
			if (target.equals(newAsterisk)) {
				guess++;
				hangman(guess);
			} else {
				target = newAsterisk;
			}
			if (target.equals(word)) {
				System.out.println("Correct! You win! The word was " + word);
			
			}
		}
		
		
	}
	
	
	public static void hangman(int guess) {
		switch(guess) {
		case 1: 
			System.out.println("wrong guess,try again");
			System.out.println("---------------");
		
		case 2:
			System.out.println("wrong guess,try again");
			System.out.println("---------------");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
		case 3:
			System.out.println("wrong guess,try again");
			System.out.println("---------------");
			System.out.println("|      |");
			System.out.println("|      |");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
		case 4:
			System.out.println("wrong guess,try again");
			System.out.println("---------------");
			System.out.println("|      |");
			System.out.println("|      |");
			System.out.println("|      --");
			System.out.println("|     (   )");
			System.out.println("|       -");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			
		case 5:
			System.out.println("wrong guess,try again");
			System.out.println("---------------");
			System.out.println("|      |");
			System.out.println("|      |");
			System.out.println("|      --");
			System.out.println("|     (   )");
			System.out.println("|       -");
			System.out.println("|       |");
			System.out.println("|       |");
			System.out.println("|       |");
			System.out.println("|       |");
			System.out.println("|       |");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
		case 6:
			System.out.println("wrong guess,try again");
			System.out.println("---------------");
			System.out.println("|      |");
			System.out.println("|      |");
			System.out.println("|      --");
			System.out.println("|     (   )");
			System.out.println("|       -");
			System.out.println("|       |");
			System.out.println("|       |");
			System.out.println("|       |");
			System.out.println("|       |");
			System.out.println("|       |");
			System.out.println("|       /\\" );
			System.out.println("|      /  \\ " );
			System.out.println("|     /    \\") ;
			
		case 7:
			System.out.println("GAME OVER");
			System.out.println("---------------");
			System.out.println("|      |");
			System.out.println("|      |");
			System.out.println("|      --");
			System.out.println("|     (   )");
			System.out.println("|       -");
			System.out.println("|     / |\\ ");
			System.out.println("|    /  | \\ ");
			System.out.println("|   /   |  \\ ");
			System.out.println("|       |");
			System.out.println("|       |");
			System.out.println("|       /\\ ");
			System.out.println("|      /  \\ ");
			System.out.println("|     /    \\ ");
			
			
			
	}
	
	
	}	
	
	
	
}
			
	


