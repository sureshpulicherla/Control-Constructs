package ControlConstructAssignments;

import java.util.Scanner;

public class AmstrongNumbers {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter a Number : "); //22
	int a = scan.nextInt();
	int r,sum = 0 , temp=a;
	while(a>0) {
		r = a%10;   // 2 ,0
		sum = sum+(r*r*r*r); //0+2*2*2 =8+8
		a = a/10; // 2
		
		
	}if (temp==sum) {
		System.out.println("Its an Amstrong Number");
	}else {
		System.out.println("Not an Amstrong Number");
	}
	scan.close();
}
}


/*
The number that is equal to the sum of its digits raised to the power of the number of digits.


1. 153 -------- 1^3 + 5^3 + 3^3 = 153 
2. 1634 -------- 1^4+6^4+3^4+4^4 = 1634

*/