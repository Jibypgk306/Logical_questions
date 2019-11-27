package series;

import java.util.Scanner;

public class series3 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int i,t;
		float a=1;
		float b=2;
		System.out.print(a+" ");
		System.out.print(b+" ");
		for(i=1;i<=n;i++)
		{
			if(i%2==1) 
			{
				a=a*3;
				System.out.printf("%.1f ",a);
			}
			else
			{
				b=b*3;
				System.out.printf("%.1f ",b);
			}
	}
	}
}