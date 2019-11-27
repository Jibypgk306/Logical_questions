package patternn;
import java.util.*;
public class aplpabetpat3 {

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int i,j,k;
		for(i=1;i<=n;i++)
		{
			k=i;
			for(j=1;j<=i;j++,k++)
			{
				System.out.printf("%c",(char)k+64);
			}
			System.out.println();
		}
	}

}
