package ControlConstructAssignments;

public class LcmDemo
{
public static void main(String[] args) 
{
	int a = 8, b = 6;
	int s =0 ;

	for (int i = 1 ; i <= a && i <= b ; i++) 
	{
		if(a%i == 0 && b%i == 0) 
		{
			s = i;
		}
	}
	int lcm = (a*b)/s  ;
	System.out.println("Lcm of the given numbers is: "+lcm);
}
}
