package questions;

import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s=new Scanner(System.in);
		System.out.println("ENTER THE NUMBER");
		int a=s.nextInt();
		int b=a;
		int c=a;
		int r;
		int count=0;
		double  sum=0;
		while(c!=0)
		{
			count++;
			c=c/10;
		}
		while(a!=0)
		{
			r=a%10;
			sum=sum+Math.pow(r,count);
			a=a/10;
		}
		System.out.println(sum);
		if(sum==b)
		{
			System.out.println("Armstrong");

		}
		else
		{
			System.out.println("not armstrong");

		}
	}

}
