package questions;
import java.util.*;
public class Gcd {
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int b=s.nextInt();
		int i,gcd = 0;
		for(i=1;i<=a && i<=b;i++)
		{
			if(a%i==0 && b%i==0)
			{
				 gcd=i;
			}
		}
		System.out.println(gcd);
	}
}
