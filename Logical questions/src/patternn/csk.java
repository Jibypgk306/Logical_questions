package patternn;
import java.util.*;
public class csk {

	public static void main(String[] args) 
	{
	Scanner s=new Scanner(System.in);
	String str=s.nextLine();
	int n=s.nextInt();
	int i,j,k;
	int l=str.length();
	for(i=0;i<n;i++)
	{
	for(j=0;j<l;j++)
	{
	char ch=str.charAt(j);
	for(k=0;k<i;k++)
		{
			System.out.print(ch);
		}
	}
	System.out.println();
}
	}

}
