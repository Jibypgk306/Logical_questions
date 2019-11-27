package questions;

import java.util.Scanner;

public class Stroo {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("ENTER THE NUMBER");
		int a=s.nextInt();
		int b=a;
		int r;
		double  sum=0;
		
		
		while(a!=0)
		{
			int fact=1;
			r=a%10;
			for(int i=1;i<=r;i++)
			{
			 fact=fact*i;
		}
			sum=sum+fact;
			a=a/10;
		}
		if(sum==b)
		{
			System.out.println("strong");

		}
		else
		{
			System.out.println("not strong");

		}
		s.close();
	}

}
