package patternn;

import java.util.Scanner;

public class aplphapattern4 {
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int i,j,k;
		for(i=n;i>=1;i--)
		{
			for(j=i;j>=1;j--)
			{
				System.out.printf("%c",(char)j+64);
			}
			System.out.println();
		}
		}
	}
