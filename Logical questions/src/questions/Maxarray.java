package questions;

import java.util.Scanner;

public class Maxarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter size");
		int size=s.nextInt();
		int []a1=new int[size];
		System.out.println("enter elements");
		for(int i=0;i<size;i++)
		a1[i]=s.nextInt();
		int max=a1[0];
		for(int i=0;i<size;i++)
		if(a1[i]>max)
		{
			max=a1[i];
		}
System.out.println("MAXIMUM NUMBER IS:"+max);
	}

}
