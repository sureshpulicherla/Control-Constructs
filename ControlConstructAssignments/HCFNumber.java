package ControlConstructAssignments;

public class HCFNumber {

	public static void main(String[] args) {
		int a = 396 , b = 1080 ;
		int s = 1 ;
		for (int i = 1 ; i <= a && i <= b ; i++ ) {
			if(a%i == 0 && b%i == 0 ) {
				s = i;
			}
		}System.out.println(s);

	}

}
