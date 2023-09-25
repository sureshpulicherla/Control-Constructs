package ControlConstructAssignments;

import java.util.Scanner;

public class PrimeNumber {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter a number :  ");
	int n = scan.nextInt();
	IsPrimeOrNot(n);
	scan.close();
}
public static void IsPrimeOrNot(int n) {
	int count =0;
	for(int i = 1 ; i<=n ;i++) {
		if(n%i==0)
			count++;
	}
	if(count == 2)
		System.out.println(n+" is a Prime Number");
	else
		System.out.println(n+" is a Not Prime Number");
}
}
