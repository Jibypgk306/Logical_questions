package questions;
import java.util.*;
public class Lowercase {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		char ch=s.next().charAt(0);
		int temp;
		temp=(int)ch;
		temp=temp+32;
		ch=(char)temp;
		System.out.println(ch);
	}
}