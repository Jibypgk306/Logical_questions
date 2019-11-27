package patternn;
import java.util.*;
public class secondcsk {

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
		else if(j==0||j==n-1)
		{
			System.out.print(b);
		}
		else
		{
			System.out.print("*");
		}
	}
	System.out.println();
	}
}
}


