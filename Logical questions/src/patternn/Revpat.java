package patternn;

import java.util.Scanner;

public class Revpat {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int i,j;
		for(i=1;i<=n;i++)
		{
		for(j=1;j<=n;j++)
			{
if(i==j||j==n-i+1)//first diagonal and second diagonal
				{
					System.out.print("*");
				}
				else
				{
					System.out.print("0");
				}
			}
			System.out.println();
		}
	}
}