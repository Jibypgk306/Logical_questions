package patternn;
import java.util.*;
public class digitpattern {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int i,j;
		for(i=1;i<=n;i++)
		{
		for(j=1;j<=n;j++)
		{
		if(i==j)
		{
		System.out.print("0");
		}
		else
		System.out.print(i);
		}
		System.out.println();
		}
		System.out.println();
		}
	}


