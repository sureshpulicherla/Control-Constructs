package ControlConstructAssignments;

import java.util.Scanner;

public class FactorialByRecursion {
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int num = scan.nextInt();                                         // 5
		System.out.println("Factorial of "+num+ " is : "+fact(num));
		scan.close();	
}
static int fact(int num)                         // 5
{
	if (num == 0 ) 							// false
	{
		return 1 ;
		
	}else {
		return (num*fact(num-1));     // (5*(5-1)) -----> (5 * 4 * 3 * 2 * 1) = 20
	}
}
}
