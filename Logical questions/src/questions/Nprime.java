package questions;
import java.util.*;
public class Nprime {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=s.nextInt();
		int count=0;
		int i,j;
		for( i=1;i<=n;i++)
		{
			for(j=2;j<i;j++)
			{
				if(i%j==0)
				{
					count=0;
					break;
				}
				else
				{
					count=1;
				}
			}
			if(count==1)
			{
				System.out.println(i);
			}
		}
		
	}

}
