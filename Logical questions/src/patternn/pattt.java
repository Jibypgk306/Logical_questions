package patternn;

import java.util.Scanner;

public class pattt {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int i,j,k;
		for(i=1;i<=n;i++)
		{
			for(j=1;j<=i;j++)
			{
				System.out.print(j);
			}
			for(j=i*2;j<n*2;j++)
			{
				System.out.print(" ");
			}
			for(k=i;k>=1;k--)
			{
			System.out.print(k);
			}
			System.out.println();
		}
	}
}
