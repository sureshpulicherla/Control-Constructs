package ControlConstructAssignments;

import java.util.Scanner;

public class PrimeByLoop 
{
	public static void main(String[] args)
	{
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter first number : ");
		int num1 = scan.nextInt();
		System.out.println("Enter Second number : ");
		int num2 = scan.nextInt();
		System.out.println("The prime numbers in between "+num1+" and "+num2+" are");
		primeRange(num1,num2);
		scan.close();
	}

public static void primeRange(int num1, int num2) {
		int count = 0;
		 for(int i = num1; i <= num2; i++)
        {
            for( int j = 2; j<i; j++)
            {
                if(i%j == 0)
                {
                	count=0;
                    break;
                }else {
               	 count = 1;
                }
            }if(count == 1)
            	System.out.println(i); 
        }
	} 
}
