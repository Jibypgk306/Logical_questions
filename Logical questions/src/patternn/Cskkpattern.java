package patternn;
import java.util.*;
public class Cskkpattern {

	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		char a='c';
		char b='s';
		char c='k';
		int i,j,k;
		for(i=0;i<=n;i++)
		{
		for(j=0;j<n;j++)
		{
			if(i==0)
			{
				System.out.print(a);
			}
			else if(i==n)
			{
				System.out.print(c);
			}
			else if(j==0||j==n-2)
			{
				System.out.print(a);
			}
			else if(i==0||i==1||j==n-3)
			{
				System.out.print(c);	
			}
			else
			{
				System.out.print("s");
			}
		}
			System.out.println();
		}
		
	}
}
