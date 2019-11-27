package series;
import java.util.*;
public class series1 {

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int i,t = 0;
		for(i=1;i<n;i++)
		{
			if(i%2==0)
			{
			 t=(i*i)-2;
			 System.out.println(t);

		}
			else
			{
				 t=(i*i)-1;
				 System.out.println(t);

			}
	}
}
}
