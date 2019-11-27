package series;
import java.util.*;
public class numbercaes {

	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Total number of houses");
		int n=s.nextInt();
		int a[]=new int[n];
		int i,j;
		int esum=0;
		int osum=0;
		System.out.println("Money in houses");
		for(i=1;i<n;i++)
		{
			a[i]=s.nextInt();
		}
		for(j=1;j<n;j++)
		{
			if(i%2==0)
			{
				esum=esum+i;
			}
			else 
			{
				osum=osum+i;
			}
		}
		if(esum>osum)
		{
			System.out.println(esum);
		}
		else
		{
			System.out.println(osum);
		}
			}
}
