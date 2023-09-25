package ControlConstructAssignments;

public class FibonacciNumber {
	public static void main(String[] args) {
		int a=0 ,b =1 , c= 10 , s;
		System.out.print(a+ " " + b);
		for (int i = 2 ; i<c ; i ++) 
		{
			s = a+b;
			System.out.print(" "+s);
			a = b ;
			b = s ;		
		}
	}
}
