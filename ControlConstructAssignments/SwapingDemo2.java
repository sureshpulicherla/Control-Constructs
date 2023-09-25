package ControlConstructAssignments;

import java.util.Scanner;

public class SwapingDemo2 {
public static void main(String[] args) {
	Scanner scan =new Scanner(System.in);
	System.out.println("Enter First Number : ");
	int num1 = scan.nextInt();
	System.out.println("Enter Second Number : ");
	int num2 = scan.nextInt();
	
	num1= num1 + num2 ;//30
	num2 = num1 - num2 ; //10
	num1= num1 - num2 ; // 20
	System.out.println("After Swaping First Number : "+num1);
	System.out.println("After Swaping Second Number : "+num2);
scan.close();	
}
}
