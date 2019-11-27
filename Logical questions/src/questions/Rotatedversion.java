package questions;
import java.util.*;
public class Rotatedversion {

	public static void main(String[] args) 
	{
	Scanner s=new Scanner(System.in);	
	String str1=s.next();
	String str2=s.next();
	String str3=str1+str2;
	if(str1.length()!=str2.length())
	{
		System.out.println("str1 is not rotated version of str2");
	}
	else if(str1.contains(str2));
	{
		System.out.println("str1 is rotated version of str2");
	}
	}
}