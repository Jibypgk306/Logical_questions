package questions;
import java.util.*;
public class Sumofprime {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=s.nextInt();
		int i,j,sum=2;
		for( i=1;i<n;i++)
		{
			for(j=2;j<i;j++)
			{
				if(i%j!=0)
				{
					sum=sum+i;
				}
			}
		}
		System.out.println(sum);
	}
}
