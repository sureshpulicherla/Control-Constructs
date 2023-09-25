package ControlConstructAssignments;

//import java.util.Scanner;

public class Fibonacci 
{
	public static void main(String[] args) 
	{
	//	Scanner scan = new Scanner(System.in);
	//	System.out.println("Enter a number : ");
	//	int num = scan.nextInt();
		int num =10;
		System.out.print( a+ " " + b); // 1 1 1 2 
		fib(num-2);					// 
	}
	
static int a = 0 , b =1 , c  = 0 ;
static void  fib(int num) { 
	 if(num > 0 ) {					//5                 4
		 c = a + b;					//c=0+1 > c=1		c=1+1 ==2
		 a = b ;					// a = b > a= 1		a= 1	
		 b =c ;						// b = 1 			b = 2 
		 System.out.print(" "+c);   //  1				 2
		fib(num -1 );				//(5-1)---> 4		3
	 }
 }
}
