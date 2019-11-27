package questions;

import java.util.Scanner;

public class SecondGreatest {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter three Numbers...");
		int a=s.nextInt();
		int b=s.nextInt();
		int c=s.nextInt();
		if(a>b && a>c)
		{
			if(b>=c)
			{
			System.out.println("Second number");
		}else
		{
			System.out.println("Third number");
		}
		}
		else if(b>a & b>c)
		{
			if(a>=c)
			{
			System.out.println("First number");
		}
			else
			{
				System.out.println("Third number");	
			}
		}
		else if(a>=b)
		{
			System.out.println("First number");
	}
		else
		{
			System.out.println("Second number");

		}
}
}