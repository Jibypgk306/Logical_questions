package questions;
import java.util.*;
public class Greatest3numbers {

	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter three Numbers...");
		int a=s.nextInt();
		int b=s.nextInt();
		int c=s.nextInt();
		if(a>b && a>c)
		{
			System.out.println("A");
		}
		else if(b>a & b>c)
		{
			System.out.println("B");
		}
		else
			System.out.println("C");

	}

}
