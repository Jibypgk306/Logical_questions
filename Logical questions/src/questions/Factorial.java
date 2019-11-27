package questions;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("ENTER VALUE:");
		int fact=1;
		int n=s.nextInt();
		for(int i=1;i<=n;i++)
		{
		 fact=fact*i;
	}
		System.out.printf("%d",fact);
}
}
