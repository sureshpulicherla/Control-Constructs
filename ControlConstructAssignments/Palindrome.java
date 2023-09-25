package ControlConstructAssignments;

import java.util.Scanner;

public class Palindrome {
		 public static void main(String[] args) 
		 {
		    Scanner scan = new Scanner(System.in);
		    System.out.println("Enter a number : ");
		    int number = scan.nextInt(); 
		    
		  if(isPalindrome(number))
		    System.out.println("Palindrome");
		  else
		    System.out.println("Not"); 
		 scan.close();}

 public static boolean isPalindrome(int number)
 {
		int temp=number,r=0,sum=0;
		for (;number>0;)             // T
		{				
			r= number % 10; 		// 1 ,4,1  (for getting last value)
			sum = (sum*10)+r ;      // (14*10)+1 = 141
	        number=number/10;   //  1   (storing the remaining numbers)
		}
		return temp==sum;   // 141==141
	
			
 }
}
