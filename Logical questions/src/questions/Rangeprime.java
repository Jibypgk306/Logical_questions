package questions;
import java.util.*;
public class Rangeprime {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int m=s.nextInt();
		int n=s.nextInt();
		int count=0;
		int i,j;
		for( i=m;i<=n;i++)
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
