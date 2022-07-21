package javaexercises;

import java.util.Scanner;


public class sci_rock_paper {

	public static void main(String[] args) {
	
		Scanner input =new Scanner(System.in);
		
	
		int gamer1_count=0;
		int gamer2_count=0;
		
		
		
		while(gamer1_count<3 || gamer2_count<3) {
			
			System.out.print("enter 1 for scissor\n"
				       + "enter 2 for rock\n"
				       + "enter 3 for paper:");
			
			
			int gamer1_guess=input.nextInt();
			
			switch(gamer1_guess) {
			
			
			case 1:
				System.out.print("gamer1 scissor--");break;
				
			case 2:
				System.out.print("gamer1 rock--");break;
				
			case 3:
				System.out.print("gamer1 paper--");break;
			}
			
			
			int gamer2_guess=(int)Math.random()*3 +1;
			
			switch(gamer2_guess) {
			
			
			case 1:
				System.out.println("gamer2 scissor");break;
				
			case 2:
				System.out.println("gamer2 rock");break;
				
			case 3:
				System.out.println("gamer2 paper");break;
			}
			
			if(gamer1_guess == 1 && gamer2_guess == 3 
					||gamer1_guess== 2 && gamer2_guess==1
					||gamer1_guess==3 && gamer2_guess ==2)
			{
				gamer1_count++;
			
				if(gamer1_count==3) {
					System.out.println("gamer1 win!");break;
				}
			}
			else if(gamer2_guess == 1 && gamer1_guess== 3 
					|| gamer2_guess == 2 && gamer1_guess==1
					||gamer2_guess==3 && gamer1_guess ==2) {
				gamer2_count++;
				if(gamer2_count==3) {
					System.out.println("gamer2 win!");break;
				}
				
				
			}else {
				System.out.println("berabere, devam");
			}
			
			
			
		}
		
		
			
			
			
		}
	}


