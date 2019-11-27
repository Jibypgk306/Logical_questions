package patternn;
import java.util.*;
public class helopattern {

	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	String n=s.next();
	int i,j;
	for(i=0;i<=n.length();i++)
	{
		for(j=0;j<i;j++)
		{
			char c=n.charAt(j);
			System.out.print(c+" ");
		}
		System.out.println();
	}
	}
}
