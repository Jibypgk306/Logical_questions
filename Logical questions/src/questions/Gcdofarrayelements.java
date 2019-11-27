package questions;
import java.util.*;
public class Gcdofarrayelements {

	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the size");
		int n= s.nextInt();
		int[] a= new int[n];
		int i;
		System.out.println("Enter the elements");
		for(i=0;i<n;i++)
		{
		a[i]= s.nextInt();
		}
		int result=a[0];
		for(i=1;i<n;i++)
		{
		if(a[i]%result!=0)
		{
		result= a[i]%result;
		}
		}
		System.out.println(result);
		}
		}


