package series;

import java.util.Scanner;

public class series2 {

	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int i,t;
		for(i=0;i<=n;i++)
		{
			t=11+4*i;
			int h=(int) Math.pow(t, 2);
			System.out.print(h+" ");
	}
}
}
