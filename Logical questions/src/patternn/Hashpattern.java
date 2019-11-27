package patternn;
import java.util.*;
public class Hashpattern {

	public static void main(String[] args) 
	{
	Scanner s=new Scanner(System.in);
	int n=s.nextInt();
	int i,j;
	for(i=0;i<=n;i++)
	{
		System.out.print("#");	

		for(j=0;j<=2*n+1;j++)
		{
			if(j-i==n||i+j==n)
			{
				System.out.print("*");
			}
			else
			{
				System.out.print("#");
			}
	}
		System.out.println();	
	}
	}
}
