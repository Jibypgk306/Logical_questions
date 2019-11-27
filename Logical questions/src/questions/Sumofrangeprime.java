package questions;
import java.util.*;
public class Sumofrangeprime {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int m=s.nextInt();
		int n=s.nextInt();
		int sum=0;
		int i,j;
		for( i=m;i<=n;i++)
		{
			for(j=2;j<i;j++)
			{
				if(i%j==0)
				{
					sum=sum+i;
				}
			}
			}
		System.out.println("Sum of prime number:"+sum);
		}
	}
