package patternn;
import java.util.*;
public class Patternfib {

	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int i,j;
		for(i=1;i<=n;i++)
		{
			int a=0;
			int b=1;
			for(j=1;j<=i;j++)
			{
				int c=a+b;
				a=b;
				b=c;
				System.out.print(c);
			}
			System.out.println();
		}
	}

}
