package questions;
import java .util.*;
public class Palistring {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String r="";
		String n=s.next();
		String t=n;
		int length=n.length();
		for(int i=length-1;i>=0;i--)
		{
			r=r+n.charAt(i);
		}
		if(t.equals(r))
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("Not Palindrome");
		}
	
}
}
