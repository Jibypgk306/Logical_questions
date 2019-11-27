package series;
import java.util.*;
public class numserr {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter number");
		int n=s.nextInt();
		int i;
		int res=0;
		for(i=0;i<n;i++)
		{
			if(n % 2 == 1)
			{
			int a = 1;
			int r = 2;
			int x = (n+1)/2;
			 res = 2 * (x-1);
			}
			else
			{
			int a = 1;
			int r = 3;
			int x = n/2;
			res = x-1;
			}
		}
		System.out.println(res);		
	}
}
