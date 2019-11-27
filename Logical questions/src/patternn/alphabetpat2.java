package patternn;
import java.util.*;
public class alphabetpat2 {

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int i,j;
		for(i=1;i<=n;i++)
		{
			for(j=1;j<=i;j++)
			{
		System.out.printf("%c",(char)j+64);
			}
			System.out.println();
		}
	}

}
