package questions;

import java.util.Scanner;

public class Sumofdigit {

	public static void main(String[] args) {
Scanner s=new Scanner(System.in);
		
		System.out.println("ENTER THE NUMBER");
		int n=s.nextInt();
		int t=n;
		int r=0;
		int a;
		while(n>0)
		{
			a=n%10;
			r=r+a;
			n=n/10;
	}
		System.out.println(r);
}
}
