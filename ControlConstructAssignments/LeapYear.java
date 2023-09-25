package ControlConstructAssignments;

import java.util.Scanner;

public class LeapYear {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter an Year : ");
	int Y = scan.nextInt();
	if (Y%4==0 && Y%100!=0) {
		System.out.println("Leap Year");
	}
	else
	{
		System.out.println("Not A Leap Year");
	}
	scan.close();
}
}
