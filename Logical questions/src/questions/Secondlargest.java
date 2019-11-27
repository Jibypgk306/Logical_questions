package questions;
import java.util.*;
public class Secondlargest {

	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the size");
	int size=s.nextInt();
	int[]a=new int[size];
	int j;
	System.out.println("enter  array elmentss");
	for(int i=0;i<size;i++)
	{
		a[i]=s.nextInt();
	}
	for(int i=0;i<size;i++)
	{
		for(j=i+1;j<size;j++)
		{
			if(a[i]>a[j])
			{
				int temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
		}
	}
	System.out.println(a[size-2]);
	}
}
