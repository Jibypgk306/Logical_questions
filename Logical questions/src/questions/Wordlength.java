package questions;

import java.util.Scanner;

public class Wordlength {

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter string:");
		String str=s.nextLine();
		int i=0;
		for(char c:str.toCharArray())
		{
			i++;
		}
	System.out.println("Length:"+i);	
	}
}
