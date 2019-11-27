package questions;
import java.util.*;
public class Replacestring {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("EnterString");
		String str =s.nextLine();
	      System.out.println("String: "+str);
System.out.println("Enter position");
	      int pos =s.nextInt();
	      System.out.println("Enter replacing char");
	      char rep = s.next().charAt(0);
String res = str.substring(0, pos) + rep + str.substring(pos + 1);
System.out.println("String after replacing a character: "+res);
	 
	}

}
