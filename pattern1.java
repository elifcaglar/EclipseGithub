import java.util.Scanner;



public class pattern1 {

	public static void main(String[] args) {
	
	Scanner input =new Scanner(System.in);

	System.out.print("enter line number : ");
	int line=input.nextInt();
	
	
	System.out.print("choose a pattern : A ,B ,C ,D\npattern : ");
	String pattern =input.next();
	
	switch(pattern) {
	
	   	case "A": 
	   		System.out.println("Pattern A");
	   		
	   		for(int i=1;i<=line;i++) {
	   			System.out.println(" ");
	   			for(int star=0;star<i;star++) {
	   				System.out.print("*");
	   			}
	   		}break;
	   			
	   	case "B":
	   		System.out.println("Pattern B");
	   		
	   		for(int i=1;i<=line;i++) {
	   			for(int star=i;star<=line;star++)
	   			{
	   				System.out.print("*");
	   			}
	   			
	   			System.out.println(" ");
	   		}break;
	   			
	   	
	   	case "C":
	   		System.out.println("Pattern C");
	   		int k=line-1;
	   		for(int i=0;i<line;i++) {
	   			
	   			for(int j=0;j<k;j++) {
	   				System.out.print(" ");
	   			}
	   			k--;
	   			for(int s=0;s<=i;s++) {
	   				System.out.print("*");
	   			}
	   			System.out.println();
	   		}break;
	   
	   	
	   	case "D":
	   		System.out.println("Pattern D");
	   		
	   		for(int i=1;i<=line;i++) {
	   			
	   			for(int bosluk=1;bosluk<i;bosluk++) {
	   				System.out.print(" ");
	   				
	   			}
	   			   for(int star=i;star<=line;star++) {
	   				  System.out.print("*");
	   				
	   			   }
	   			   
	   			System.out.println();	
	   			
	   		}
	
	
	
		}
	}
}
	
	  
	  
