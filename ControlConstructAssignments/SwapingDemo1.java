package ControlConstructAssignments;

import java.util.Scanner;

public class SwapingDemo1 {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter First Number : ");
	int num1 = scan.nextInt();   //22
	System.out.println("Enter Second Number : ");
	int num2 = scan.nextInt(); //33
	
	int a = num1;  //a = 22 
	num1 = num2; // num1 = 33
	num2 = a; // num2 = 22
	System.out.println("After Swaping First Number : "+ num1);
	System.out.println("After Swaping Second Number : "+ num2);	
	scan.close();
}
}
