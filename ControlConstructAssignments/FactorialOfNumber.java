package ControlConstructAssignments;

import java.util.Scanner;

public class FactorialOfNumber {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
			System.out.println("Enter the number : "); //5
			int num = scan.nextInt();   
			int i = 1,fact=1; 
			while(i<=num) { //1<5 ---true
				fact = fact*i; //f = 1*1 = 2 * 2 = 4
				i++;	//2 , 3 
			}System.out.println(fact);
			scan.close();
			}
}
