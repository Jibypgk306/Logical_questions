package series;
import java.util.*;
public class replacevow {

	public static void main(String[] args)
	{
	Scanner s=new Scanner(System.in);
	String str1=s.nextLine();
	String str2=s.nextLine();
	String str3=s.nextLine();
	String newstr1 = null;
	String newstr2 = null;
	String newstr3 = null;
	int i,j,k;
	for(i=0;i<str1.length();i++)
	{
		char c=str1.charAt(i);
		if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
		{
			str1=str1.replace(c,'$');
			
		}
	}
	//System.out.println(newstr1);
	for(j=0;j<str2.length();j++)
	{
		char d=str2.charAt(j);
		if(d=='a'||d=='e'||d=='i'||d=='o'||d=='u')
		{
			str2=str2;
		}
		else
		{
			 str2=str2.replace(d,'#');
		}
	}
	//System.out.println(newstr2);
	for(k=0;k<str3.length();k++)
	{
		char e=str3.charAt(k);
		str3=str3.toUpperCase();
		}
	//System.out.println(newstr3);
	String con=str1+str2+str3;
	System.out.println(con);

	}
	}
