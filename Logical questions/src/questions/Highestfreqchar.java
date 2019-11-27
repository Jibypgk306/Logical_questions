package questions;
import java.util.*;
public class Highestfreqchar {

	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter string:");
		String str=s.nextLine();
		int i;
		int freq=0;
		
		System.out.println("Enter the character:");
		char ch=s.next().charAt(0);
		for(i=0;i<str.length();i++)
		{
		if(ch==str.charAt(i))
		{
			freq++;
			
		}
		}
		System.out.println(freq);
	}
}
