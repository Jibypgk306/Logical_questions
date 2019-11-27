package questions;
import java.util.*;
public class Prime {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int num=s.nextInt();
		int flag = 0;
		for(int i=2;i<num/2;i++)
		{
			if(num%i==0)
			{
				flag=1;
				break;
			}
		}
		if(flag==1)
		{
			System.out.println("Not prime number");
		}
		else
		{
			System.out.println("It is prime number");
		}
	}
}