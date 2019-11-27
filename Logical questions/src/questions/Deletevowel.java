package questions;
import java.util.*;
public class Deletevowel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String str=s.next();
		String a=str.replaceAll("[a,e,i,o,u,A,E,I,O,U]","");
		System.out.println(a);
	}

}
