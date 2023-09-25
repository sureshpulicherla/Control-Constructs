package ControlConstructAssignments;

import java.util.Scanner;

public class FindingBigNumbers {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter three Numbers : ");
	int num1 = scan.nextInt();
	int num2 = scan.nextInt();
	int num3 = scan.nextInt();
	
	if (num1 > num2 && num1>num3) {
		System.out.println(num1);
	}
	else if (num2 > num1 && num2>num3) {
		System.out.println(num2);
	}
	else {
		System.out.println(num3);
	}
	scan.close();
}
}
