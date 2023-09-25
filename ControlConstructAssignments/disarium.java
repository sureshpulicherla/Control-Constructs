package ControlConstructAssignments;

import java.util.Scanner;

public class disarium {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a Number : "); //22
		int a = scan.nextInt();
		int r,sum = 0 , temp=a;
		while(a>0) {
			r = a%10;// 2 ,0
			sum = sum+(r*r*r); //0+2*2*2 =8+8
			a = a/10; // 2
			
			
		}if (temp==sum) {
			System.out.println("Its an disarium Number");
		}else {
			System.out.println("Not an Disarium Number");
		}
		scan.close();
	}
}
