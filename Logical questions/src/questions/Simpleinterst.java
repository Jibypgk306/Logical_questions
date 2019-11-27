package questions;
import java.util.*;
public class Simpleinterst {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter rate");
		int r=s.nextInt();
		System.out.println("Enter time");
		int n=s.nextInt();
		System.out.println("Enter Principal amnt");
		int p=s.nextInt();
		int si=(p*n*r)/100;
		System.out.println("Simple interst is:"+si);
	}
}
