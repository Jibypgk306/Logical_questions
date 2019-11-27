package questions;
import java.util.*;
public class Replacevowels {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int i;
		String str=s.nextLine();
		for( i=1;i<str.length();i++) 
		{
			char c=(char) str.charAt(i);
			if(c=='a'||c=='e'||c=='o'|c=='u')
			{
		        String newString = str.replace(c,' ');
				System.out.print("\n"+newString);
			}
		}
	}
}
